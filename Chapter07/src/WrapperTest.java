
public class WrapperTest {

    public static void main(String[] args) {
        Integer x = 250, y = 250;
        
        System.out.println(x == y);
        System.out.println(x.intValue() == y.intValue());
        System.out.println(x.equals(y));

    }

}
