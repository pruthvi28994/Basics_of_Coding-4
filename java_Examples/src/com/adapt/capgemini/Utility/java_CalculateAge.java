package com.adapt.capgemini.Utility;
/*
	Create a class AgeCalculator with the following public method:
		calculateAge(String):int[]
	Input parameter to the method should be the date of birth in format dd/mm/yyyy
	Method should calculate and return the age in years and months as on 01/04/2019
	Age should be returned in an integer array of length 2. The first element should contain the years part and the second element should contain months part of age
	If the input date of birth is invalid (greater than or equal to 01/04/2019), method should return null
Note: Ignore the day part of date of birth for calculating age
	Accept date of birth from the console in dd/mm/yyyy format
	Calculate the age using AgeCalculator class and display the age as shown in the example section
	If year part or month part of age is 0, do not display that part
	if date of birth is invalid, display Invalid date of birth

*/




import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

class AgeCalculator{
	public static int[] calculateAge(String date) {
		int arr[] = new int[2];
		String input[]=date.split("/");
		int month=Integer.parseInt(input[1]);
		//int days=Integer.parseInt(input[0]);
		int years=Integer.parseInt(input[2]);
		
		if((years == 2019 && month <=3) || (years<=2018)) {
			LocalDate birthDate=LocalDate.of(years,month,1);
			LocalDate curr=LocalDate.of(2019,4,1);
			arr[0]=Period.between(birthDate, curr).getYears();
			arr[1]=Period.between(birthDate, curr).getMonths();
			return arr;
		}
		
		return null;
	}
}

public class java_CalculateAge {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String date=sc.next();
		int arr[]=AgeCalculator.calculateAge(date);
		if(arr!=null) {
			if (arr[0] != 0 && arr[1] != 0) 
	          {
	              System.out.println("Years : " + arr[0] + ", Months : " + arr[1]);
	              extracted();
	          }
	          
	          if (arr[0] == 0 && arr[1] != 0) 
	          {
	              System.out.println("Months : " + arr[1]);
	              extracted();
	          }
	          
	          if (arr[0] != 0 && arr[1] == 0)
	          {
	              System.out.println("Years : " + arr[0]);
	              extracted();
	          }
		}
		else {
			System.out.println("Invalid Date of birth");
		}
		
		sc.close();
	}

	private static void extracted() {
	}

}
