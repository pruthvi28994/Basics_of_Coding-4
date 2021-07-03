package com.adapt.capgemini.Utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class java_DayOfDate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Date");
		String date=sc.next();
		System.out.println(getDayOfDate(date));
		sc.close();
	}
	public static String getDayOfDate(String date) {
		//accepting the string in given format dd/MM/yyyy
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/MM/yyyy");
		dateformat.setLenient(false);
		
		//sdf changes the format EEEE => week day 
		SimpleDateFormat weekDay=new SimpleDateFormat("EEEE");
		Date ndate;
		
		try {
			//returns the date => week day
			ndate=dateformat.parse(date);
			return weekDay.format(ndate);
		}
		catch(ParseException e) {
			System.out.println(e);
		}
		return null;
	}

}
