package com.pruthvi.java.interviewQuestion;

public class java_Accenture2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] bs = { 4, 3, 5 };
		int count = 0;
		int[] bs1 = new int[bs.length];
		for (int i = 1; i < bs.length; i++) {

			if (bs[i] < bs[0]) {
				bs1[i - 1] = bs[i];
			} else {

			}
		}
	}

}
