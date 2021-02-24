import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNumbersIntoArrayFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		// Get the array's size 
		File f = new File("data.text");
		Scanner scan = new Scanner(f);
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