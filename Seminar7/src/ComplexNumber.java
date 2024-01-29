public class ComplexNumber {
    private double realNumber;
    private double imaginaryNumber;


    public ComplexNumber(double realNumber, double imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    public double getRealNumber() {
        return realNumber;
    }

    public void setRealNumber(double realNumber) {
        this.realNumber = realNumber;
    }

    public double getImaginaryNumber() {
        return imaginaryNumber;
    }

    public void setImaginaryNumber(double imaginaryNumber) {
        this.imaginaryNumber = imaginaryNumber;
    }

    @Override
    public String toString() {
        return "Вещественное число: " + realNumber + ", мнимое число: " + imaginaryNumber;
    }
}
