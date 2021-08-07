package com.adapt.capgemini.Utility;

public class Java_Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// primitives - byte, short, int, long, float, double, char ,boolean
		// wrapper - Byte ,Short , Integer , Float, Double ,CHaracter ,Boolean

		String str = "10101010111";
		// parseInt will convert the string in to integer ,by passing base value it vill
		// convert the given value to base 2
		int num = Integer.parseInt(str, 2);
		System.out.println("value of 10101010111=>" + num);

		str = "abc123";
		System.out.println("Hexadecimal value+" + Integer.parseInt(str, 16));

		num = 99993;
		System.out.println("hexadecimal value of 99993 " + Integer.toHexString(num));

		char check = 'a';
		System.out.println("isLower() =>" + Character.isLowerCase(check));
		System.out.println("isUpper() =>" + Character.isUpperCase(check));
		char d = '1';
		System.out.println("isDigit()=>" + Character.isDigit(d));

		System.out.println("isLetter()=>" + Character.isLetter(d));
		char s = ' ';
		System.out.println("isWhiteSpace()=>" + Character.isWhitespace(s));

		System.out.println(Double.MAX_VALUE);

		// Auto-Boxing and Auto-Unboxing
		// boxing
		@SuppressWarnings("deprecation")
		Integer n = new Integer(10);
		System.out.println(n);
		// unboxing
		int ubox = n;
		System.out.println(ubox);

		
	}

}
