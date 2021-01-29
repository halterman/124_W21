import java.util.Scanner;

public class InchesToMilesFeetInches {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int miles, feet, inches, totalInches;
		System.out.print("Please enter total inches: ");
		totalInches = input.nextInt();
		
		final int inchesPerFoot = 12;
		final int feetPerMile = 5280;
		final int inchesPerMile = inchesPerFoot * feetPerMile;

		miles = totalInches/inchesPerMile;
		totalInches = totalInches % inchesPerMile;
		feet = totalInches/inchesPerFoot;
		totalInches = totalInches % inchesPerFoot;
		inches = totalInches;
		
		System.out.println(miles + " mi " + feet + " ft " 
		                   + inches + " in ");
		
		input.close();
	}

}

