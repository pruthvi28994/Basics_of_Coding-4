package com.pruthvi.java.interviewQuestion;

import java.util.Scanner;

public class Java_SearchingTech {
	public int MAX_SIZE;
	public int search_array[];
	Scanner sc = new Scanner(System.in);

	Java_SearchingTech(int MAX_SIZE) {
		this.MAX_SIZE = MAX_SIZE;
		search_array = new int[MAX_SIZE];
	}

	void insert() {
		// TODO Auto-generated method stub
		System.out.println("!!!Enter the Elements!!!");
		for (int i = 0; i < MAX_SIZE; i++) {
			search_array[i] = sc.nextInt();
		}
	}

	// swapping elements used in sorting
	void swap(int pos1, int pos2) {
		int temp;
		temp = search_array[pos1];
		search_array[pos1] = search_array[pos2];
		search_array[pos2] = temp;
	}

	// Binary Search
	int Binary_Search(int ele) {
		int low = 0, high = MAX_SIZE - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (ele == search_array[mid]) {
				return mid + 1;
			}

			if (ele < search_array[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		return -1;
	}

	// linear search;
	int Linear_Search(int ele) {
		for (int i = 0; i < MAX_SIZE; i++) {
			if (search_array[i] == ele) {
				return i + 1;
			}
		}
		return -1;
	}

	void result_check(int res) {
		if (res == -1) {
			System.out.println("Element Not Found");
		} else {
			System.out.println("Element found at Position " + res);
		}
	}

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size of the array");
			Java_SearchingTech search = new Java_SearchingTech(sc.nextInt());

			System.out.println("Enter the array elements");
			search.insert();
			System.out.println("Enter element to Search using Binary Search");
			search.result_check(search.Binary_Search(search.sc.nextInt()));
			System.out.println("Enter element to Search using Linear Search");
			search.result_check(search.Linear_Search(search.sc.nextInt()));
		}
		System.out.println();
	}

}
