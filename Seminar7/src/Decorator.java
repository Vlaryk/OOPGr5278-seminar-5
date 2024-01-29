public class Decorator implements iCalculator {
    private CalculatorComplexNumber calc;
    private Logger log;
    private ComplexNumber cn1;
    private ComplexNumber cn2;
    public Decorator(CalculatorComplexNumber calc, Logger log) {
        this.calc = calc;
        this.log = log;
    }

    @Override
    public void sum() {
        log.log("Производится вызов метода sum c аргументами: Первый аргумент - " + cn1 +  "; Второй аргумент - " + cn2);
        calc.setCn1(cn1);
        calc.setCn2(cn2);
        calc.sum();
    }

    @Override
    public void multi() {
        log.log("Производится вызов метода multi c аргументами: Первый аргумент - " + cn1 +  "; Второй аргумент - " + cn2);
        calc.setCn1(cn1);
        calc.setCn2(cn2);
        calc.multi();
    }

    @Override
    public void divide() {
        log.log("Производится вызов метода divide c аргументами: Первый аргумент - " + cn1 +  "; Второй аргумент - " + cn2);
        calc.setCn1(cn1);
        calc.setCn2(cn2);
        calc.divide();
    }

    @Override
    public void setCn2(ComplexNumber cn2) {
        this.cn2 = cn2;
    }

    @Override
    public void setCn1(ComplexNumber cn1) {
        this.cn1 = cn1;
    }
}
