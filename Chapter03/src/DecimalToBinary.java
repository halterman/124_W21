import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.print("Please enter an integer in the range 0...1023: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		String bitString = "";   // Start with empty string
		
		// Add logic here 
		
		System.out.println(bitString);
	}

}
