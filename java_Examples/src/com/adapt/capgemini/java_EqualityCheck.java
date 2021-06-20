package com.adapt.capgemini;

class Customer2{
    private int customerId;
    private String Name;
    private String city;
    private String phone;
    private String email;
	public Customer2() {
	}
	public Customer2(int customerId, String name, String city, String phone, String email) {
		super();
		this.customerId = customerId;
		Name = name;
		this.city = city;
		this.phone = phone;
		this.email = email;
	}



	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getName() {
		return Name;
	}



	public void setName(String name) {
		Name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override //Equals method
	public boolean equals(Object obj) {
		if(obj==null) return false;
		Customer2 c=(Customer2)obj;
		if(!getResult(this.Name,c.getName())) return false;
		else if(!getResult(this.city,c.getCity())) return false;
		else if(!getResult(this.email,c.getEmail())) return false;
		else if(!getResult(this.phone,c.getPhone())) return false;
		return this.customerId==c.getCustomerId();
		
		
	}
	private boolean getResult(String a,String b) {
		if(a==null && b!=null) return false;
		else if(a!=null && b==null) return false;
		else if(a!=null && b!=null) return a.equals(b);
		return true;
	}
	// STUDENT CODE ENDS HERE
}
public class java_EqualityCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Customer2 c1 = new Customer2(1, "Vinod", "Bangalore", null, null);
        Customer2 c2 = new Customer2(1, "Vinod", "Bangalore", null, null);
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        c1.setEmail("vinod@mailinator.com");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        c2.setEmail("vinod@mailinator.com");
        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c1));
        Customer2 c3 = new Customer2();
        Customer2 c4 = new Customer2();
        System.out.println(c3.equals(c4));
	}

}
