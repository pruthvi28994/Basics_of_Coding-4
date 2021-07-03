package com.adapt.capgemini.Utility;
import java.util.*;
/*
Create class Sequence which has a static method declared as below sequences(String):int

The sequences method of Sequence class is a static method which does the following:

a. Convert the input string to an integer array where its elements are integers

in the string.

b. Perform the following operations on the array elements:
*/
class Sequence{
	 public static int sequences(String arr) {
		 
		 String input[]=arr.split(",");
		 int output[]=new int[input.length];
		 try {
			 for (int i = 0; i < output.length; i++) {
				 	output[i]=Integer.parseInt(input[i]);
			 }
		 }
		 catch(NumberFormatException ne) {
			 System.out.println(ne);
		 }
		 int result=findValue(output);
		 return result;
	}

	public static int findValue(int[] input) {
		if(input.length==1) return input[0];
		int[] newArr=new int[input.length-1];
		
			for(int i=0;i<=input.length;i++) {
				try {
				newArr[i]=(input[i+1]-input[i]);
				}catch (ArrayIndexOutOfBoundsException ae) {
					continue;
				}
			}
		
		return findValue(newArr);
	}

}
public class java_MultipleCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			String arr=sc.nextLine();
			System.out.println(Sequence.sequences(arr));
		}
		sc.close();
	}

}
/*Test Case 1:
input:	1,5,7,8
		4,2,1
		-2,-1
output:-1-(-2)=>-1+2=1

 input:9,8,6,12,1
 	   -1,-2,6,-11
 	   -1,8,-17
 	   9,-25
  output: -34
*/


