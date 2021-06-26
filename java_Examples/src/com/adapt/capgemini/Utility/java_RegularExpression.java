package com.adapt.capgemini.Utility;

import java.util.*;
import java.util.regex.*;

public class java_RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String pattern = "^[1]{1}[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{3}$";
		Pattern p = Pattern.compile(pattern);
		System.out.println("Enter the USN");
		String usn = sc.nextLine();
		Matcher m = p.matcher(usn);
		System.out.println("Entered USN is " + m.find());
		String details = "studentid is NMIT student";
		System.out.println("previous details before replacing=>" + details);

		Pattern p2 = Pattern.compile("studentid");
		Matcher m2 = p2.matcher(details);
		details = m2.replaceAll(usn);
		System.out.println(details);
		
	}

}
