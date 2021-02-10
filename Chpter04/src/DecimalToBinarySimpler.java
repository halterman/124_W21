public class DecimalToBinarySimpler {

	public static void main(String[] args) {
		// We will repair this!
		int number = 0;
		while (number < 10) {
			String bitString = "";
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
			
			number++;
		}
	}

}
