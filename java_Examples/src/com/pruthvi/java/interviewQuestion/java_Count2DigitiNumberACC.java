package java_Examples;

import java.util.Scanner;

public class java_Count2DigitiNumberACC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Size of the array elements:");
			int size=sc.nextInt();
			int arr[]=new int[size];
			System.out.println("Enter the Elements :");
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Enter the K-digit number to be seached :");
			int k=sc.nextInt();
			System.out.println(CountKDigitNumbers(arr,k));
			
	}

	private static int CountKDigitNumbers(int[] arr, int k) {
		// TODO Auto-generated method stub
		int countK=0,checkDigit=0;
		int ele;
		for(int i =0;i<arr.length;i++) {
				ele=arr[i];
				while(ele>0) {
					ele=ele/10;
					checkDigit++;
					
				}
				if(checkDigit==k) {
					countK++;
				}
				checkDigit=0;
		}
		return countK;
	}

}
