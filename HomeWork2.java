
public class HomeWork2 {
public static void main(String[] args) {    
    int[] sensorReadings = new int[1000];
    for (int i = 0; i < sensorReadings.length; i++) {
        sensorReadings[i] = (int)(Math.random() * 1000);
       
    }
    int minValue = sensorReadings[0];   
    for (int i = 1; i < sensorReadings.length; i++) {
            if (sensorReadings[i] < minValue) {
                minValue = sensorReadings[i];
            }
        }
        int maxValue = sensorReadings[0];
        for (int i = 1; i < sensorReadings.length; i++) {
            if (sensorReadings[i] > maxValue) {
                maxValue = sensorReadings[i];
            }
        }
        double sum = 0;
        for (int i = 0; i < sensorReadings.length; i++) {
            sum += sensorReadings[i];    
        }
        double average = sum / sensorReadings.length;
        double averageWithoutMinMax = (sum - minValue - maxValue) / (sensorReadings.length - 2);
        System.out.println("Average without min and max: " + averageWithoutMinMax);

        int numbersOfExceptions = 0;
        int[] ExceptionsNums = new int[sensorReadings.length];
        for (int i = 0; i < sensorReadings.length; i++) {
            if (sensorReadings[i] > 1.5*average || sensorReadings[i]< 0.25*average) {
                ExceptionsNums[i] = sensorReadings[i];
                numbersOfExceptions++;
                
        }
        
        
}
int[] goodNumbers = new int[1000- numbersOfExceptions];
int index = 0;
for (int j = 0; j < sensorReadings.length; j++) { 
    if (sensorReadings[j] <= 1.5 * average && sensorReadings[j] >= 0.25 * average) {
        goodNumbers[index++] = sensorReadings[j];
    }

}
System.out.println("The minimum sensor reading is: " + minValue);
System.out.println("The maximum sensor reading is: " + maxValue);
System.out.println("The average sensor reading is: " + average);
System.out.println("The average sensor reading without min and max is: " + averageWithoutMinMax);
System.out.println("The number of exceptions numbers is: " + numbersOfExceptions);

System.out.println("Values of regular numbers:");
for (int i = 0; i < goodNumbers.length; i++) {
    System.out.print(goodNumbers[i]);
        System.out.print(", ");
    }
}
}

