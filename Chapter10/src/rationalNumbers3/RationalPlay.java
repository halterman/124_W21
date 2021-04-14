package rationalNumbers3;

import java.util.Arrays;

public class RationalPlay {
	
	public static void main(String[] args) {
		var fracList = new Rational[7];
		fracList[0] = new Rational(3, 2);
		fracList[1] = Rational.ONE;
		fracList[2] = new Rational(1, 2);
		fracList[3] = new Rational(3, 3);
		fracList[4] = Rational.ZERO;
		fracList[5] = new Rational(2, 5);
		fracList[6] = new Rational(30, 5);
		
		System.out.println(Arrays.toString(fracList));
		
		RationalToolkit.sort(fracList);
		System.out.println(Arrays.toString(fracList));
	}

}
