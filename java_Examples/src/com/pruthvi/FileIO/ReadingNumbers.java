package com.pruthvi.FileIO;

import java.io.*;

public class ReadingNumbers {

	public static void main(String[] args) throws Exception {
		
		//how to read the number stored in the file
		
		FileInputStream file=new FileInputStream("DataStreamNumber.txt"); //DataStreamNumber.txt is file which has created using DataOutputStream
		
		BufferedInputStream bf=new BufferedInputStream(file); //buffered because it will keep ready 8KB of data instead of reading character by character
		
		DataInputStream in = new DataInputStream(bf);  //used to read number data from the file
		
		//dataInputstream will provide may functions related to reading the numbers
		
		System.out.println(in.readFloat()); //just reading the float value 
		int i=in.readInt();
		boolean b=in.readBoolean();
		System.out.println(i+" "+b);
		while(true) {
			try {
				double d=in.readDouble(); //will read line by line
				
				System.out.println(d);
			} catch (Exception e) {
				break;
			}
		}
		bf.close();
		in.close();
		file.close();
		System.out.println("File Read Successfully");
	}

}
