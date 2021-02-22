import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int NUMBER_OF_ENTRIES = 5;
		double[] numbers = new double[NUMBER_OF_ENTRIES];
		double sum = 0.0;
		System.out.print("Please enter " + NUMBER_OF_ENTRIES + " numbers: ");

		// Allow the user to enter the values.
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextDouble();
			sum += numbers[i];
		}
		scan.close();

		// Print the results
		System.out.print("The average of " + numbers[0]);
		for (int i = 1; i < numbers.length; i++) {
			System.out.print(", " + numbers[i]);
		}
		System.out.println(" is " + sum / NUMBER_OF_ENTRIES);
	}
}