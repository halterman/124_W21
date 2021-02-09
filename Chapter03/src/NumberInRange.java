import java.util.Scanner;

public class NumberInRange {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer in the range 1...10: ");
		int num = scan.nextInt();
		scan.close();
		
		// Add logic here
		if (num < 1) {
			System.out.println("The number you entered is too low");
		} else {
			if (num > 10) {
				System.out.println("The number you entered is too high");
			} else {
				System.out.println("The number you entered is okay");
			}
		}

	}
}
