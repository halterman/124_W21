public class DecimalToBinaryWithLoop {

	public static void main(String[] args) {
		// We will repair this!
		int count = 0;
		final int MAX = 8192;
		while (count < MAX) {
			String bitString = "";
			// Build the bit string
			int number = count;
			if (0 <= number && number < MAX) {
				int placeValue = MAX/2;
				while (placeValue > 0) {
					bitString += (char)('0' + number/placeValue);
					number %= placeValue;
					placeValue /= 2;
				}
			}

			System.out.println("***" + bitString);
			
			count++;
		}
	}

}
