package com.pruthvi.java.interviewQuestion;

/*
 * Task is to find whether two object of Person is same or not by overriding the equals method ,check all the fields of Person class
 * return true of objects are same or false if any one condition fails 
 * Note :you should also check whether the object is instance of Person return true if it is
 * input:  
 * 		p1="Pruthvi",10001,'M'
 * 		p2="Pruthvi",10001,'M'
 * 			two person are same
 * input:
 * 	    p1=new Person()
 * 		p2="Pruthvi",10001,'M'
 * 			two person are different
 * */
class Person{
	String personName;
	int personId;
	char gender;
	
	public Person() {
		super();
	}
	public Person(String personName, int personId, char gender) {
		super();
		this.personName = personName;
		this.personId = personId;
		this.gender = gender;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personId=" + personId + ", gender=" + gender + "]";
	}
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		//check whether object is instance of Person
		if(!(obj instanceof Person)) return false;
		Person person=(Person)obj;
		if(this.personId!=person.personId) return false;
		if(!this.personName.equalsIgnoreCase(person.personName)) return false;
		if(this.gender!=person.gender) return false;
		return true;
	}
	
	
}
public class Java_twoPersonSame {

	public static void main(String[] args) {
		Person p1=new Person("Pruthvi",10001,'M');
		Person p2=new Person("Pruthvi",10001,'F');
		//if obj is null
		//Person p3=new Person();
		
		//lets create object of different class
		//java_sumPrimeFactors diffobj=new java_sumPrimeFactors();
		//it fails because we are checking obj is instance of Person
		if(p1.equals(p2))
			System.out.println("Two person are same");
		else 
			System.out.println("Two person are different");

	}

}
