package com.pruthvi.FileIO;

import java.io.*;
import java.util.*;

public class Java_FileExamples {

	public static void main(String[] args) throws Exception {
			File file=new File("sample.txt");
			//.exists() => will check within the folder whether the file is there are not
			file=new File("time_and_space_complexities");
			if(file.exists()) {
				System.out.println("File exists");
				
				//getAbsolutePath wil return the path of the file
				System.out.println("Path=>"+file.getAbsolutePath());
			}else
				System.out.println("File does'nt Exist");
			//say if i check the exis file
			
			//now lets accept the directory name from the user
			
			try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the directory");
				file=new File(sc.nextLine());
			}
			if(!file.isDirectory()) {
				System.out.println("Input was not a valid directory name");
				return;
			}
			
			//if exits then list all the files
			File[] files=file.listFiles();
			for(File f:files) {
				System.out.printf("[%s] %s\n",f.isDirectory()?"Dir":"File",f.getName());
			}
			File file1 = new File("test.txt");
			File dir=new File("c:\\pruthvi");
			dir.mkdir();
			System.out.println(file1.exists());
			file1.createNewFile();
			System.out.println(file1.exists());
			System.out.println(file1.getName());
			File f = new File("c:\\test\\abc.txt");
			System.out.println(f.getName());
	}

}
