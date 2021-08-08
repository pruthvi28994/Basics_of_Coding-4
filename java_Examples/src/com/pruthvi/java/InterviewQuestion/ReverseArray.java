package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
    		Scanner sc=new Scanner(System.in);
    		int size=sc.nextInt();
    		int A[]=new int[size];
    		for(int i=0;i<size;i++) {
    			A[i]=sc.nextInt();
    		}
    		A=reverse(A,size);
    		for (int i = 0; i < A.length; i++) {
				System.out.print(A[i]);
			}
    		
    		sc.close();
}

	private static int[] reverse(int[] Input1,int Input2) {
		int newArr[]=new int[Input2];
		int j=0;
		for(int i=Input2-1;i>=0;i--) {
			newArr[j]=Input1[i];
			j++;
		}
		return newArr;
	}
}
