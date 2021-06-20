package java_Examples;

import java.util.Scanner;

public class java_Accenture {

	/*
		if the given steps number is even you are allowed to jump n/2 
		below at maximum and if the step no is odd you are allowed to jump 1 step below
		print the min number of steps required to win this game from the given input
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minStep(20));

	}

	private static int minStep(int num) {
		// TODO Auto-generated method stub
		int count=0;
		while(num>0) {
			if(num%2==0) {
				num=num/2;
				count++;
			}else {
				num=num-1;
				count++;
			}
		}
		return count;
	}

}
