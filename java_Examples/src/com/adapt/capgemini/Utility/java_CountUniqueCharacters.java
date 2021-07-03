package com.adapt.capgemini.Utility;

import java.util.Scanner;

public class java_CountUniqueCharacters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String string=sc.nextLine();
		int result=getUniqueCharacterCount(string);
		if(result!=-1)
			System.out.println(result+" unique character/s");
		else
			System.out.println("No unique character/s");
		sc.close();
	}

	public static int getUniqueCharacterCount(String string) {
		
		int i;
		string = string.replaceAll("\\s","");
		string=string.toLowerCase();
		String trace="";
		
		//counting the unique characters
		StringBuilder sb=new StringBuilder();
		for(i=0;i<string.length();i++) {
			
			if(sb.indexOf(String.valueOf(string.charAt(i)))==-1 && !trace.contains(String.valueOf(string.charAt(i)))) {
					
				sb.append(string.charAt(i));
				trace+=string.charAt(i);
		    
			}else if(sb.indexOf(String.valueOf(string.charAt(i)))>-1) {
		    	
				sb.deleteCharAt(sb.indexOf(String.valueOf(string.charAt(i))));
		    }
		}
		//System.out.println(trace);
		if(sb.length()>0)
			return sb.length();
		return -1;
		
	}

}
