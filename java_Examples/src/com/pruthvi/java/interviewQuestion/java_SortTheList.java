package com.pruthvi.java.interviewQuestion;

/*Write a function that accepts a String sentence as argument and returns a List<String> containing the words from the String input. 
 * The List should be sorted based on the length. The word with the least length should be on the top. In case if two words have the same length, 
 * then they are arranged alphabatically in ascending order.

 * Input:
	"java programming language"
Output:
	[java, language, programming]

Input:
	null
Output:
	[]
 * */
import java.util.*;

public class java_SortTheList {
	public static List<String> sort(String value) {
		String s2 = value.substring(1, value.length() - 1);
		String input[] = s2.split(" ");

		// send input at once using asList()
//	    List<String> list2=new ArrayList<String>(Arrays.asList(input));
		List<String> list = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			list.add(input[i]);
		}
		Collections.sort(list);
		return list;

	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println(sort(sc.nextLine()));
		}
	}

}
