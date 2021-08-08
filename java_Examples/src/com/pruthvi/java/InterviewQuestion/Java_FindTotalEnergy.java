package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

/***
	write an algorithm to find the total energy produced by the chemicals when the reaction happens.
	input:
		input1:number of chemicals available
		input2:N space-separated integers ener1, ener2,,,, energN representing the total energy produced by the chemicals when reaction happens
	output:
	   sum of the total energy of the chemicals whos products of two energies is max
	   
	Example:
		input:
			7
			9 -3 8 -6 -7 8 10
		output:
			19
*/
public class Java_FindTotalEnergy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int energy[]=new int[num];
		for(int i=0;i<num;i++) {
			energy[i]=sc.nextInt();
		}
		int max=0;
		int sum=0;
		for(int i=0;i<num;i++) {
			for(int j=i+1;j<num;j++) {
				if((energy[i]*energy[j])>max) {
					max=energy[i]*energy[j];
					sum=energy[i]+energy[j];
				}
			}
		}
		System.out.println(sum);
		sc.close();

	}

}
