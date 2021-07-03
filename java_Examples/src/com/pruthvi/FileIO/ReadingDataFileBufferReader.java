package com.pruthvi.FileIO;

import java.io.*;
import java.util.*;

public class ReadingDataFileBufferReader {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Path of file:");
		String path=sc.next();
		
		//to read more than one character line by line we can use BufferedReader readLine()
		
		FileReader reader=new FileReader(path);
		//bufferedReader keeps 8kb of data read so that i can read it line by line
		BufferedReader bufferreader=new BufferedReader(reader);
		//Buffer Reader Keeps 8KB of buffer 
		
		String line;
		while((line=bufferreader.readLine())!=null) {
			//now it will print the line
			System.out.println(line);
		}
		
		//bufferreader is more efficent than normal reading character by character
		reader.close();
		sc.close();
	}

}
