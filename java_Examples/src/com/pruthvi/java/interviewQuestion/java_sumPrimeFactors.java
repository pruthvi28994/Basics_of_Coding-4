package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;
public class java_sumPrimeFactors {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number:");
			System.out.println("Sum of Prime factors of number is " + sumPrimeFactors(sc.nextInt()));
		}

	}

	private static int sumPrimeFactors(int num) {
		// TODO Auto-generated method stub
		int sum = 0;
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				for (int j = 2; j <= (int) Math.sqrt(i); j++) {
					if (i % j == 0) {
						isPrime = false;
						break;
					}
				}
				if (isPrime) {
					sum += i;
				}
			}
			isPrime = true;
		}
		return sum;
	}

}
