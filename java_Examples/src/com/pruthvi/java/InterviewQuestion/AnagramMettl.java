package com.pruthvi.java.InterviewQuestion;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Problem Statement : An anagram is a word , phrases , name formed by rearranging the letters of another word ,pharses or name
 * 					   write a function to check if two given strings are anagrams or not return "yes" if they are anagrams. otherwise return "no"
 * INPUT:
 * 		INPUT1: the first string 
 * 		INPUT2: the second string
 * OUTPUT:
 * 		"yes" if they are anagrams otherwise return "no"
 * 
 * Example: 
 * 		INPUT: 
 * 				build
 * 				dubli
 * 		OUTPUT:
 * 				"YES"
 * 
 * 
 * 
 * */
public class AnagramMettl {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
			String Input1 = sc.nextLine();
			String Input2 = sc.nextLine();
			String result = anagramCheck(Input1, Input2);
			System.out.println(result);
		}
		sc.close();

	}

	private static String anagramCheck(String Input1, String Input2) {
		  
			Input1=Input1.toLowerCase().replaceAll("\\s", "");
			Input2=Input2.toLowerCase().replaceAll("\\s", "");
			char Input1A[]=Input1.toCharArray();
			char Input2A[]=Input2.toCharArray();
			Arrays.sort(Input1A);
			Arrays.sort(Input2A);
			Input1=new String(Input1A);
			Input2=new String(Input2A);
			if(Input1.equals(Input2))
				return "yes";
			else
				return "no";
	}

}
