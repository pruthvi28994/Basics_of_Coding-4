package java_Examples;

import java.util.Scanner;

public class java_PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number greater than 2:");int num=sc.nextInt();
		boolean flag=true;
		boolean result=check_prime(num);
		if(result==true) {
			System.out.println(num+" is a prime number");
		}
		else {
			System.out.println(num+" is complex number");
		}
	}

	 public static boolean check_prime(int num) {
		// TODO Auto-generated method stub
		 boolean result=true;
//		 for(int i=2;i<num/2;i++) {
//			 if(num%i==0) {
//				 result=false;
//			 }
//		 }
		 // optimization of code
		 int cond=(int)Math.sqrt(num);
		 for(int i=2;i<=cond;i++) {
			 if(num%i==0) {
				 result=false;
				 break;
			 }
		 }
		return result;
	}

}
