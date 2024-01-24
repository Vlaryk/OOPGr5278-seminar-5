public class Accounting {
    public int calculateNetSalaryEmployee(int baseSalary) {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
