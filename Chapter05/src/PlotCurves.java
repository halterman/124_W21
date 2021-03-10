public class PlotCurves {
	public static void main(String[] args) {
		// Get the array's size 
		// Create the array
		double[] numbers = new double[100];
		
		// Populate the array
		for (int i = 0; i < numbers.length; i++) {
			double x = i - 50;
//			numbers[i] = 2 *x * x;
			numbers[i] = 0.1 * Math.sin(x);
		}

		Plotter.plot(numbers, 500, 500);
	}
}