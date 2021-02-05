public class ImpreciseFifth {
    public static void main(String[] args) {
        double one = 1.0, 
               oneFifth = 1.0/5.0,
               zero = one - oneFifth - oneFifth - oneFifth
                          - oneFifth - oneFifth;
        /* Demonstrate that floating-point arithmetic is
         not precise */
        System.out.println("one = " + one 
                           + ", oneFifth = " + oneFifth
                           + ", zero = " + zero);
    }
}