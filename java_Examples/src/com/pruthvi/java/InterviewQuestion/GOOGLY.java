package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;
/**
 * Problem Statement : you are given a number N , you need to check whether the given number is GOOGLY or NOT GOOGLY , a Number is GOOGLY if the sum of elements of number is equal to prime number
 * 
 * Example :
 *  		input :21
 *  		output: GOOGLY
 *  				explanation : 2+1 = 3 which is prime number
 * */
public class GOOGLY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
		int num =sc.nextInt();
		boolean result=check_Googly(num);
		if(result)
			System.out.println("GOOGLY");
		else
			System.out.println("NOT GOOGLY");
		}
		sc.close();
	}

	private static boolean check_Googly(int num) {
		int newNum=0,rem=0;
		while(num>0) {
			rem=num%10;
			newNum+=rem;
			num/=10;
		}
		
		int cond = (int) Math.sqrt(newNum);
		for (int i = 2; i <=cond; i++) {
			if (newNum % i == 0) {
				return false;
			}
		}
		return true;
	}

}
