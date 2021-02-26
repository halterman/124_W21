import java.util.Scanner;

public class PreincrementVsPostincrement {

	public static void main(String[] args) {
		int n1 = 5, n2 = 10, n3 = 0, n4 = 0;
		
		System.out.printf("n1 = %d n3 = %d%n", n1, n3);
		 n3 = n1++;
		System.out.printf("n1 = %d n3 = %d%n", n1, n3);

		System.out.printf("n2 = %d n4 = %d%n", n2, n4);
		 n4 = ++n2;
		System.out.printf("n2 = %d n4 = %d%n", n2, n4);
	}

}
