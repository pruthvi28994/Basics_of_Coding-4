package com.pruthvi.java.interviewQuestion;

import java.util.*;

/*
 * Professor X had to solve the pereninal problem of the budget for school picnic.Each student is identified by a unique Roll Number r[i] and unique identification number a[i]
 * the total amt f the trip will be calculated as the sum of the cost of the rounds as long as there are at least two students remaining in the class 
 * 
 * in a single round
 *  * professor will select 2 student in the class let them p and q
 *  * choose identification number (a[p]) of the roll number (r[q]) of the other add the value( a[p]*r[q]) to the amount of trip or another option vice versa (a[q]*r[p])
 *  * return one (say p) back to the class while the other (say q) will go and sit in the bus outside or vice versa i.e return q to the class and p goes and sits in the bus
 *  (p and q are indexes of the students)
 *  
 * the professor needs your help.you need to find the minimum possible amount of the trip. considering all the possible ways in which the student can be selected and organized help him out
 * as amount can be larger find its mod with 10^9+7;
 *  
 * Constraint
 *  1<=n<=10^3
 *  1<=a[i]<=10^9
 *  1<=r[i]<=10^5
 *  
 *  output the minimum possible total that can be attained if students are selected optimally
 *  sample test cases
 *  	3
 * 		23	45	56
 * 		11	14	3
 * Explanation :if professor X will first select student 1 and student 3 adding value(a[1]*a[3]=23*3=69) to the total student1 will go and sit in bus while student 3 will return back to the class 
 * 				in the next round ,professor will select the remaining students i.e student 2 and student 3 .he will be adding the value (a[2]*r[3]=45*3=135) to the total.
 * 				after this no more pairs of the students will remain in the class so the minimum possible amount will be 69+135=204
 *  
 * 
 * */
public class java_ProfessorStudentProblemUBER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Identification number
		Vector<Long> a = new Vector<>();
		// Roll Number
		Vector<Long> r = new Vector<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Students");
		int size = sc.nextInt();

		// enter the Identification number;
		System.out.println("Enter the Identification Number");
		for (int i = 0; i < size; i++) {
			a.add(sc.nextLong());
		}
		System.out.println("Enter the Roll Number");
		// enter the Roll Number
		for (int i = 0; i < size; i++) {
			r.add(sc.nextLong());
		}
		System.out.println("Minimum possible amount of the trip =>" + minPosibleTotal(a, r));
	}

	public static Long minPosibleTotal(Vector<Long> a, Vector<Long> r) {
		/*
		 * 3 23 45 56 11 14 3
		 * 
		 * output ==>69+135=204 min value
		 * 
		 * 29,120,33,13,8,9
		 */
		Vector<Long> minValue = new Vector<Long>();
		Long sum1 = 0L;
		Long sum2 = 0L;
		for (int i = 0; i < r.size(); i++) {
			for (int j = 0; j < r.size(); j++) {
				if (i == j)
					continue;
				else {
					sum1 += (r.get(i) * a.get(j)); // because it is given that either way the student can be
													// interchanged i.e a[p]*r[q] or a[q]*r[p]
					sum2 += (r.get(j) * a.get(i));
				}
			}
			minValue.add(sum1);
			minValue.add(sum2);
			sum1 = 0L;
			sum2 = 0L;
		}
//		System.out.println(minValue); just to show value stored in minValue;
		return Collections.min(minValue);
	}

}
