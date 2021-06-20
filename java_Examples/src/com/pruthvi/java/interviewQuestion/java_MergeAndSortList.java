package com.pruthvi.java.interviewQuestion;

import java.util.*;

/*
 *	 Complete the main method as given below:
	Input should be accepted using console
	Accept 10 integers and create two List's each containing 5 integers
	Display the returned ArrayList
	Refer sample output for formatting specifications.Merge the two List's and sort the merged List in ascending order 
	Fetch the elements at 2nd, 6th and 8th index into a new List and return the List.(index starts from 0)
	Method should throw IllegalArgumentException, if the input list does not contain exactly 5 elements or if the input list is null
	Note: The input lists should not be modified in the method

 * Example
	Sample Input:
	3 1 17 11 19
	5 2 7 6 20

	Sample Output:
	[3, 11, 19]
	Sample Input:
	1 2 3 4 5
	6 7 8 9 10

	Sample Output:
	[3, 7, 9]   
 * 
 * */
public class java_MergeAndSortList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list1 = new ArrayList<Integer>();
		System.out.println("Enter the first List Elements");
		for (int i = 0; i < 5; i++) {
			if (sc.hasNextLine())
				list1.add(sc.nextInt());
			else
				throw new IllegalArgumentException();
		}
		System.out.println("Enter the Second List Elements");
		List<Integer> list2 = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			if (sc.hasNextLine())
				list2.add(sc.nextInt());
			else
				throw new IllegalArgumentException();
		}
		System.out
				.println("After mergining and sorting the list(2,6,8) indexed position\n" + mergeAndSort(list1, list2));
	}

	public static List<Integer> mergeAndSort(List<Integer> al1, List<Integer> al2) {
		List<Integer> combined = new ArrayList<>();
		combined.addAll(al1);
		combined.addAll(al2);
		Collections.sort(combined);
		List<Integer> result = new ArrayList<>();
		result.add(combined.get(2));
		result.add(combined.get(6));
		result.add(combined.get(8));
		return result;
	}

}
