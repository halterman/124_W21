import java.util.Scanner;

public class TimesTable4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How big of a table? ");
		int size;
		size = scan.nextInt();
		scan.close();
		
		// Print the column header
		System.out.print("    ");
		for (int column = 1; column <= size; column++) {
			System.out.printf("%4d", column);
		}
		System.out.println();
		System.out.print("   +");
		for (int column = 1; column <= size; column++) {
			System.out.print("----");
		}
		System.out.println();
		
		for (int row = 1; row <= size; row++) {
			System.out.printf("%2d |", row);
			for (int column = 1; column <= size; column++) {
				System.out.printf("%4d", row*column);
			}
			System.out.println();
		}
	}
}
