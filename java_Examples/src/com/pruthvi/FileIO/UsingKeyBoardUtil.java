package com.pruthvi.FileIO;

public class UsingKeyBoardUtil {

	public static void main(String[] args) {
		
		String name=KeyBoardUtil.getString("Enter the Name: ");
		int age=KeyBoardUtil.getInt("Enter the Age :");
		String college=KeyBoardUtil.getString("Enter the College Name :");
		int id=KeyBoardUtil.getInt("Enter the College id :");
		Double Fees = KeyBoardUtil.getDouble("Enter the College Fees :");
		
		System.out.println("Name :"+name+" Age :"+age+" College : "+college+" College Id :"+id+" Fees :"+Fees);

	}

}
