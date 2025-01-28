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

        scanner.close();


    }
}
