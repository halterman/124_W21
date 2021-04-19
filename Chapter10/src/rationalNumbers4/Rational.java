package rationalNumbers4;

/**
 * The {@code Rational} class represents a mathematical 
 * rational numbers (fractions).
 * 
 * This is our third version.
 *
 */
public class Rational {
	/** The numerator of the {@code Rational} object */
	private int numerator;

	/** The denominator of the {@code Rational} object */
	private int denominator;
	
	/** The fraction 0/1 */
	public static final Rational ZERO = new Rational(0, 1);
	
	/** The fraction 1/1 */
	public static final Rational ONE = new Rational(1, 1);
	
	/**
	 * Computes the greatest common divisor of two 
	 * integers.  Uses Euclid's method iteratively.
	 * @param a one of the integers
	 * @param b the other integer
	 * @return the greatest common divisor of 
	 *         {@code a} and {@code b}
	 */
	public static int gcd(int a, int b) {
	    while (b != 0) {
	        int t = b;
	        b = a % b;
	        a = t;
	    }
	    return a;
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
	
	public static Rational parseRational(String s) {
	    String[] parts = s.split("/");
	    return new Rational(Integer.parseInt(parts[0]),
	                        Integer.parseInt(parts[1]));
	    
	}
	
	public Rational add(Rational other) {
		int newNumerator = this.numerator*other.denominator 
		                   + other.numerator*this.denominator;
		int newDenominator = this.denominator*other.denominator;
		int factor = gcd(newNumerator, newDenominator);
		return new Rational(newNumerator/factor, 
		                    newDenominator/factor);
	}

	public Rational multiply(Rational other) {
		int newNumerator = this.numerator*other.numerator;
		int newDenominator = this.denominator*other.denominator;
		int factor = gcd(newNumerator, newDenominator);
		return new Rational(newNumerator/factor, 
		                    newDenominator/factor);
	}

	public String toString() {
		return numerator + "/" + denominator;
	}
}
