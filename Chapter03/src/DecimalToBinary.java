import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// Get the value from the user
		System.out.print("Please enter an integer in the range 0...1023: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		String bitString = "";   // Start with empty string
		
		// Build the bit string
		if (0 <= number && number < 1024) {
			if (number >= 512) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 512;
			if (number >= 256) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 256;
			if (number >= 128) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 128;
			if (number >= 64) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 64;
			if (number >= 32 ) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 32;
			if (number >= 16) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 16;
			if (number >= 8) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 8;
			if (number >= 4) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 4;
			if (number >= 2) {
				bitString += '1';
			} else {
				bitString += '0';
			}
			number %= 2;
			if (number >= 1) {
				bitString += '1';
			} else {
				bitString += '0';
			}
		}
		
		System.out.println(bitString);
	}

}
