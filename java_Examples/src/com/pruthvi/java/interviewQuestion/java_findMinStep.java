package com.pruthvi.java.interviewQuestion;

import java.util.*;

public class java_findMinStep {

	/*
	 * if the given steps number is even you are allowed to jump n/2 below at
	 * maximum and if the step no is odd you are allowed to jump 1 step below print
	 * the min number of steps required to win this game from the given input
	 */
	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			int num=0;
			while(sc.hasNext()) {
				num=sc.nextInt();
				System.out.println("Min steps required:"+minStep(num));
			}
		}

	}

	private static int minStep(int num) {
		// TODO Auto-generated method stub
		int count = 0;
		while (num > 0) {
			if (num % 2 == 0) {
				num = num / 2;
				count++;
			} else {
				num = num - 1;
				count++;
			}
		}
		return count;
	}

}
