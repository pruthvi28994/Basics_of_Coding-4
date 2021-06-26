package com.adapt.capgemini.caseStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerMobileNumber {
	private long phoneNumber;

	public CustomerMobileNumber() {
		super();
	}
	public CustomerMobileNumber(long phoneNumber) throws InvalidPhoneNumberException{
		super();
		Pattern pattern=Pattern.compile("^[6-9][0-9]{9}$");
		Matcher m=pattern.matcher(Long.toString(phoneNumber));
		if(m.matches()) {
			this.phoneNumber=phoneNumber;
		}
		else {
			
			  try {
				throw new InvalidPhoneNumberException();
			} catch (InvalidPhoneNumberException e) {
				if(e instanceof InvalidPhoneNumberException) {
					throw new InvalidPhoneNumberException();
				}
			}
		}
		
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) throws InvalidPhoneNumberException
    {
		Pattern pattern=Pattern.compile("^[6-9][0-9]{9}$");
		Matcher m=pattern.matcher(Long.toString(phoneNumber));
		if(m.matches()) {
			this.phoneNumber=phoneNumber;
		}
		else {
			
			  try {
				throw new InvalidPhoneNumberException();
			} catch (InvalidPhoneNumberException e) {
				if(e instanceof InvalidPhoneNumberException) {
					throw new InvalidPhoneNumberException();
				}
			}
		}
    }
	public static void main(String[] args) {
		CustomerMobileNumber validateMobileno=new CustomerMobileNumber();
		try {
			validateMobileno.setPhoneNumber(6591343294l);
			System.out.println(validateMobileno.getPhoneNumber());
		} catch (InvalidPhoneNumberException e) {
			System.out.println(e);
		}

	}

}
