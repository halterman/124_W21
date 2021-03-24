package rationalNumbers;

public class Rational {
	/** The numerator of the {@code Rational} object */
	private int numerator;

	/** The denominator of the {@code Rational} object */
	private int denominator;
	

	/**
	 * Creates a new {@code Rational} object
	 * @param numerator the numerator of the object
	 * @param denominator the denominator of the object
	 */
	public Rational(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
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

	public String toString() {
		return numerator + "/" + denominator;
	}
}
