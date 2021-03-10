
public class MyMath {
	public static double squareRoot(double x) {
		// Compute the square root of the user's input
		double r = 1.0;
		// While r squared is not close enough to i
		while (Math.abs(r*r - x) > 0.0001) {
			r = (r + x/r)/2;
		}
		return r;
	}
}
