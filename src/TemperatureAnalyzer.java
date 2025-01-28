import java.util.Scanner;

public class TemperatureAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many temperatures do you want to enter?");
        int numTemps = scanner.nextInt();
        double[] temperatures = new double[numTemps];

        for (int i = 0; i < numTemps ; i++) {
            System.out.println("Enter temperature " + (i + 1) + ":");
            temperatures[i] = scanner.nextDouble();
        }

        double sum = 0;
        for (double temp : temperatures) {
            sum += temp;
        }
        double average = sum / numTemps;

        int tempsAboveAverage = 0;
        for (double temp : temperatures) {
            if (temp > average) {
                tempsAboveAverage++;
            }
        }

        System.out.println("Average temperature: " + average);
        System.out.println("Number of temperatures above average: " + tempsAboveAverage);


        scanner.close();


    }
}
