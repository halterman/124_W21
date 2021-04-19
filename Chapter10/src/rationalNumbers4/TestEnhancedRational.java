package rationalNumbers4;

import java.util.Arrays;

public class TestEnhancedRational {

    public static void main(String[] args) {
        EnhancedRational r1 = new EnhancedRational(10, 3),
                         r2 = new EnhancedRational(1, 2),
                         r3 = new EnhancedRational(6, 2);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        
        Rational r = RationalToolkit.add(r1, 6);
        System.out.println(r);
        
        Rational[] rList = {
                new Rational(3, 2),
                new EnhancedRational(3, 2),
                new Rational(1, 2),
                new Rational(1, 2),
                new EnhancedRational(10, 3),
                new Rational(10, 3),
        };
        System.out.println(Arrays.toString(rList));
        RationalToolkit.sort(rList);
        System.out.println(Arrays.toString(rList));
    }

}
