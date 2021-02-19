import java.util.Scanner;

public class TimesTable1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How big of a table? ");
		int size;
		size = scan.nextInt();
		scan.close();
		
		for (int row = 1; row <= size; row++) {
			for (int column = 1; column <= size; column++) {
				System.out.print(row*column + " ");
			}
			System.out.println();
		}
	}
}
