import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x;
		int y;
		System.out.print("Please two integers to add: ");
		x = scan.nextInt();
		y = scan.nextInt();
		System.out.println(x + " + " + y + " = " + (x + y));
	}

}
