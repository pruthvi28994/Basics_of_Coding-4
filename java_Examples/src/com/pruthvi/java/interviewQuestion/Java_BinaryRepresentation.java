package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;

public class Java_BinaryRepresentation {
	public static void BinaryValue(int num) {
		int binary[] = new int[40];
		int i = 0;
		while (num > 0) {
			binary[i++] = num % 2;
			num /= 2;
		}
		for (int j = i - 1; j >= 0; j--) {
			System.out.print(binary[j]);
		}
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int num = sc.nextInt();
			BinaryValue(num);
		}
	}

}
