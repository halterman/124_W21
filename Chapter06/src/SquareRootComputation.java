import java.util.Scanner;

public class SquareRootComputation {

	public static void main(String[] args) {
		// Get the user's input value
		Scanner scan = new Scanner(System.in);
		double i = scan.nextDouble();
		scan.close();
		
		// Compute the square root of the user's input
		double r = 1.0;
		// While r squared is not close enough to i
		while (Math.abs(r*r - i) > 0.0001) {
			r = (r + i/r)/2;
		}
		System.out.printf("The square root of %.3f is %.3f%n",
				           i, r);

	}

}
