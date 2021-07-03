package com.pruthvi.FileIO;

import java.io.*;

public class WritingNumbersIntoFiles {

	public static void main(String[] args) throws Exception {
		
		//you can file as Argument to the PrintWriter Constructor 
		//or you can define them separately
		PrintWriter out=new PrintWriter(new FileWriter("WritingNumber.txt"));
		
		out.print(132.90); //it will be converted in to character then get stored 
		out.print(100);
		out.print(111);
		//now total of 14 characters are read and file size would be 14bytes
		
		//but glitch here is if i need to perform any sort operations (sum ,sub etc) i can't because everything will be stored in the form of character sequence 
		
		out.close();
		System.out.println("File Updated");
		
		//in order to overcome that glitch make use of DataStream
		FileOutputStream file=new FileOutputStream("DataStreamNumber.txt");
		DataOutputStream out1=new DataOutputStream(file);
		
		//now you can make you of the functions
		//like .writeFloat() , .writeDouble() , .writeByte() etc in order to write the numbers in to file
		out1.writeFloat((float) 123.90);
		out1.writeInt(34);
		out1.writeDouble(1.90);
		out1.writeDouble(23.90);
		out1.writeDouble(1.00);
		out1.writeBoolean(true);
		
		
		//bytes will be 1*sizeofDatatype
		out1.close();
		file.close();
		System.out.println("File Using Data Stream Updated");
		
		
	}

}
