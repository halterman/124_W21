import java.util.Scanner;

public class SquareRootMethod2 {
	
	private static double sqRoot(double x) {
		// Compute the square root of the user's input
		double r = 1.0;
		// While r squared is not close enough to i
		while (Math.abs(r*r - x) > 0.0001) {
			r = (r + x/r)/2;
		}
		return r;
	}	

	public static void main(String[] args) {
		// Get the user's input value
		Scanner scan = new Scanner(System.in);
		double i = scan.nextDouble();
		scan.close();
		
		// Compute the square root of the user's input
		double r = sqRoot(i);
		System.out.printf(">>>> %.3f: %.3f%n", i, r);

	}

}
