package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;
/**
 * Problem Statement : Given an Array A of size N where A[i] represents minutes ,count the number of pairs whose sum represents any full hour. 
 * 					   as the count can be very large ,print count modules (%) 10(9)+7.
 *					 if no such pair can be formed ,then print NO Hours".
 * 
 * 
 * */
public class HoursCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
		int size=sc.nextInt();
		int A[]=new int[size];
		for(int i=0;i<size;i++) {
			A[i]=sc.nextInt();
		}
		int result=Check_FullHours(A);
		if(result>=1)
			System.out.println(result);
		else 
			System.out.println("No Hours");
		}
		sc.close();
	}

	public static int Check_FullHours(int[] a) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if((a[i]+a[j])==60 || (a[i]+a[j])/2==60) {
					count++;
				}
			}
		}
		return count;
	}

}
