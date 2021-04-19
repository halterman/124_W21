package rationalNumbers3;

public class TestEnhancedRational {

    public static void main(String[] args) {
        EnhancedRational r1 = new EnhancedRational(10, 3),
                         r2 = new EnhancedRational(1, 2),
                         r3 = new EnhancedRational(6, 2);

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        
        //EnhancedRational r = RationalToolkit.add(r1, 6);
    }

}
