package View;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

/**
 *Класс описывающий то что выдается на экран на английском
 */
public class ViewClassEng implements iGetView{

    /**
     * Печатает список студентов
     * @param students список студентов
     */
    public void printAllStudent(List<Student> students)
    {
        System.out.println("-------------list of students------------");
        for(Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    /**
     * Метод позволяющий выводить сообщение консолью, запрашивая ввод от пользователя
     * @param msg сообщение выводимое консолью
     * @return возвращает то что ввел пользователь
     */
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
