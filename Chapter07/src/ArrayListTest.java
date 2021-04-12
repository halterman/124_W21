import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println(list.size());
        for (int i = 0; i < 10; i++) {
            list.add(10*i);
        }
        System.out.println(list);

    }

}
