package com.adapt.capgemini;

import java.util.Scanner;

//DO NOT EDIT THIS CLASS
class Product {
	private int prodCode;
	private String prodName;
	private double price;
	private String category;
	
	public Product(int prodCode, String prodName, double price, String category) {
		this.prodCode = prodCode;
		this.prodName = prodName;
		this.price = price;
		this.category = category;
	}

	public int getProdCode() {
		return prodCode;
	}

	public void setProdCode(int prodCode) {
		this.prodCode = prodCode;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}


//DO NOT EDIT THIS CLASS
class ProductData {
	
	private static Product[] products;
				
	static {
		products = new Product[8];
		products[0] = new Product(101, "keyboard", 300, "computers");
		products[1] = new Product(102, "mouse", 600, "computers");
		products[2] = new Product(103, "monitor", 5000, "computers");
		products[3] = new Product(104, "t-shirt", 500, "clothing");
		products[4] = new Product(105, "jeans", 2000, "clothing");
		products[5] = new Product(106, "sweater", 1000, "clothing");
		products[6] = new Product(107, "doll", 500, "toys");
		products[7] = new Product(108, "car", 1000, "toys");
	}

	public static Product[] getProducts() {
		return products;
	}
}


class ProductService
{
  public static String findNameByCode(int prodcode) {
	 
	  Product product[]=ProductData.getProducts();
	  for(Product pdcode:product) {
		  if(pdcode.getProdCode()==prodcode)
			  return pdcode.getProdName();
	  }
	   return null;
  }
  
  public static Product findMaxPriceProduct(String category) {
	  
	  Product products[] = ProductData.getProducts();
	  double max=0.0;
	  
	  //search max price 
	  for(Product p:products) {
		  if(category.equalsIgnoreCase(p.getCategory())) {
			  if(p.getPrice()>max) {
				  max=p.getPrice();
			  }
		  }
	  }
	  for(Product p:products) {
		  if(category.equalsIgnoreCase(p.getCategory())) {
			  if(p.getPrice()==max) {
				  return p;
			  }
		  }
	  }
	  return null;
	  
  }
}

public class java_ProductAnalysis{
  public static void main(String [] args){
      Scanner sc=new Scanner(System.in);
      int ch=sc.nextInt();
      String cat;
	  switch(ch) {
	  		case 1:cat=ProductService.findNameByCode(sc.nextInt());
	  				if(cat!=null)
	  					System.out.println(cat);
	  				else
	  					System.out.println("Product Not Found");
	  				break;
	  		case 2:
	  				Product p=ProductService.findMaxPriceProduct(sc.next());
	  				if(p!=null)
	  					System.out.println(p.getProdCode()+" | "+p.getProdName()+" | "+p.getPrice());
	  				else 
	  					System.out.println("No Products in given category");
	  				break;
	  		default:System.out.println("INVALID CHOICE");
	  }
  }
}