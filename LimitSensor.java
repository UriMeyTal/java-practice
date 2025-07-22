public class LimitSensor extends BaseSensor {
    
    public LimitSensor(String name) {
        super(name);
    }
    
    public boolean atLimit() {
        double value = readValue();
        if (value == -1) {
            return false;
        }
        return value > 0.9;
    }
}