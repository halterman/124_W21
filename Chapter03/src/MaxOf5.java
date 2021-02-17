import java.util.Scanner;

public class MaxOf5 {
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
		
		if (num1 >= num2 && num1 >= num3 && num1 >= num4 && num1 >= num5) {
			max = num1;
		} else if (num2 >= num1 && num2 >= num3 && num2 >= num4 && num2 >= num5) {
			max = num2;
		} else if (num3 >= num1 && num3 >= num2 && num3 >= num4 && num3 >= num5) {
			max = num3;
		} else if (num4 >= num1 && num4 >= num2 && num4 >= num3 && num4 >= num5) {
			max = num4;
		} else {
			max = num5;
		}
		
		// Report the result
		System.out.println("The maximum is " + max);
	}
}
