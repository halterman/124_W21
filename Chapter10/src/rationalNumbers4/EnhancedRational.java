package rationalNumbers4;

/**
 * The {@code EnhancedRational} class represents a mathematical 
 * rational numbers (fractions).
 * 
 * This is our third version.
 *
 */
public class EnhancedRational extends Rational {
    
    public EnhancedRational(int numerator, int denominator) {
        super(numerator, denominator);
    }

    @Override
	public String toString() {
	    int numerator = getNumerator(),
	        denominator = getDenominator();
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
