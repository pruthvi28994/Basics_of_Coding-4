package com.pruthvi.FileIO;

import java.io.*;
public class DeSerialize {

	public static void main(String[] args) throws Exception {
		//Retrieving the Serialize file back to JVM
		
		FileInputStream file=new FileInputStream("product.dat");
		BufferedInputStream buffered=new BufferedInputStream(file);
		ObjectInputStream in= new ObjectInputStream(buffered);
		
		//.readObject() will return the object that is read
		
		System.out.println("Reading the Objects from the file Usign ObjectInputStream");
		while(true) {
			try {
				Object obj=in.readObject();
				System.out.println(obj);
			} catch (ClassNotFoundException e) {
				break;
			} catch (EOFException e) {
				break;
			}
		}
		
		in.close();
		file.close();
	}

}
