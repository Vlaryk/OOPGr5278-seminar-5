package Controller.Interfaces;

import java.util.List;

import Model.Domain.Student;


/**
 * Интерфейс описывающий модель
 */
public interface iGetModel {

   /**
    * @return возвращает список студентов
    */
   public List<Student> getStudents();

   /**
    * Метод удаляющий студента из списка
    * @param id id удаляемого студента
    */
   public void deleteStudent(int id);
}
