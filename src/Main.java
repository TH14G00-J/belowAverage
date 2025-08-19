import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many elements will the array have? ");
        int n = sc.nextInt();

        double[] numbers =  new double[n];
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = sc.nextDouble();
            sum += numbers[i];
        }

        double average  = sum / numbers.length;

        System.out.printf("ARRAY AVERAGE = %.3f\n",  average);

        System.out.println("ELEMENTS BELOW AVERAGE:");
        for (double num : numbers) {
            if (num < average ) {
                System.out.printf("%.1f\n", num);
            }
        }
        sc.close();
    }
}