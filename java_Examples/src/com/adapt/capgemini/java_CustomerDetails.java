package com.adapt.capgemini;

import java.util.*;
class SimpleDate{
    private int day;
    private int month;
    private int year;
	public SimpleDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public void setDate(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	@Override
	public String toString() {
		return  day + "/" + month + "/" + year;
	}
	
	public static boolean validateDate(SimpleDate d) {
		int day=d.getDay();
		int month=d.getMonth();
		int year=d.getYear();
		if(year<2000) return false;
		if(month <1 || month>12) return false;
        switch(month)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day < 1 || day > 31)
                    return false;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day < 1 || day > 30)
                    return false;
                break;
            case 2:
                if(day < 1 || day > 28)
                    return false;
                break;
        }
		
		return true;
		
	}
    
}
class Address{
	private String area;
	private String city;
	public Address(String area, String city) {
		this.area = area;
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return  area + ", " + city;
	}
	
}

class customer{
	private int custId;
	private String name;
	
	//concept of aggregation
	private  Address address;
	private SimpleDate registrationDate;
	public customer(int custId, String name, Address address, SimpleDate registrationDate) {
		super();
		this.custId = custId;
		this.name = name;
		this.address = address;
		if(!SimpleDate.validateDate(registrationDate)) {
			this.registrationDate=null;
		}
		else {
			this.registrationDate=registrationDate;
		}
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public SimpleDate getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(SimpleDate registrationDate) {
		 if(!SimpleDate.validateDate(registrationDate)) {
			 this.registrationDate=null;
		 }
	}
	@Override
	public String toString() {
		String date="";
		if(this.registrationDate==null) {
			date="Unknown";
		}
		else {
			date=this.registrationDate.toString();
		}
		String Addrs="";
		if(this.address==null) {
			Addrs="Unknown";
		}
		else {
			Addrs=this.address.toString();
		}
		return "Id : " + custId + ", Name=" + name + "\nAddress : " + Addrs + "\nRegistered on : "
				+ date;
	}
}
public class java_CustomerDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1[],input2[],input3[];
		Scanner sc=new Scanner(System.in);
		input1=sc.nextLine().split(" ");
		input2=sc.nextLine().split(" ");
		input3=sc.nextLine().split(" ");
		
		SimpleDate d=new SimpleDate(Integer.parseInt(input3[0]), Integer.parseInt(input3[1]), Integer.parseInt(input3[2]));
		Address ad=new Address(input2[0], input2[1]);
		
		customer c=new customer(Integer.parseInt(input1[0]), input1[1], ad, d);
		System.out.println(c);
		
		
		
		
	}

}
