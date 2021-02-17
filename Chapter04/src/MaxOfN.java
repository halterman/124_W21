import java.util.Scanner;

public class MaxOfN {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter numbers (999 terminates): ");
		int input;
		int max;
		input = scan.nextInt();
		max = input;
		while (input != 999 ) {
			input = scan.nextInt();
			if (input > max && input != 999) {
				max = input;
			}
		}
		scan.close();
		if (max != 999) {
			System.out.println("The maximum number entered was " + max);
		} else {
			System.out.println("No numbers entered");
		}
	}
}
