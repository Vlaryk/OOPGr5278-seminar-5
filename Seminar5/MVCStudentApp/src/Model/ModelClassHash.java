package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывающий добавление студента в HashMap
 */
public class ModelClassHash implements iGetModel {

    private HashMap<Integer, Student> students;

    /**
     * Конструктор класса ModelClassHash
     * @param students HashMap со студентами
     */
    public ModelClassHash(HashMap<Integer, Student> students) {
        this.students = students;
    }


    /**
     * @return возвращает список студентов
     */
    public List<Student> getStudents()
    {
        return new ArrayList<>(students.values());
    }

    /**
     * удаляет студента
     * @param id id удаляемого студента
     */
    @Override
    public void deleteStudent(int id) {
        ArrayList<Integer> listKeys = new ArrayList<>(students.keySet());
        for (Integer i : listKeys) {
            if (students.get(i).getId() == id) {
                Student stud = students.remove(i);
                System.out.println("Студент " + stud + "удален");
            }
        }
    }

}
