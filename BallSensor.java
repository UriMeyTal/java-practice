public class BallSensor extends BaseSensor {
    
    public BallSensor(String name) {
        super(name);
    }
    
    public boolean haveBall() {
        double value = readValue();
        if (value == -1) {
            return false;
        }
        return value > 0.9;
    }
}
