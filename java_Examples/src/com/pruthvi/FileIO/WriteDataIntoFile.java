package com.pruthvi.FileIO;

import java.io.*;

/*
 * FileWriter has a constructor that takes 2 parameters too: The file name and a boolean.
 * The boolean indicates whether to append or overwrite an existing file. 
 * Writer fileWriter = new FileWriter("c:\\data\\output.txt", true);  //appends to file
 * Writer fileWriter = new FileWriter("c:\\data\\output.txt", false); //overwrites file
 * 
 * */
public class WriteDataIntoFile {

	public static void main(String[] args) throws Exception {
		FileWriter writer;  //filewriter object;
		writer=new FileWriter("info.txt");
		
		//.write(String str) ==> helps you write the contents to file
		writer.write("Hello my name is Pruthvi Sagar S from Banglore");
		writer.write("\n Nitte Meenakshi Institute of Technology");
		writer.close();
		
		//to verify if writer executes correctly
		System.out.println("File data is updated");
		
		//when you need write numbers other than text prefer printer class
	}

}
