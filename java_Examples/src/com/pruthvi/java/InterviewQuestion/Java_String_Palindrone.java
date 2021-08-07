package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

public class Java_String_Palindrone {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the String to check palindrone");
			String name = sc.nextLine();
			boolean result = check_Panlindrome(name);
			if (result) {
				System.out.println("Given String '" + name + "' is palindrone");
			} else {
				System.out.println("Given String '" + name + "' is not palindrone");
			}
		}

	}

	private static boolean check_Panlindrome(String name) {
		// TODO Auto-generated method stub
		// optimized code block
		String newStr = new StringBuffer(name).reverse().toString();
		if (newStr.equals(name)) {
			return true;
		} else {
			return false;
		}

		// not optimized code
//		String newStr="";
//		for(int i=name.length()-1;i>=0;i--) {
//			 newStr+=name.charAt(i);
//		}
//		if(newStr.equals(name)) {
//			return true;
//		}
//		else {
//			return false;
//		}
	}

}
