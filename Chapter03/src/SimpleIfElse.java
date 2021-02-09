import java.util.Scanner;

public class SimpleIfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a non-negative integer: ");
		int num = scan.nextInt();
		if (num >= 0) {
			System.out.println("You entered " + num);
		} else {
			System.out.println(num + " is a negative number!");
		}
		scan.close();

	}

}
