package Model;

import java.util.List;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

public class ModelClass implements iGetModel {

    private List<Student> students;

    public ModelClass(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents()
    {
        return students;
    }

    @Override
    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                Student stud = students.remove(i);
                System.out.println("Студент " + stud + "удален");
            }
        }
    }

}
