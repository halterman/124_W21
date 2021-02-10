import java.util.Scanner;

public class DecimalToBinarySimpler {

	public static void main(String[] args) {
		// Get the value from the user
		System.out.print("Please enter an integer in the range 0...1023: ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		String bitString = "";   // Start with empty string
		
		// Build the bit string
		if (0 <= number && number < 1024) {
			bitString += (char)('0' + number/512);
			number %= 512;
			bitString += (char)('0' + number/256);
			number %= 256;
			bitString += (char)('0' + number/128);
			number %= 128;
			bitString += (char)('0' + number/64);
			number %= 64;
			bitString += (char)('0' + number/32);
			number %= 32;
			bitString += (char)('0' + number/16);
			number %= 16;
			bitString += (char)('0' + number/8);
			number %= 8;
			bitString += (char)('0' + number/4);
			number %= 4;
			bitString += (char)('0' + number/2);
			number %= 2;
			bitString += (char)('0' + number/1);
		}
		
		System.out.println("[" + bitString + "]");
	}

}
