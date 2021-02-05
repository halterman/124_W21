import java.util.Scanner;

public class SimpleIf {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a non-negative integer: ");
		int num = scan.nextInt();
		if (num >= 0) {
			System.out.println("You entered " + num);
		}
		scan.close();

	}

}
