import java.util.Scanner;

public class ReadNumbersIntoArray {
	public static void main(String[] args) {
		// Get the array's size 
		Scanner scan = new Scanner(System.in);
		int numberOfEntries = scan.nextInt();
		// Create the array
		int[] numbers = new int[numberOfEntries];
		
		// Populate the array
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scan.nextInt();
		}
		scan.close();

		// Print the array
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
	}
}