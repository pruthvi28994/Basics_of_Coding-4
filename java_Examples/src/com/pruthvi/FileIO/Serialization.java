package com.pruthvi.FileIO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws Exception {
		
		//write the object in secondry storage for further use since obj is deleted by garbage collecter
		Product[] products= new Product[] {
				new Product(1001,"RouterUps",2000.0),
				new Product(1002,"TV",23000.50),
				new Product(1003,"Dress Wrong",1940.24),
				new Product(1004,"SSD Hardrive",1340.0),
				new Product(1005,"Lenovo Charger",2500.90),
				
		};
		
		FileOutputStream file=new FileOutputStream("product.dat");
		
		ObjectOutputStream out= new ObjectOutputStream(file);
		
		for (int i = 0; i < products.length; i++)
			out.writeObject(products[i]);
		out.close();
		file.close();
		System.out.println("Product Data read in to file");
		
	}

}
