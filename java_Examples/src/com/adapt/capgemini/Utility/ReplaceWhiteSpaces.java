package com.adapt.capgemini.Utility;
import java.util.*;
public class ReplaceWhiteSpaces {
	public static void main(String[] args) {
	    try (Scanner sc = new Scanner(System.in)) {
			String str=sc.nextLine();
			str = str.replaceAll("\\s","");
			System.out.println(str);
		}
	}
}
