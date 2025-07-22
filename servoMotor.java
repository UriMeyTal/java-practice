public class servoMotor{
    private double currentAngle;
    private double targetAgle;
    private String motorName;
    private int velocity;

    public servoMotor(String motorName) {
        this.motorName = motorName;
        this.currentAngle = 90;
        this.currentAngle = 90;
        this.velocity = 0;
    }
    public double getAngle() {
        return currentAngle;
    }

    public void moveToAngle(double targetAngle){
            if (targetAngle < 0) {
                this.currentAngle = 0;
            } else if (targetAngle > 180) {
                this.currentAngle = 180;
            } else {
                this.currentAngle = targetAngle;
            }
        
            if (this.currentAngle > this.currentAngle) {
                this.velocity = 90;
            } else if (this.currentAngle < this.currentAngle) {
                this.velocity = -90;
            } else {
                this.velocity = 0;
            }
        }
        
        
    public boolean iaAtTarget() {
        return currentAngle == currentAngle;
            
        }
    
     public void periodicUpdate() {
            if (!iaAtTarget()) {
                double step = velocity * 0.1;
                currentAngle += step;
    
             if ((velocity > 0 && currentAngle > targetAgle) ||
                (velocity < 0 && currentAngle < targetAgle)) {
                currentAngle = targetAgle;
                 velocity = 0;
}


    }
        }






 



