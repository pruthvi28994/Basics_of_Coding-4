package com.adapt.capgemini.caseStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.naming.InvalidNameException;

class Customer
{
    private int userId;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String city;
    private String gender;
    private long phoneNumber;
    private Address address;
    
  //should accept the firstname and lastname if it has length >6 and should not contain any special characters
    
    Customer(){}
    Customer(int userId, String email, String password, String firstName, String lastName
    , String city, String gender, long phoneNumber, Address address) throws InvalidNameException
    {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        if(this.firstName.length()<6 || this.lastName.length()<6) {
			throw new InvalidNameException();
		}
		Pattern pattern=Pattern.compile("[^A-Za-z]");
		Matcher m1=pattern.matcher(this.lastName);
		Matcher m2=pattern.matcher(this.firstName);
		if(m1.find() || m2.find()) {
			throw new InvalidNameException();
		}
    }

    public int getUserId()
    {
        return this.userId;
    }
    
    public String getEmailId()
    {
        return this.email;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public String getFirstName()
    {
        return this.firstName;
    }
    
    public String getLastName()
    {
        return this.lastName;
    }
    
    public String getCity()
    {
        return this.city;
    }
    
    public String getGender()
    {
        return this.gender;
    }
    
    public long getPhoneNumber()
    {
        return this.phoneNumber;
    }
    
    public Address getAddress()
    {
        return this.address;
    }
    
    //setters
    public void setUserId(int uid)
    {
        this.userId = uid;
    }
    
    public void setEmailId(String a)
    {
        this.email = a;
    }
    
    public void setPassword(String a)
    {
        this.password = a;
    }
    
    public void setFirstName(String a) throws InvalidNameException
    {
        this.firstName = a;
        if(this.firstName.length()<6) {
			throw new InvalidNameException();
		}
		Pattern pattern=Pattern.compile("[^A-Za-z]");
		Matcher m=pattern.matcher(this.firstName);
		if(m.find()) {
			throw new InvalidNameException();
		}
    }
    
    public void setLastName(String a) throws InvalidNameException
    {
        this.lastName = a;
        if(this.lastName.length()<6) {
			throw new InvalidNameException();
		}
		Pattern pattern=Pattern.compile("[^A-Za-z]");
		Matcher m=pattern.matcher(this.lastName);
		if(m.find()) {
			throw new InvalidNameException();
		}
    }
    
    public void setCity(String a)
    {
        this.city = a;
    }
    
    public void setGender(String a)
    {
        this.gender = a;
    }
    
    public void setPhoneNumber(long a)
    {
        this.phoneNumber = a;
    }
    
    public void setAddress(Address a)
    {
        this.address = a;
    }
    
    //toString
    @Override
    public String toString()
    {
        return String.format("Customer [userId=%d, emailId=%s, password=%s, firstName=%s, lastName=%s, city=%s, gender=%s, phoneNumber=%d, address=%s]",
                        userId, email, password, firstName, lastName, city, gender, phoneNumber, address);
    }
    
}

class Address
{
    private String city;
    private String state;
    private int zip;
    private String country;

    Address(){}
    Address(String city, String state, int zip, String country)
    {
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }
    
    //getter
    public String getCity()
    {
        return this.city;
    }
    
    public String getState()
    {
        return this.state;
    }
    
    public int getZip()
    {
        return this.zip;
    }
    
    public String getCountry()
    {
        return this.country;
    }
    
    //setters
    public void setCity(String a)
    {
        this.city = a;
    }
    
    public void setState(String a)
    {
        this.state = a;
    }
    
    public void setZip(int a)
    {
        this.zip = a;
    }
    
    public void setCountry(String a)
    {
        this.country = a;
    }
    
    //toString
    @Override
    public String toString()
    {
        return String.format("Address [city=%s, state=%s, zip=%d, country=%s]",
                            city, state, zip, country);
    }   
}
public class CustomerAndAddress{
	public static void main(String[] args) {
		Address a=new Address("Chennai","TamilNadu",600075,"India");
		Customer c;
		try {
			c = new Customer(101,"raj@gmail.com","xxxxxx","Krithick","Rajan","Chennai","Male",9001018761L,a);
			System.out.println(c);
		} catch (InvalidNameException e) {
			System.out.println(e);
		}
		
	}
}