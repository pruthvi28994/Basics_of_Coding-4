package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;
/**
 * Problem Statement: Every character in the input string is followed by its frequency.
 * 					  write a function to decrypt the string and find the nth character of the decrypted string 
 * 					  if no character exist at that position then return "-1".
 * 					  for eg:- if the input string is "a2b3" then decrypted string is "aabbb"
 * 	Note: frequency of encrypted message string cannot be greater than a single digit i.e <10;
 * 
 * Input : 
 * 		 input1:a string
 * 	     input2:n,the position of the character starting from 1
 * Output:
 * 		Return the character which occurs at the nth position in the decrypted string
 * 
 * Example:
 * 		INPUT:
 * 				a2b3
 * 				3
 * 		OUTPUT:
 * 				b
 * 
 * 
 * 
 * 
 * */
public class Nth_Character_Decrypted_Stirng {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
				String Input1=sc.nextLine();
				int Input2=sc.nextInt();
				String result=decrypt_String(Input1,Input2);
				if(result.equals("-1"))
						System.out.println("-1");
				else
					System.out.println(result);
		}
		sc.close();
	}

	private static String decrypt_String(String Input1,int Input2) {
		
		String NewString="";
		for(int i=0;i<Input1.length();i++) {
			int counter=0;
			try {
				  counter=Integer.parseInt(Character.toString(Input1.charAt(i)));
				  
			} catch (NumberFormatException e) {	
			        continue;
			}
			if(counter<1)
			       NewString+=Input1.charAt(i);
			else if(counter<10) {
				for(int j=1;j<=counter;j++) {
					NewString+=Input1.charAt(i-1);
				}
			}
					
		}
		if((Input2-1)<NewString.length())
			return Character.toString(NewString.charAt(Input2-1));
		else 
		    return "-1";
	}

}
