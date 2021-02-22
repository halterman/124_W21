import java.util.Scanner;

public class AverageNumbers2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		final int NUMBER_OF_ENTRIES = 5;
		double sum = 0.0;
		System.out.print("Please enter " + NUMBER_OF_ENTRIES + " numbers: ");
		// Allow the user to enter in the five values.
		for (int i = 0; i < NUMBER_OF_ENTRIES; i++) {
			sum += scan.nextDouble();
		}
		scan.close();
		System.out.println("The average of the " + NUMBER_OF_ENTRIES 
				           + " values is " + sum / NUMBER_OF_ENTRIES);
	}
}
