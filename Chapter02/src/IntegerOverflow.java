import java.util.Scanner;

public class IntegerOverflow {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.print("Please an integer: ");
		num = scan.nextInt();
		System.out.println(num + " + " + num + " = " + (num + num));
		scan.close();
	}
}