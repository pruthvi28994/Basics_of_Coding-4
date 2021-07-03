package com.pruthvi.java.interviewQuestion;

/*
 * Complete the main method to Accept n numbers and display the numbers in ascending order as output 
 * if n is even. If n is odd, then display the numbers in descending order
 * The first input n should represent the total number of values entered followed by the actual values to be sorted.
 * N should be within the range of 1 to 20 . If n is entered as less than 1 or more than 20 , it should show message as INVALID_INPUT.
 * 
 * */
import java.util.*;

public class Java_OddEvenSort {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num = sc.nextInt();
			if (num > 1 && num <= 20) {
				Integer arr[] = new Integer[num];
				for (int i = 0; i < num; i++) {
					arr[i] = sc.nextInt();
				}
				if (num % 2 == 0) {
					Arrays.sort(arr);
					for (int i = 0; i < num - 1; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.print(arr[num - 1]);
				} else {
					Arrays.sort(arr, Collections.reverseOrder());
					for (int i = 0; i < num - 1; i++) {
						System.out.print(arr[i] + " ");
					}
					System.out.print(arr[num - 1]);
				}
			} else {
				System.out.println("INVALID_INPUT");
			}
		}
	}
}