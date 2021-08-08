package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

public class TwinPrime_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int num=sc.nextInt();
			twinPrime(num);
		}
		sc.close();
	}

	private static void twinPrime(int num) {
		for(int i=2;i<num;i++) {
			if(Java_PrimeCheck.isPrime(i) && Java_PrimeCheck.isPrime(i+2)) {
				System.out.println(i+","+(i+2));
			}
		}
		
	}

}
