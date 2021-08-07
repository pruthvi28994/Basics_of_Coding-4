package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

class fibonacciNumber{
	static public int findFiboNum(int num) {
		if(num<=1)
			return 1;
		return( findFiboNum(num-1)+findFiboNum(num-2));
	}
}
public class java_fibonacciNumer {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int num=sc.nextInt();
				System.out.println(fibonacciNumber.findFiboNum(num));
			}
		}

	}

}
