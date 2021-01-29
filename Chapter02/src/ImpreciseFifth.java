public class ImpreciseFifth {
    public static void main(String[] args) {
        double one = 1.0, 
               oneFifth = 1.0/5.0,
               zero = one - oneFifth - oneFifth - oneFifth
                          - oneFifth - oneFifth;
        System.out.println("one = " + one 
                           + ", oneFifth = " + oneFifth
                           + ", zero = " + zero);
    }
}