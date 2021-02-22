import java.util.Scanner;

public class AverageNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, n4, n5;
		System.out.print("Please enter 5 numbers: ");
		// Allow the user to enter in the five values.
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		n4 = scan.nextDouble();
		n5 = scan.nextDouble();
		scan.close();
		System.out.println("The average of " + n1 + ", " + n2 + ", " 
		                   + n3 + ", " + n4 + ", " + n5 + " is "
				           + (n1 + n2 + n3 + n4 + n5) / 5);
	}
}
