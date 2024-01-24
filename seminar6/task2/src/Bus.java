public class Bus implements Vehicle {
    private int maxSpeed;

    public Bus(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String getType() {
        return "Bus";
    }

    @Override
    public double speedLimiter() {
        return 0.6;
    }
}
