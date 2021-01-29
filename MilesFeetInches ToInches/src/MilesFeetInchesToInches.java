import java.util.Scanner;

public class MilesFeetInchesToInches {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int miles, feet, inches, totalInches;
		System.out.print("Please enter miles, feet, and inches: ");
		miles = input.nextInt();
		feet = input.nextInt();
		inches = input.nextInt();
		
		final int inchesPerFoot = 12;
		final int feetPerMile = 5280;
		final int inchesPerMile = inchesPerFoot * feetPerMile;

		totalInches = miles*inchesPerMile + feet * inchesPerFoot 
				      + inches;
		
		System.out.println(miles + " mi " + feet + " ft " 
		                   + inches + " in = " + totalInches + " in");
		
		input.close();
	}

}
