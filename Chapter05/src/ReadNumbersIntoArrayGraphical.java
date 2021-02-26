import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ReadNumbersIntoArrayGraphical {
	public static void main(String[] args) throws FileNotFoundException {
		// Get the array's size 
		JFileChooser dialog = new JFileChooser();
		dialog.showOpenDialog(null);
		File f = dialog.getSelectedFile();
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
		System.out.println(Arrays.toString(numbers));
//		String str = Arrays.toString(numbers);
//		JOptionPane.showMessageDialog(null, str);
		Plotter.plot(numbers, 800, 300);
		
	}
}