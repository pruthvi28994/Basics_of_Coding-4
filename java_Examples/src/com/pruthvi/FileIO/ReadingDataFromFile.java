package com.pruthvi.FileIO;

import java.io.*;
import java.util.*;

public class ReadingDataFromFile {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Path of file:");
		String path=sc.next();
		
		//file reader alone does'nt have lot of functions to read file though we have read() which is not effective
		
		FileReader reader=new FileReader(path);
		//read()=>The character read, or -1 if the end of the stream has been reached
		int ch;
		while((ch=reader.read())!=-1) {
			
			//these loop reads all the file contents until it encounter nocharacter(-1)
			System.out.print((char)ch); //type casting bcz .read() will return the ASCII value of the letter
		}
		
		
		//other way to access the content of file efficently is BufferedReader
		reader.close();
		sc.close();
	}

}
