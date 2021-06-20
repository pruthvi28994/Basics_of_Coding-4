package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;

public class java_Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check Amstrong :");
		int num = sc.nextInt();
		boolean result = check_Amstrong(num);
		if (result)
			System.out.println(num + " is Amstrong Number");
		else
			System.out.println(num + " is not Amstrong number");
	}

	private static boolean check_Amstrong(int num) {
		// TODO Auto-generated method stub
		int count = 0, rem = 0, newNum = 0;
		int temp = num;
		while (temp > 0) {
			count++;
			temp /= 10;
		}
		temp = num;
		while (temp > 0) {
			rem = temp % 10;
			newNum = newNum + (int) Math.pow(rem, count);
			temp /= 10;
		}
		if (newNum == num) {
			return true;
		} else {
			return false;
		}
	}

}
