package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;


/**
 * Интерфейс описывающий то что выводится на экран
 */
public interface iGetView {

    /**
     * Метод показывающий всех студентов
     * @param students список студентов
     */
    public void printAllStudent(List<Student> students);

    /**
     * Метод позволяющий выводить сообщение консолью, запрашивая ввод от пользователя
     * @param msg сообщение выводимое консолью
     * @return возвращает то что ввел пользователь
     */
    public String prompt(String msg);
    
}
