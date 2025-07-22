import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("What is the current battery voltage?");
    double batteryVoltage = scanner.nextDouble();
     while (true) {
    if (batteryVoltage>=12.6) {
    System.out.println("The voltage is high enough, no need to charge.");
        break;
    }
    else{
        int cycles = 0;
        while (batteryVoltage < 12.6) {
            double increasedVolt = 0.06 + 0.05 * (13.0 - batteryVoltage);
            batteryVoltage += increasedVolt;
            cycles++;
            if (cycles % 3 == 0) {
                System.out.println(" The current battery voltage is now : " + batteryVoltage + "V" + " after " + cycles + " cycles of charging.");
                
            }
            

    }
                System.out.println("Number of cycles needed to charge the robot fully: " + cycles);
            scanner.close();
     }
    }
}
}