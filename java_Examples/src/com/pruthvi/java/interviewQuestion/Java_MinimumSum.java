package com.pruthvi.java.interviewQuestion;

import java.util.*;
/*
 * Problem Statement 
 * 		int MinimumSum(int[] arr, int length);
 *  The function accepts an integer array 'arr' and its length as arguments.you need to find and return the the absolute sum of two elements of 'arr' such that their sum is closest to zero
 *  Array 'arr' contains both positive and negative integers.
 *  
 *  Note : Return 0 if array length <=1.
 *  
 *  Example :
 *      input:
 *      Array : -3 1 2 -4 8 5
 *      output:
 *      1
 *      
 *      Explanation:
 *      	(-3)+2=-1, abs(-1) = 1, thus sum closest to  0 is 1.
 *      
 *      input:
 *      Array : 12 -9 14 -5 16 23 -19
 *      output:3
 *      
 * 
 * 
 * */
public class Java_MinimumSum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int size=sc.nextInt();
				int[] arr=new int[size];
				for (int i = 0; i < arr.length; i++) {
					arr[i]=sc.nextInt();
				}
				int minSum=MinimumSum(arr,size);
				if (minSum>0) {
					System.out.println(minSum);
				}else {
					System.out.println("Invalid_Input");
				}
				
			}
		}

	}
	private static int MinimumSum(int[] arr, int size) {
		if(arr.length<=1) return 0;
		int min=0,value;
		min=arr[0]+arr[1];
		for (int i = 0; i < size; i++) {
			for(int j=i+1;j<size;j++) {
				value=arr[i]+arr[j];
				//checking value <0 because comparison acts reverse if it is compared below 0
				if(value<0) {
					if(value>min && i!=j) {
						min=value;
					}
				}
				else if(value<min && i!=j) {
						min=value;
				}
			}
		}
		return Math.abs(min);
	}

}
