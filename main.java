
public class main {
public static void main(String[] args) {
GameController control = new GameController();
    servoMotor servo1 = new servoMotor("Servo1");
    servoMotor servo2 = new servoMotor("Servo2");
    int cycles = 0;
    for (int i = 0; i < 50; i++) {
        for (int j = 0; j <=3; j++) {
            boolean randomState = Math.random() < 0.5;
    control.setButton(j, randomState);
        }
        
        if (control.isPressed(0)) {
            servo1.moveToAngle(0);
            servo2.moveToAngle(180);
        } else if (control.isPressed(1)) {
            servo2.moveToAngle(45);
        } else if (control.isPressed(2)) {
            servo1.moveToAngle(135);
        } else if (control.isPressed(3)) {
            servo1.moveToAngle(90);
            servo2.moveToAngle(90);

            
        }
        cycles++;
    
    servo1.periodicUpdate();
    servo2.periodicUpdate();
    System.out.println(cycles + " cycles completed."  );
    for (int k = 0; k <=3; k++) {
        if (control.isPressed(k)) {
            System.out.println("Button " + k + " is pressed.");

        }

    }
    System.out.println("Servo1 angle: " + servo1.getAngle() + " degrees.");
    System.out.println("Servo2 angle: " + servo2.getAngle() + " degrees.");
    
}
}
}
