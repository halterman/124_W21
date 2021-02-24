// Note: To make this work properly, adjust "Run settings ...", Common, Emcoding to UTF-8

import java.util.Scanner;

public class TimesTable5 {

	public static void main(String[] args) {
		final String HORIZONTAL_BAR = "\u2501",
				     VERTICAL_BAR = "\u2503",
				     TOP_LEFT_CORNER = "\u250f",
				     TOP_RIGHT_CORNER = "\u2513",
				     BOTTOM_LEFT_CORNER = "\u2517",
				     BOTTOM_RIGHT_CORNER = "\u251b",
				     CROSS = "\u2715";
		Scanner scan = new Scanner(System.in);
		System.out.print("How big of a table? ");
		int size;
		size = scan.nextInt();
		scan.close();
		
		// Print the column header
		System.out.print(" " + CROSS + "  ");
		for (int column = 1; column <= size; column++) {
			System.out.printf("%4d", column);
		}
		System.out.println();
		System.out.print("   " + TOP_LEFT_CORNER);
		for (int column = 1; column <= size; column++) {
			System.out.print(HORIZONTAL_BAR + HORIZONTAL_BAR + HORIZONTAL_BAR + HORIZONTAL_BAR);
		}
		System.out.print(HORIZONTAL_BAR + HORIZONTAL_BAR + TOP_RIGHT_CORNER);
		System.out.println();
		
		for (int row = 1; row <= size; row++) {
			System.out.printf("%2d %s", row, VERTICAL_BAR);
			for (int column = 1; column <= size; column++) {
				System.out.printf("%4d", row*column);
			}
			System.out.printf("  %s", VERTICAL_BAR);
			System.out.println();
		}
		
		// Print bottom of box
		System.out.print("   " + BOTTOM_LEFT_CORNER);
		for (int column = 1; column <= size; column++) {
			System.out.print(HORIZONTAL_BAR + HORIZONTAL_BAR + HORIZONTAL_BAR + HORIZONTAL_BAR);
		}
		System.out.print(HORIZONTAL_BAR + HORIZONTAL_BAR + BOTTOM_RIGHT_CORNER);
		System.out.println();
		
	}
}
