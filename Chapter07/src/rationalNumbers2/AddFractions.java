package rationalNumbers2;

import java.util.Scanner;

public class AddFractions {

	private static final Scanner scan = new Scanner(System.in);
	
//	
//	private static String[] getNumbers() {
//		String input = scan.next();
//		String[] parts = input.split("/");
//		return parts;
//	}

	public static void main(String[] args) {
		Rational frac1, frac2;
		
		frac1 = new Rational(1, 4);
		System.out.println("The numerator of " + frac1 + " is " 
				           + frac1.getNumerator());
		
		frac2 = new Rational(2,3);
		System.out.println(frac2);
		
		System.out.println("-----------------------");
		
		Rational frac3 = new Rational(2, 4);
		System.out.println("frac3 = " + frac3);
		System.out.println(frac3 + " reduces to " + frac3.reduce());
		
		
		
		
//		System.out.print("Please enter the fractions to add: ");
//		int numerator1, denominator1, numerator2, denominator2;
//		// Grab the first fraction
//		String[] parts = getNumbers();
//		numerator1 = Integer.parseInt(parts[0]);
//		denominator1 = Integer.parseInt(parts[1]);
//	
//		
//		// Grab the second fraction
//		parts = getNumbers();
//		numerator2 = Integer.parseInt(parts[0]);
//		denominator2 = Integer.parseInt(parts[1]);
//
//		// Compute the answer
//		int numeratorSum, denominatorSum;
//		
//		numeratorSum = numerator1*denominator2 + numerator2*denominator1;
//		denominatorSum = denominator1*denominator2;
//		
//		
//		// Print the result
//		System.out.printf("%d/%d + %d/%d = %d/%d%n",
//				          numerator1, denominator1,
//				          numerator2, denominator2,
//				          numeratorSum/commonFactor, 
//				          denominatorSum/commonFactor);
	}

}
