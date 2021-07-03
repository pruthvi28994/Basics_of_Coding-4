package com.adapt.capgemini.Utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class java_StringtoDate {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);

		// format change
		DateFormat df = DateFormat.getDateInstance();
		System.out.println("Date Instance "+df.format(date));

		df = DateFormat.getDateTimeInstance();
		System.out.println("Time Instance :"+df.format(date));

		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("Long Format=>" + df.format(date));

		df = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(df.format(date));

		df = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(df.format(date));

		df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(date) + "\n");

		// simpledate format for printing the date in specified format
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
		sdf.setLenient(false);
		System.out.println(sdf.format(date));

		System.out.println("Enter the date of birth in DD-MMMM-YYYY format:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		try {
			date = sdf.parse(input);
			System.out.println(date);
		} catch (ParseException e) {
			System.err.println("Date should be in DD-MMMM-YYYY format");
		}
		
		
		sc.close();
	}

}
