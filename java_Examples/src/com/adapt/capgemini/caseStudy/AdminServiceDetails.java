package com.adapt.capgemini.caseStudy;

import java.time.LocalDateTime;

class ServiceDetails{
	private int serviceId;
	private int busId;
	private LocalDateTime depDateTime;
	private LocalDateTime arrDateTime;
	private String arrCity;
	private String deptCity;
	private double cost;
	private int seatsLeft;
	private int totalSeats;
	public ServiceDetails() {
		super();
	}
	public ServiceDetails(int serviceId, int busId, LocalDateTime deptDateTime, LocalDateTime arrDateTime, String arrCity,
			String deptCity, double cost, int seatsLeft, int totalSeats) {
		super();
		this.serviceId = serviceId;
		this.busId = busId;
		this.depDateTime = deptDateTime;
		this.arrDateTime = arrDateTime;
		this.arrCity = arrCity;
		this.deptCity = deptCity;
		this.cost = cost;
		this.seatsLeft = seatsLeft;
		this.totalSeats = totalSeats;
	}
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public int getBusId() {
		return busId;
	}
	public void setBusId(int busId) {
		this.busId = busId;
	}
	public LocalDateTime getDeptDateTime() {
		return depDateTime;
	}
	public void setDeptDateTime(LocalDateTime deptDateTime) {
		this.depDateTime = deptDateTime;
	}
	public LocalDateTime getArrDateTime() {
		return arrDateTime;
	}
	public void setArrDateTime(LocalDateTime arrDateTime) {
		this.arrDateTime = arrDateTime;
	}
	public String getArrivalCity() {
		return arrCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrCity = arrivalCity;
	}
	public String getDeptCity() {
		return deptCity;
	}
	public void setDeptCity(String deptCity) {
		this.deptCity = deptCity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getSeatsLeft() {
		return seatsLeft;
	}
	public void setSeatsLeft(int seatsLeft) {
		this.seatsLeft = seatsLeft;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
	public String toString() {
		return "ServiceDetails [serviceId=" + serviceId + ", busId=" + busId + ", depDateTime=" + depDateTime
				+ ", arrDateTime=" + arrDateTime + ", arrCity=" + arrCity + ", deptCity=" + deptCity + ", cost="
				+ cost + ", seatsLeft=" + seatsLeft + ", totalSeats=" + totalSeats + "]";
	}
	
}

class Admin{
	private int adminId;
	private String email;
	private String firstName;
	private String lastName;
	private String password;
	
	public Admin() {
		super();
	}
	public Admin(int adminId, String email, String firstName, String lastName, String password) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
	}
	
	public Admin(int adminId, String email, String firstName, String password) {
		super();
		this.adminId = adminId;
		this.email = email;
		this.firstName = firstName;
		this.password = password;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getEmailId() {
		return email;
	}
	public void setEmailId(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", emailId=" + email + ", firstName=" + firstName + ", password=" + password
				+ "]";
	}
	
}
public class AdminServiceDetails {

	public static void main(String[] args) {
		

	}

}
