package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;
/*
 * 7 type of Indian Notes are given i.e Re 1, Re 2, Re 5, Re 10, Re 20 , Re 50 ,and Rs 100
 * implement the following function
 * int minNumberOfNotes(int n);
 * 
 * the function accepts an integer 'n' as its argument. Implement the function to find and return the min number of Notes required to form the amount 'n'.
 * Assumption:n>0;
 * Note :
 *     * Return 0, if n=0;
 *     * Multiple notes of same type can be used
 * Example :
 * input:
 * 		n=175
 * output:
 * 		4 notes required to form Rs 175 are:
 * 			* 1 note of Rs.100 = 1*100 = 100;
 * 			* 1 note of Rs 50 = 1*50 = 50
 * 	`		* 1 note of Rs 20 = 1*20 = 20
 * 			* 1 note of Rs 5 = 1*5= 5 
 * 		100+50+20+5=175 
 * 		so min of 4 notes require
 * */
public class java_minNumOfNotes {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int amount=sc.nextInt();
				int notes=minNumOfNotes(amount);
				System.out.println("Min Number of Notes Required is "+notes);
				
			}
		}

	}

	public static int minNumOfNotes(int amount) {
		int notes=0;
		if(amount/100>=1) {
			int count100=amount/100;
			notes+=count100;
			amount=amount-(count100*100);
		}
		if(amount/50>=1) {
			int count50=amount/50;
			notes+=count50;
			amount=amount-(count50*50);
		}
		if(amount/20>=1) {
			int count20=amount/20;
			notes+=count20;
			amount=amount-(count20*20);
		}
		if(amount/10>=1) {
			int count10=amount/10;
			notes+=count10;
			amount=amount-(count10*10);
		}
		if(amount/5>=1) {
			int count5=amount/5;
			notes+=count5;
			amount=amount-(count5*5);
		}
		if(amount/2>=1) {
			int count2=amount/2;
			notes+=count2;
			amount=amount-(count2*2);
		}
		if(amount/1>=1) {
			int count1=amount/1;
			notes+=count1;
			amount=amount-(count1*1);
		}
		return notes;
	}

}















