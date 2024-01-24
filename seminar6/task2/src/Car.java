public class Car implements Vehicle {
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public double speedLimiter() {
        return 0.8;
    }


}
