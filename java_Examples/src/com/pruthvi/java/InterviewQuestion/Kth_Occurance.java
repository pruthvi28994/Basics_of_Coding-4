package com.pruthvi.java.InterviewQuestion;

import java.util.*;

/**given an array of integers , reports the answers to multiple queries based n the elements of the array w.r.t to a given integer.
  
  More formally ,an array of integers ,an integer X , and a few queries are available. each query is described by a single integer K. the task is to find the index of the Kth occurrence of the X in the array for each of the queries , 
  Report -1 as the answer to the corresponding query if the Kth occurrence does not exist.
  
  NOTE:All the answers must be reported assuming 1-based indexing of he array.
  
  for example : lets say the favorite number is 8, and array values as [1,2,20,8,8,1,2,5,8,0].
  				then on query value =100 and 4 ,the correct answer to print is -1 , since there is no 4th or 100th occurrence of the favorite number.
  				in case the query value is 2, print 5,as the 2nd occurrence of the favorite number is at number is at index 5 in the array
  
  Function Description :
  	Complete the function solve in the editor below .the function must state what must be returned or printed.
  	solve has the following parameter(s):
  		X:an integer
  		arr:an integer array
  		query_Value:an integer array -> hold the occurrence position 
*/
public class Kth_Occurance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		int X;
		int query_Value[]=new int[5];
		X=sc.nextInt();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		for (int i = 0; i < query_Value.length; i++) {
			query_Value[i]=sc.nextInt();
		}
		int result=solve(X,arr,query_Value);
		System.out.println(result);
		
		sc.close();
	}

	public static int solve(int x, int[] arr, int[] query_Value) {
		//check X occurrance in query_Value array  which is indexed from 1
		return -1;
	}

}
