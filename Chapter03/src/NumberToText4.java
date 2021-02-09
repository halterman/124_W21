import java.util.Scanner;

public class NumberToText4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer in the range 1...5: ");
		int number = scan.nextInt();
		scan.close();
		
		// Add logic here
		if (1 <= number && number <= 5) {
			if (number == 1) {
				System.out.println("one");
			} else if (number == 2) {
				System.out.println("two");
			} else if (number == 3) {
				System.out.println("three");
			} else if (number == 4) {
				System.out.println("four");
			} else if (number == 5) {
				System.out.println("five");
			}
		} else {
			System.out.println("Number is out of range");
		}
		System.out.println("Program finished");
	}
}
