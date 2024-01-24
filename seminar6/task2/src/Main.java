public class Main {
    public static void main(String[] args) {
        SpeedCalculation calc = new SpeedCalculation();
        Car car = new Car(220);
        Bus bus = new Bus(160);

        System.out.println(calc.calculateAllowedSpeed(car));
        System.out.println(calc.calculateAllowedSpeed(bus));
    }
}