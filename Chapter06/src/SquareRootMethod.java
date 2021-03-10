import java.util.Scanner;

public class SquareRootMethod {

	public static void main(String[] args) {
		// Get the user's input value
		Scanner scan = new Scanner(System.in);
		double i = scan.nextDouble();
		scan.close();
		
		// Compute the square root of the user's input
		double r = MyMath.squareRoot(i);
		System.out.printf("%.3f: %.3f%n", i, r);

	}

}
