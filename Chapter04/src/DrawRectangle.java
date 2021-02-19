import java.util.Scanner;

public class DrawRectangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter width and height: ");
		int width, height;
		width = scan.nextInt();
		height = scan.nextInt();
		scan.close();
		
		for (int row = 0; row < height; row++) {
			for (int column = 0; column < width; column++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
