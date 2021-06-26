package com.adapt.capgemini.Utility;

import java.util.Scanner;

public class java_MaxDigitString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input=sc.next();
		int result=getMaxDigit(input);
		if(result!=-1)
			System.out.println(result);
		else
			System.out.println("No digits in String");
	}
	public static int getMaxDigit(String input) {
		int MAX=Integer.MIN_VALUE;
		char digit;
		if(input==null || input.isEmpty())
			return -1;
		input = input.replaceAll("\\s", "");
		for(int i=0;i<input.length();i++) {
			if(Character.isDigit(input.charAt(i))) {
				
				digit=input.charAt(i);
				
				//String.valueOf(ch) will convert character to string
				
				if(MAX<Integer.parseInt(String.valueOf(digit))) {
					MAX=Integer.parseInt(String.valueOf(digit));
				}
			}
		}
		if(MAX==Integer.MIN_VALUE)
			return -1;
		else
			return MAX;
	}
}
