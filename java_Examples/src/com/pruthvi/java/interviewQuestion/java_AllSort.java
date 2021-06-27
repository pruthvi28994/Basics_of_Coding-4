package com.pruthvi.java.interviewQuestion;

import java.util.*;

public class java_AllSort {

	// calling the class seaching tech so that we can reuse the array and variables
	// instead of redefining it
	java_SearchingTech search;

	public java_AllSort(int size) {
		search = new java_SearchingTech(size);
	}

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size of the array");
			java_AllSort sort = new java_AllSort(sc.nextInt());
//			sort.Bubble_Sort();
//			System.out.println("1) Elements after Bubble Sort:");
//			sort.display();
//			sort.insertion_sort();
//			System.out.println("2) Element after Insertion Sort");
//			sort.display();
			sort.selection_Sort();
			System.out.println("3) Element after Selection Sort");
			sort.display();

		}
	}

	void display() {
		for (int i = 0; i < search.MAX_SIZE; i++) {
			System.out.print(search.search_array[i] + " ");
		}
		System.out.println();
	}

	void Bubble_Sort() {
		search.insert();
		for (int i = 0; i < search.MAX_SIZE - 1; i++) {
			for (int j = 0; j < search.MAX_SIZE - i - 1; j++) {
				if (search.search_array[j] > search.search_array[j + 1]) {
					// in java there is no concept called pointer hence iam passing the position
					// value
					search.swap(j, j + 1);
				}
			}
		}
	}

	void insertion_sort() {
		search.insert();
		int key, j;

		// insertion sort will sort all the elements before the refernce of i
		// 15 13 14 1 2 3
//		   j    i
//		   key=a[i]
//		   a[j]>key
//		   a[j+1]=a[j]
		for (int i = 1; i < search.MAX_SIZE; i++) {
			key = search.search_array[i];
			j = i - 1;
			while (j >= 0 && search.search_array[j] > key) {
				search.search_array[j + 1] = search.search_array[j];
				j--;
			}
			search.search_array[j + 1] = key;
		}
	}

	// selection sort

	void selection_Sort() {
		int min;
		search.insert();
		for (int i = 0; i < search.MAX_SIZE - 1; i++) {
			min = i;
			for (int j = i + 1; j < search.MAX_SIZE; j++) {
				if (search.search_array[j] < search.search_array[min]) {
					min = j; // this loop finds the min element index by traversing
				}
			}
			search.swap(min, i); // if found swaps the index
		}
	}

}
