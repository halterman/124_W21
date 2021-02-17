import java.util.Scanner;

public class NumberToTextWithSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an integer in the range 1...5: ");
		int number = scan.nextInt();
		scan.close();
		
		// Add logic here
		if (1 <= number && number <= 5) {
			switch (number) {
				case 1:
					System.out.println("one");
					break;
				case 2:
					System.out.println("two");
					break;
				case 3:
					System.out.println("three");
					break;
				case 4:
					System.out.println("four");
					break;
				case 5:
					System.out.println("five");
					break;
			}
		} else {
			System.out.println("Number is out of range");
		}
		System.out.println("Switch Program finished");
	}
}
