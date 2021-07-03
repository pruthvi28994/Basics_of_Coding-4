package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;

/*
 * implement the following function: int findNumber(int n);
 * 
 * the function accepts an integer 'n' as its argument. implement the function to find and return a positive integer 'm' less than 'n' such that m(2) gives maximum remainder after dividing it with 'n'
 * in case there are more than one such numbers 'm' than return largest such number 'm'.
 * 
 * Assumption :n>1
 * Note :Computed values lie within integer range
 * 
 * Example
 * input: n: 6
 * output: 4
 * Explanation :
 * 		for all positive integers <6
 * 		Number		Square of Number		Remainder
 * 		  1				  1						1
 * 		  2				  4						4
 * 		  3				  9						3
 * 		  4				 16						4
 * 		  5				 25						1
 *   4 is the largest number smaller than 6 whose square when divided by 6 gives max remainder . thus, output is 4
 * 
 * input: n:5
 * output: 3
 * 
 * 
 * */
public class Java_findMaxRemainder {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int num;
			System.out.println("Enter the Number");
			while(sc.hasNext()) {
				num=sc.nextInt();
				int result=findNumber(num);
				System.out.println(result+" is the largest number smaller than "+num);
			}
		}

	}

	public static int findNumber(int num) {
		int output[]=new int[num-1];
		int j=0;
		for(int i=1;i<num;i++) {
			output[j++]=(int)Math.pow(i, 2)%num;
		}
		int max=0,index=0;
		for (int i = 0; i < output.length; i++) {
			if(output[i]>=max) {
				max=output[i];
				index=(i+1);
			}
		}
		return index;
	}

}







































