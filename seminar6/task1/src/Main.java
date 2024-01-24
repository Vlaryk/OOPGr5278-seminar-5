import javax.xml.crypto.Data;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        Date date = new Date(87, 2,12);
        Accounting accounting = new Accounting();
        Employee emp = new Employee("Ivan",date,20000);

        System.out.println(accounting.calculateNetSalaryEmployee(emp.getBaseSalary()));

    }
}