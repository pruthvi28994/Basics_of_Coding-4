package com.adapt.capgemini.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;



/*
 * 
 * The method input parameter(String) should be parsed and checked if it matches the formats given below
 * dd/MM/yyyy
 * dd-MM-yyyy
 * dd.MM.yyyy
 * Input should be taken through Console
 * Program should print the output as described in the Example Section below
 * 
 * */
class Utilities{
	public static int checkDate(String date) {
		SimpleDateFormat sdf1=new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat sdf3=new SimpleDateFormat("dd.MM.yyyy");
		
		sdf1.setLenient(false);sdf2.setLenient(false);sdf3.setLenient(false);
		String pattern1="^(0[1-9]|[12][0-9]|3[01])/(1[0-2]|0[1-9])/[0-9]{4}$";
		String pattern3="^(0[1-9]|[12][0-9]|3[01]).(1[0-2]|0[1-9]).[0-9]{4}$";
		String pattern2="^(0[1-9]|[12][0-9]|3[01])-(1[0-2]|0[1-9])-[0-9]{4}$";
		//matching the string via string.matches(regex);
		if(date.matches(pattern1)) {
			try {
				Date d=sdf1.parse(date);
				return 1;
			} catch (ParseException e) {
				return -1;
			}
		}
		if(date.matches(pattern2)) {
			try {
				Date d=sdf2.parse(date);
				return 1;
			} catch (ParseException e) {
				return -1;
			}			
		}
		if(date.matches(pattern3)) {
			try {
				Date d=sdf3.parse(date);
				return 1;
			} catch (ParseException e) {
				return -1;
			}
		}
		return -1;		
		//matching the regex using pattern 
//		Pattern p=Pattern.compile(pattern);
//		Matcher m=p.matcher(date);
//		if(m.find()) {
//			System.out.println("valid");
//		}
//		else {
//			System.out.println("Invalid");
//		}
//		return 1;
		
	
	
	}
}
public class java_DateValidation {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String date=sc.nextLine();
		int result=Utilities.checkDate(date);
		if(result==1)
			System.out.println("Valid");
		else 
			System.out.println("Invalid");
		sc.close();
	}
		
}
