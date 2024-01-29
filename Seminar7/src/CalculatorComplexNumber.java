import java.text.DecimalFormat;

public class CalculatorComplexNumber implements iCalculator {
    DecimalFormat df = new DecimalFormat();
    private ComplexNumber cn1;
    private ComplexNumber cn2;

    public CalculatorComplexNumber() {
//        this.cn1 = new ComplexNumber(0,0);
//        this.cn1 = cn1;
//        this.cn2 = cn2;
    }

    @Override
    public void sum() {
        ComplexNumber cn3 = new ComplexNumber(cn1.getRealNumber() + cn2.getRealNumber(),cn1.getImaginaryNumber() + cn2.getImaginaryNumber());
        System.out.println("Вещественная часть: " + df.format(cn3.getRealNumber()) + ", мнимая часть: " + df.format(cn3.getImaginaryNumber()) + "i");
    }

    @Override
    public void multi() {
        ComplexNumber cn3 = new ComplexNumber(cn1.getRealNumber() * cn2.getRealNumber() - cn1.getImaginaryNumber() * cn2.getImaginaryNumber(),
                cn1.getImaginaryNumber() * cn2.getRealNumber() + cn1.getRealNumber() * cn2.getImaginaryNumber());
        System.out.println("Вещественная часть: " + df.format(cn3.getRealNumber()) + ", мнимая часть: " + df.format(cn3.getImaginaryNumber()) + "i");
    }

    @Override
    public void divide() {
        if (cn2.getRealNumber() + cn2.getImaginaryNumber() == 0) {
            System.out.println("Знаменатель не может быть равен нулю");
            return;
        }
        ComplexNumber cn3 = new ComplexNumber((cn1.getRealNumber() * cn2.getRealNumber() + cn1.getImaginaryNumber() * cn2.getImaginaryNumber())
                / (cn2.getRealNumber() * cn2.getRealNumber() + cn2.getImaginaryNumber() * cn2.getImaginaryNumber()),
                (cn1.getImaginaryNumber() * cn2.getRealNumber() - cn1.getRealNumber() * cn2.getImaginaryNumber())
                / (cn2.getRealNumber() * cn2.getRealNumber() + cn2.getImaginaryNumber() * cn2.getImaginaryNumber()));
        System.out.println("Вещественная часть: " + df.format(cn3.getRealNumber()) + ", мнимая часть: " + df.format(cn3.getImaginaryNumber()) + "i");
    }

    public void setCn2(ComplexNumber cn2) {
        this.cn2 = cn2;
    }

    public void setCn1(ComplexNumber cn1) {
        this.cn1 = cn1;
    }
}
