public class Motor {
    private double power = 0.0;
    private String name;
    public Motor(String name) {
        this.name = name;
    }
    public void setPower(double power) {
        this.power = power;
    }

    public void stop() {
        this.power = 0.0;
    }
}