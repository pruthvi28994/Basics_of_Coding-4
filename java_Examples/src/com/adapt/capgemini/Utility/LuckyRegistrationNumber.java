package com.adapt.capgemini.Utility;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * The input parameter is a vehicle registration number and the output is -1, 0 or 1 based on below given rules.

*   If the Vehicle registration number is valid as per the below format the method should return 0, else -1

*	PPXXQQYYYY
		PP - Should be either KA or DL
		XX - Number from 01 to 10
		QQ - 1 or 2 alphabets from A-Z(uppercase)
		YYYY - Number from 1000 to 9999 
		Ex: KA01MG2323, DL10G5454
		//0 : valid
        //-1 : invalid
        // 1 : valid + lucky
*/
public class LuckyRegistrationNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String number=sc.nextLine();
		if(checkRegistrationNumber(number)==1) {
			System.out.println("Lucky registration number");
		}
		else if(checkRegistrationNumber(number)==0) {
			System.out.println("Valid registration number");
		}
		else
			System.out.println("Invalid registration number");
		sc.close();

	}
	public static int checkRegistrationNumber(String number) {
		
		//[KA|DL] is like K|A|D|L it wont check KA | DL so 
		//(KA|DL) checks KA | DL
		if(number == null)
            return -1;
        
        if (number.isEmpty() )
        	return -1;
		String pattern="^(KA|DL){1}(01|02|03|04|05|06|07|08|09|10){1}[A-Z]{1,2}[1-9]{1}[0-9]{3}$";
		Pattern p=Pattern.compile(pattern);
		int sum;
		Matcher m=p.matcher(number);
		if(m.find()) {
				try {
					int input1=Integer.parseInt(number.substring(number.length()-4,number.length()));
					sum=divideNum(input1);
					if(sum==6) {
						return 1;
					}
				}
				catch(Exception e) {
					return 1;
				}
			return 0;
		}
		return -1;
	}
	public static int divideNum(int input1) {
		int sum=0,rem;
		while(input1>0) {
			rem=input1%10;
			sum+=rem;
			input1/=10;
		}
		if(sum>9) {
			return divideNum(sum);
		}
		return sum;
	}

}
