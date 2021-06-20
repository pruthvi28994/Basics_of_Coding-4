package com.adapt.capgemini.StringBuilder;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ColourCodeValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            	   String input1=sc.next();
            	   if(validateHexCode(input1)==1)
            		    System.out.println("Valid Code");
            	   else
            		   System.out.println("Invalid Code");
            	   break;
            case 2:
            		String input2=sc.next();
            	   if(validateDecimalCode(input2)==1)
            		   System.out.println("Valid Code");
            	   else
            		   System.out.println("Invalid Code");
            	   break;
           default:System.out.println("Invalid Choice");
                    
        }

	}
    public static int validateHexCode(String code){
       String pattern="^[#]{1}[A-F0-9]{6}$";
 	   Pattern p=Pattern.compile(pattern);
 	   Matcher m=p.matcher(code);
 	  if(m.find()) {
 		 return 1;  
 	  }
 	  else {
 		return -1;  
 	  }
    }
    public static int validateDecimalCode(String code){
        if(code.startsWith("rgb(") && code.endsWith(")")) {
        	code=code.substring(4,code.length()-1);
        	String input[]=code.split(",");
        	for(String r:input) {
        	  try {
        		int num=Integer.parseInt(r);
        		if(num>=0 && num<=255) {
        			continue;
        		}else {
        			return -1;
        		}
        	 }
        	  catch(Exception e) {
        		  return -1;
        	  }
        	}
        	return 1;
        }
    	return -1;
    }
}
