package rationalNumbers2;

/**
 * The {@code Rational} class represents a mathematical 
 * rational numbers (fractions).
 * 
 * This is our second version.
 *
 */
public class Rational {
	/** The numerator of the {@code Rational} object */
	private int numerator;

	/** The denominator of the {@code Rational} object */
	private int denominator;
	
	// This works only for non-negative integers
	private static int gcd(int m, int n) {
		// This is NOT an ideal implementation
		int smaller = (m < n) ? m : n;
		int factor = 1;
		for (int i = 2; i <= smaller; i++) {
			if (m % i == 0 && n % i == 0) {
				factor = i;
			}
		}
		return factor;
	}

	/**
	 * Creates a new {@code Rational} object
	 * @param numerator the numerator of the object
	 * @param denominator the denominator of the object
	 */
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		if (denominator == 0) {
			throw new IllegalArgumentException();
		}
		this.denominator = denominator;  // What if denominator is zero?
	}
	
	/**
	 * Returns the numerator of the {@code Rational} object
	 * @return returns the numerator of the {@code Rational} object
	 */
	public int getNumerator() {
		return numerator;
	}

	/**
	 * Returns the denominator of the {@code Rational} object
	 * @return returns the denominator of the {@code Rational} object
	 */
	public int getDenominator() {
		return this.denominator;
	}
	
	public Rational reduce() {
		int commonFactor = gcd(numerator, denominator);
		return new Rational(numerator/commonFactor, denominator/commonFactor);
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
}
