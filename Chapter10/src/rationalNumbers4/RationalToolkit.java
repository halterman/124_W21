package rationalNumbers4;

public class RationalToolkit {
    /**
     * Determines if one {@code Rational} object
     * is less than another
     */
    public static boolean lessThan(Rational r1, Rational r2) {
        double d1 = (double)r1.getNumerator()/r1.getDenominator(),
               d2 = (double)r2.getNumerator()/r2.getDenominator();
        return d1 < d2;
    }
    
    /**
     * Sorts an array of {@code Rational} objects into
     * non-descending order
     * @param rs the array to sort
     */
    public static void sort(Rational[] rs) {
        if (rs == null || rs.length < 2) {
            return;
        }
        for (int i = 0; i < rs.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < rs.length; j++) {
                if (lessThan(rs[j], rs[small])) {
                    small = j;
                }
            }
            if (small != i) {  // Need to swap?
                Rational temp = rs[i];
                rs[i] = rs[small];
                rs[small] = temp;
            }
        }
    }
    
    /**
     * Adds a {@code Rational} object and an integer.
     * @param r the {@code Rational} object
     * @param intValue the integer
     * @return a {@code Rational} object representing 
     *         the sum of the {@code Rational} object and the
     *         integer
     */
    public static Rational add(Rational r, int intValue) {
        Rational intValueAsRational = new Rational(intValue, 1);
        return r.add(intValueAsRational);
    }
    
    /**
     * Adds an integer and a  {@code Rational} object.
     * @param intValue the integer
     * @param r the {@code Rational} object
     * @return a {@code Rational} object representing 
     *         the sum of the integer and the 
     *         {@code Rational} object
     */
    public static Rational add(int intValue, Rational r) {
        return add(r, intValue);
    }
    
    // Assume this class contains lots of other useful
    // tools not shown here . . .
}
