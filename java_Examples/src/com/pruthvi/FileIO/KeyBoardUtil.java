package com.pruthvi.FileIO;

import java.util.Scanner;

public class KeyBoardUtil {
	
		//in order to overcome InputMisMatch Error we can create our own Keyboard utill class and call it
		static Scanner sc=new Scanner(System.in);
		//for Accepting the String
		public static String getString(String msg) {
			System.out.print(msg);
			String res =sc.nextLine();
			return res;
		}
		
		//for Accepting the int
		public static int getInt(String msg) {
			System.out.print(msg);
			int res =sc.nextInt();
			sc.nextLine(); 
			//if you dont use these in case you next input is string it will give you input mismatch error
			//Exception in thread "main" java.util.InputMismatchException
			return res;
		}
		
		//for Accepting the Double
		public static Double getDouble(String msg) {
			System.out.print(msg);
			Double res =sc.nextDouble();
			sc.nextLine();
			return res;
		}
		//for Accepting the Float
		public static float getFloat(String msg) {
			System.out.print(msg);
			float res =sc.nextFloat();
			sc.nextLine();
			return res;
		}
		
}
