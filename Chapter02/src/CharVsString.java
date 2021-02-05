import java.util.Scanner;

public class CharVsString {

	public static void main(String[] args) {
		char ch;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a character: ");
		ch = scan.next().charAt(0);
		System.out.println("You entered " + ch);
		scan.close();
	}

}
