package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;

public class Java_car_race {
	public static int productDigits(int num) {
		int winAmt = 1;
		int rem = 0;
		if (num < 0) {
			return -1;
		} else {
			while (num > 0) {
				rem = num % 10;
				winAmt = winAmt * rem;
				num /= 10;
			}
			return winAmt;
		}
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			int result = productDigits(num);
			if (result == -1) {
				System.out.println("INVALID_INPUT");
			} else {
				System.out.println(result);
			}
		}
	}

}
