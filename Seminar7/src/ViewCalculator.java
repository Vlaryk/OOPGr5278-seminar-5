import java.util.Scanner;

public class ViewCalculator {

    ComplexNumber cn1 = new ComplexNumber(0,0);
    ComplexNumber cn2 = new ComplexNumber(0,0);
    iCalculator calc;

    public ViewCalculator(iCalculator calc) {
        this.calc = calc;
    }

    public void run() {
        while (true) {
            cn1.setRealNumber(Double.parseDouble(prompt("Введите вещественную часть первого аргумента: ")));
            cn1.setImaginaryNumber(Double.parseDouble(prompt("Введите мнимую часть первого аргумента: ")));
            String action = prompt("Введите действие +, *, /: ");
            if (!action.equals("+") && !action.equals("*") && !action.equals("/")) {
                System.out.println("Вы не корректно ввели действие");
                continue;
            }
            cn2.setRealNumber(Double.parseDouble(prompt("Введите вещественную часть второго аргумента: ")));
            cn2.setImaginaryNumber(Double.parseDouble(prompt("Введите мнимую часть второго аргумента: ")));
            if (action.equals("+")) {
                calc.setCn1(cn1);
                calc.setCn2(cn2);
                calc.sum();
            } else if (action.equals("*")) {
                calc.setCn1(cn1);
                calc.setCn2(cn2);
                calc.multi();
            } else {
                calc.setCn1(cn1);
                calc.setCn2(cn2);
                calc.divide();
            }
            action = prompt("Выберите действие: Y - начать зано,  N - Выйти из приложения").toLowerCase();
            if (action.equals("n")) {
                break;
            }
        }
    }

    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }

}