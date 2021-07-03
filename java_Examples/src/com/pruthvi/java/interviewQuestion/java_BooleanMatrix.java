package com.pruthvi.java.interviewQuestion;

import java.util.*;

/*
 * Boolean Matrix 
 * 	you are given a function ,
 * 	int ** BooleanMatrix(int** arr,int m,int n);
 * the function accepts a boolean matrix "arr" of size 'm*n'.implement the function to return the 2-D array matrix obtained by modifying 'arr' 
 * such that if a matrix cell arr[j][k] is 1 the make all cells of j(th) row and k(th) column as 1;
 * 
 *   Note:
 *   	1.Return NULL if Array is Null.
 *   	2.All the operation should be in place ,do not use new array
 *   	3.Array index starts from (0,0)
 *   
 *   Example
 *   	input:Array: 
 *   		0,1
 *   		0,0
 *   	m:2,n:2
 *   	output:Array
 *   		1,1
 *   		0,1
 *   	Explanation :arr[0,1]=1 ,thus all 0th row and 1st column changed to 1. 
 * 
 * 
 * */
public class java_BooleanMatrix {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int i=0,j=0;
			System.out.println("Enter order of matrix M*N");
			while(sc.hasNext()) {
				int m=sc.nextInt();
				int n=sc.nextInt();
				System.out.println("Enter the Matrix elements");
				boolean[][] arr=new boolean[m][n];
				for (i = 0; i < m; i++) {
					for (j = 0; j < n; j++) {
						arr[i][j]=sc.nextBoolean();
					}
				}
				boolean[][] result=BooleanMatrix(arr,m,n);
				for (i = 0; i <m; i++) {
					for (j = 0; j <n-1; j++) {
						System.out.print(result[i][j]+",");
					}
					System.out.print(result[i][j]+"\n");
				}
			}
		}

	}

	public static boolean[][] BooleanMatrix(boolean[][] arr, int m, int n) {
		/*
		 * 
		 *Note :Don't use new arr ,use inplace method 
		 * */
		boolean flag=false;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==true ) {
					int row=i,col=j;
					//making rows true
					for(int i1=0;i1<n;i1++)
						arr[row][i1]=true;
					
					//making col true
					for(int j1=0;j1<m;j1++)
						arr[j1][col]=true;
					flag=true;
					break;
					
				}
			}
			if(flag)
				break;
		}
		return arr;
	}

}
