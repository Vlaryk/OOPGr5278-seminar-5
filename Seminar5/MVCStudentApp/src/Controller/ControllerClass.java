package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

/**
 * Контроллер
 */
public class ControllerClass implements iGetController {

    private ArrayList<iGetModel> models = new ArrayList<>();
//    private iGetModel model;
    private iGetView view = new ViewClass();
    private List<Student> studBuffer = new ArrayList<>();


    /**
     * Добавляет модель в контроллер
     * @param model модель
     */
    public void addModel(iGetModel model) {
        this.models.add(model);
    }

    /**
     * Проверяет ести ли студенты в списке
     * @param stud список студентов
     * @return true или false
     */
    private boolean tesdData(List<Student> stud)
    {
        if(stud.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update(String Request)
    {
        //MVP
        for (iGetModel model : models) {
            studBuffer = model.getStudents();
            if(tesdData(studBuffer))
            {
                view.printAllStudent(studBuffer);
            }
            else
            {
                System.out.println("Список студентов в модели: " + model + " пуст!");
            }
        }


        //MVC
        //view.printAllStudent(model.getStudents());
    }


    /**
     * Запускает контроллер
     */
    public void run()
    {   Scanner scan = new Scanner(System.in);
        System.out.println("Choose language\nВыберите язык\nru, eng:");

        String language = scan.nextLine();
        if (language.equals("eng")) {
             view = new ViewClassEng();
        }
        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt("Введите команду:");
            com = Command.valueOf(command.toUpperCase());
            switch(com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    for (iGetModel model : models) {
                        view.printAllStudent(model.getStudents());
                    }
                    break;
                case DELETE:
                    boolean bool = false;
                    int num = Integer.parseInt(view.prompt("Укажите номер удаляемого студента:"));
                    for (iGetModel model : models) {
                        studBuffer = model.getStudents();
                        int i = model.getStudents().size();
                        if (tesdData(studBuffer)) {
                            model.deleteStudent(num);
                            if (model.getStudents().size() < i) {
                                bool = true;
                                break;
                            }
                        }
                    }
                    if (!bool) {
                        System.out.println("Студент не найден");
                    }
            }
        }
    }
}
