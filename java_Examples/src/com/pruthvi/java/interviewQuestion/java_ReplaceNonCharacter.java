package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;

public class java_ReplaceNonCharacter {

	public static void main(String[] args) {
		try (
		Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				String sentance = sc.nextLine();
				sentance=ReplaceNonCharacter(sentance);
				System.out.println("After removing Non Character\n"+sentance);
			}
			sc.close();
		}
	}
	public static String ReplaceNonCharacter(String sentance) {
		String newStr="";
		for(int i=0;i<sentance.length();i++) {
			if(Character.isLetter(sentance.charAt(i))) {
				newStr+=sentance.charAt(i);
			}
		}
		return newStr;
	}

}
