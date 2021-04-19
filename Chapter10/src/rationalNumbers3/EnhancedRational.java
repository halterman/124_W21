package rationalNumbers3;

/**
 * The {@code Rational} class represents a mathematical 
 * rational numbers (fractions).
 * 
 * This is our third version.
 *
 */
public class EnhancedRational {
	/** The numerator of the {@code Rational} object */
	private int numerator;

	/** The denominator of the {@code Rational} object */
	private int denominator;
	
	/** The fraction 0/1 */
	public static final EnhancedRational ZERO = new EnhancedRational(0, 1);
	
	/** The fraction 1/1 */
	public static final EnhancedRational ONE = new EnhancedRational(1, 1);
	
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
	public EnhancedRational(int numerator, int denominator) {
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
	
	public EnhancedRational reduce() {
		int commonFactor = gcd(numerator, denominator);
		return new EnhancedRational(numerator/commonFactor, denominator/commonFactor);
	}
	
	public static EnhancedRational parseRational(String s) {
	    String[] parts = s.split("/");
	    return new EnhancedRational(Integer.parseInt(parts[0]),
	                        Integer.parseInt(parts[1]));
	    
	}
	
	public EnhancedRational add(EnhancedRational other) {
		int newNumerator = this.numerator*other.denominator 
		                   + other.numerator*this.denominator;
		int newDenominator = this.denominator*other.denominator;
		int factor = gcd(newNumerator, newDenominator);
		return new EnhancedRational(newNumerator/factor, 
		                    newDenominator/factor);
	}

	public EnhancedRational multiply(EnhancedRational other) {
		int newNumerator = this.numerator*other.numerator;
		int newDenominator = this.denominator*other.denominator;
		int factor = gcd(newNumerator, newDenominator);
		return new EnhancedRational(newNumerator/factor, 
		                    newDenominator/factor);
	}

	public String toString() {
	    if (numerator % denominator == 0) {
	        return Integer.toString(numerator/denominator);
	    } else if (numerator > denominator) {
	        return numerator/denominator + " " 
	                + numerator % denominator + "/" 
	                + denominator; 
	    }
		return numerator + "/" + denominator;
	}
}
