package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

public class Java_Queue {
	public int rear = -1;
	public int front = -1;
	public int maxsize;
	public int[] Q = new int[10000];

	// queue-->FIFO
	// insertion at rear and deletion at front end
	public Java_Queue() {
		rear = 0;
		front = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_Queue queue = new Java_Queue();
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size of the queue");
			queue.maxsize = sc.nextInt();
			int Q[] = new int[queue.maxsize];
			System.out.println();
			System.out.println("Enter the elements:");

			for (int i = 0; i <= queue.maxsize; i++) {
				queue.insert(sc.nextInt());
			}
			for (int i = 0; i <= queue.maxsize; i++) {
				queue.delete();
			}
			System.out.println(Q[1]);
		}
	}

	void insert(int element) {
		// TODO Auto-generated method stub
		if (rear == maxsize) {
			System.out.println("Queue is full");
		} else {
			Q[rear++] = element;
		}
	}

	void delete() {
		if (front == rear) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("deleted element is =>" + Q[front++]);
		}
	}

}
