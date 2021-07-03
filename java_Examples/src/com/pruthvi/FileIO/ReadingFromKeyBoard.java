package com.pruthvi.FileIO;

import java.io.*;
import java.util.Scanner;

public class ReadingFromKeyBoard {

	public static void main(String[] args) throws Exception {
		String name="";
		int ch;
		//using System.in.read();
		System.out.println("Enter the Name:");
		while((ch=System.in.read())!='\r') {
			name+=(char)ch;
		}
		System.out.println("Enter name was "+name);
		
		//now lets pass .read() in to bytes;
		byte[] bytes=new byte[100];
		System.out.println("Enter the Name:");
		System.in.read(bytes);
		name=new String(bytes).trim();
		System.out.println("Name :"+name);
		System.out.println("Enter Location:");
		System.in.read(bytes);
		String city=new String(bytes).trim();
		
		System.out.println(" Location : "+city);
		
//		//now lets read whole line as input
		InputStreamReader reader=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(reader);
		
		System.out.println("Enter the College :");String college=in.readLine();
		System.out.println("Enter the USN :");String USN=in.readLine();
		System.out.println("College Name: "+college+" USN :"+USN);
		
		
		//now making use of Scanner class 
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter name:");
		name=sc.nextLine();
		
		System.out.println("Enter the Age:");
		int age=sc.nextInt();
		
		//IMPORTANT : Enter name:
		//Pruthvi Sagar S
		//Enter the Age:
		//41
		//Enter the CollegeFees
		//Name : Pruthvi Sagar S Age :41 College Fees : 
		//here you can see when you enter 41 it dont ask for collegefess and directly prints because after you enter nextInt it things \r\n i.eEOF hence prints output 
		//solution here is use sc.nextLine again in nextLine or use sc.next() in next input statement ..generally these causes InputMismatch Error
		
		sc.nextLine();
		System.out.print("Enter the CollegeFees");
		String CollegeFee=sc.nextLine();
		System.out.println("Name : "+name+" Age :"+age+" College Fees : "+CollegeFee);
		
		
		//or best practice is by creating the keyBoard util
		
		sc.close();
	}

}
