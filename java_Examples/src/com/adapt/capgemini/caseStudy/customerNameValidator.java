package com.adapt.capgemini.caseStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

class custValidate{
	private String firstName;
	private String lastName;
	
	public custValidate() {
		super();
	}
	public custValidate(String firstName, String lastName) throws InvalidNameException
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if(this.firstName.length()<6 || this.lastName.length()<6) {
			throw new InvalidNameException();
		}
		
		//should accept the firstname and lastname if it has length >6 and should not contain any special characters
		Pattern pattern=Pattern.compile("[^A-Za-z]");
		Matcher m1=pattern.matcher(this.lastName);
		Matcher m2=pattern.matcher(this.firstName);
		if(m1.find() || m2.find()) {
			throw new InvalidNameException();
		}
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) throws InvalidNameException{
		this.firstName = firstName;
		if(this.firstName.length()<6) {
			throw new InvalidNameException();
		}
		Pattern pattern=Pattern.compile("[^A-Za-z]");
		Matcher m=pattern.matcher(this.firstName);
		if(m.find()) {
			throw new InvalidNameException();
		}
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) throws InvalidNameException{
		this.lastName = lastName;
		if(this.lastName.length()<6) {
			throw new InvalidNameException();
		}
		Pattern pattern=Pattern.compile("[^A-Za-z]");
		Matcher m=pattern.matcher(this.lastName);
		if(m.find()) {
			throw new InvalidNameException();
		}
	}
	
	
}
public class customerNameValidator {

	public static void main(String[] args) {
		custValidate customer=new custValidate();
		try {
			customer.setFirstName("Krithick12#");
		} catch (InvalidNameException e) {
			System.out.println(e);
		}
		

	}

}
