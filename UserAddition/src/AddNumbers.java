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
		
		System.out.println("-------------");
		System.out.print("AAA");
		System.out.print("BBB");
		System.out.print("CCC");
		System.out.println("-------------");
		System.out.println("AAA");
		System.out.println("BBB");
		System.out.println("CCC");
	}

}
