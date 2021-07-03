package com.pruthvi.FileIO;

import java.io.*;

public class BufferredWriter {

	public static void main(String[] args) throws Exception {
		//preffered mostly over the other writing 
		
		//as always need a file to write the data use FileWriter
		FileWriter writer=new FileWriter("BufferedWriter.txt");
		
		//buffered class does'nt alone have lot of functions to perform hence we can make use of PrintWriter
		BufferedWriter bufferwriter=new BufferedWriter(writer); 
		//writes the bytes in multiples of 8 
		
		PrintWriter out=new PrintWriter(bufferwriter);
		//printer will take input and writes in to buffer stored in  bufferwriter and buffer writer will take 8kb of data and stores in to file
		
		out.println("Writing the data using Buffered Writer");
		out.append("My name Is Pruthvi Sagar S\n");
		out.print("Price of 1Kg Apple , ");
		out.print(23.56);
		
		bufferwriter.flush(); //will clear all the data
		out.close();
		bufferwriter.close();
		writer.close();
		System.out.println("File updated");
		
	}

}
