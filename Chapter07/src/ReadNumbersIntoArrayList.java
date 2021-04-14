import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadNumbersIntoArrayList {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("data.text");
		Scanner scan = new Scanner(f);
		// Create the array
		var numbers = new ArrayList<Integer>();
		
		// Populate the array list
		while (scan.hasNext()) {
			numbers.add(scan.nextInt());
		}
		scan.close();

		// Print the array list
		System.out.println(numbers);
	}
}