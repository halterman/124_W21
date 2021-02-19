import java.util.Scanner;

public class MaxOfNwithBreak {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter numbers (999 terminates): ");
		int input;
		int max = Integer.MIN_VALUE;
		while (true) {
			input = scan.nextInt();
			if (input == 999) {
				break;
			}
			if (input > max) {
				max = input;
			}
		}
		scan.close();
		if (max != Integer.MIN_VALUE) {
			System.out.println("The maximum number entered was " + max);
		} else {
			System.out.println("No numbers entered");
		}
	}
}
