package com.pruthvi.FileIO;

import java.io.Serializable;

//if i make Product class to implement the Serializable class
//then only JVM allows the external ObjectStream to have access over the data and read that data in to file
class Product implements Serializable{
	/**
	 * now we have approved object of Product can be read into the file
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String productName;
	private double price;
	
	public Product() {
		super();
	}
	public Product(int id, String productName, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", price=" + price + "]";
	}	
	
}
