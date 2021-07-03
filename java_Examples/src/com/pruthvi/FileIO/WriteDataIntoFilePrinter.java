package com.pruthvi.FileIO;

import java.io.*;

public class WriteDataIntoFilePrinter {

	public static void main(String[] args) throws Exception {
		FileWriter writer=new FileWriter("PrinterWriter.txt");
		PrintWriter out=new PrintWriter(writer);
		out.print("Hello Writing data using PrintWriter\n");
		out.println("my age is 23");
		out.append("Address: Mysore,").append("K R Nagar Taluk , ").append("27.05.2021");
		
		out.println();
		out.println();
		
		out.append("SSLC:").print(true);
		out.println();
		
		//make use of printf
		String name="Pruthvi Sagar S";
		String city="Banglore";
		
		out.printf("Myself %s stays in %s",name,city);
		out.close();
		writer.close();
		System.out.println("File Updated");
	}

}
