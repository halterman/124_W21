public class PreciseEighth {
    public static void main(String[] args) {
        double one = 1.0, 
               oneEighth = 1.0/8.0,
               zero = one - oneEighth - oneEighth - oneEighth
                   - oneEighth - oneEighth - oneEighth
                   - oneEighth - oneEighth;
        System.out.println("one = " + one 
                           + ", oneEighth = " + oneEighth
                           + ", zero = " + zero);

    }
}