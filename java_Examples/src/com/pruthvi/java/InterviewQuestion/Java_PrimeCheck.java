package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

public class Java_PrimeCheck {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number greater than 2:");
			int num = sc.nextInt();
			boolean result = isPrime(num);
			if (result == true) {
				System.out.println(num + " is a prime number");
			} else {
				System.out.println(num + " is complex number");
			}
		}
	}

	public static boolean isPrime(int num) {
//		 for(int i=2;i<=num/2;i++) {  //2 
//			 if(num%i==0) {
//				 result=false;
//			 }
//		 }
		// optimization of code
		int cond = (int) Math.sqrt(num);
		for (int i = 2; i <=cond; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
