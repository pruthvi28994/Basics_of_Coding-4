package com.adapt.capgemini;

import java.util.*;

class Utility
{
    public static int fahrenheitToCelcius(double farhenheit)
    {
        return (int)Math.round((farhenheit - 32) * 5 / 9);
        
    }
    
    public static String  getLevel(int a[])
    {
        int sum=0;
        for(int i=0; i<a.length; i++)
        {
            sum += a[i];
        }
        if(sum >= 100)
            return "HIGH";
        else if(sum >= 70)
            return "MEDIUM";
        else if(sum < 70)
            return "LOW";
        return "";
    }
}
public class java_FahrenheitToCelcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1: System.out.println(Utility.fahrenheitToCelcius(sc.nextInt()));
            		break;
            case 2:int size=sc.nextInt();
            		int a[]=new int[size];
            		for (int i = 0; i <size; i++) {
						a[i]=sc.nextInt();
					}
            		System.out.println(Utility.getLevel(a));
            		break;
            default:System.out.println("INVALID_OPTION");
        }
	}

}
