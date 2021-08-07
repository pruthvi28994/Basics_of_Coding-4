package com.pruthvi.java.InterviewQuestion;

import java.util.*;

public class Java_SumOfListElements {

	public static List<Integer> getSumOfListElements(List<Integer> first, List<Integer> second) {
		List<Integer> result = new ArrayList<>();
		if (first == null && second == null) {
			return result;
		}
		if (first == null) {
			return second;
		}
		if (second == null) {
			return first;
		}
		int size1 = first.size();
		int size2 = second.size();
		int sizeMAX = (size1 >= size2) ? size1 : size2;
		for (int i = 0; i < sizeMAX - Math.abs(size1 - size2); i++) {
			result.add(i, first.get(i) + second.get(i));
		}
		for (int i = result.size(); i < sizeMAX; i++) {
			if (first.size() == sizeMAX) {
				result.add(i, first.get(i));
			} else if (second.size() == sizeMAX) {
				result.add(i, second.get(i));
			}
		}
		return result;

	}

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			// accepting the input in the form of string
			String s1 = sc.nextLine();
			s1 = s1.substring(1, s1.length() - 1);
			String input1[] = s1.split(",");
			for (int i = 0; i < input1.length; i++) {
				list1.add(Integer.parseInt(input1[i]));
			}

			String s2 = sc.nextLine();
			s2 = s2.substring(1, s2.length() - 1);
			String input2[] = s2.split(",");
			for (int i = 0; i < input2.length; i++) {
				list2.add(Integer.parseInt(input2[i]));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(getSumOfListElements(list1, list2));
	}
}