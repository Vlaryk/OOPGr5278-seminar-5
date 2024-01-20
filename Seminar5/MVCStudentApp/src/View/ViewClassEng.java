package View;

import Controller.Interfaces.iGetController;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

public class ViewClassEng implements iGetView{

    public void printAllStudent(List<Student> students)
    {
        System.out.println("-------------list of students------------");
        for(Student s: students)
        {
            System.out.println(s);
        }
        System.out.println("----------------------------------------");
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
