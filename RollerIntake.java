public class RollerIntake {
    public class Main {
        public static void main(String[] args) {
            RollerIntake intake = new RollerIntake();
            intake.collectBall();
        }
    }
    private Motor rollerMotor;
    private Motor deployMotor;

    private BallSensor finalSensor;
    private LimitSensor foldedSensor;
    private LimitSensor deployedSensor;

    public RollerIntake() {
        rollerMotor = new Motor("Roller");
        deployMotor = new Motor("Deploy");

        finalSensor = new BallSensor("Final");
        foldedSensor = new LimitSensor("Folded");
        deployedSensor = new LimitSensor("Deployed");

        finalSensor.calibrate();
        foldedSensor.calibrate();
        deployedSensor.calibrate();
    }

    public void collectBall() {
        deployMotor.setPower(1.0);
        while (!deployedSensor.atLimit()) {}
        deployMotor.stop();

        rollerMotor.setPower(1.0);
        while (!finalSensor.haveBall()) {}
        rollerMotor.stop();

        deployMotor.setPower(-1.0);
        while (!foldedSensor.atLimit()) {}
        deployMotor.stop();
    }
}