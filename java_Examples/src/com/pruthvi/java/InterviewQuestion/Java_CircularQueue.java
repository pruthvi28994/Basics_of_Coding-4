package com.pruthvi.java.InterviewQuestion;

import java.util.Scanner;

//when front reaches the rear position you need to reset postion to 0 i.e ->
// (front+1)%QUEUE_size;
class CirularQueue {
	int rear = -1;
	int front = -1;
	int MAX_SIZE = 1000;
	int count = 0;
	int CirQueue[];

	public CirularQueue(int MAX_SIZE) {
		front = 0;
		this.MAX_SIZE = MAX_SIZE;
		CirQueue = new int[this.MAX_SIZE];
	}

	public void Enqueue(int ele) {
		if (count == MAX_SIZE) {
			System.out.println("Queue is Full");
		}
		rear = (rear + 1) % MAX_SIZE;
		CirQueue[rear] = ele;
		count++;
	}

	public void Dequeue() {
		if (count == 0) {
			System.out.println("Queue is Empty");
		} else {
			System.out.println("Element deleted is " + CirQueue[front]);
			front = (front + 1) % MAX_SIZE;
			count--;
		}
	}

	public void display() {
		int i = front;
		System.out.println("Contents are");
		for (int j = 0; j < count; j++) {
			System.out.print(CirQueue[i] + " ");
			i = (i + 1) % MAX_SIZE;
		}
		System.out.println();
	}
}

public class Java_CircularQueue {
	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Size of Element");
			CirularQueue queue = new CirularQueue(sc.nextInt());
			System.out.println("Enter the elements");
			for (int i = 0; i < queue.MAX_SIZE; i++) {
				queue.Enqueue(sc.nextInt());
			}
//		queue.Enqueue(90);
			queue.display();
			queue.Dequeue();
			queue.Dequeue();
			queue.Dequeue();
//		queue.Enqueue(91);
			queue.display();
		}
	}
}
