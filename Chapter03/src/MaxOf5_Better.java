import java.util.Scanner;

public class MaxOf5_Better {
	public static void main(String[] args) {
		// Get the five numbers from the user
		int num1, num2, num3, num4, num5, max;
		Scanner input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		input.close();
		
		max = num1;        // This is the biggest I've seen so far
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		if (num4 > max) {
			max = num4;
		}
		if (num5 > max) {
			max = num5;
		}
		
		// Report the result
		System.out.println("The maximum = " + max);
	}
}
