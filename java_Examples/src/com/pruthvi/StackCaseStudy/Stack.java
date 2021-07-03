package com.pruthvi.StackCaseStudy;

import java.util.Scanner;
//Exception handling case Study 
// Create a UserStack which should contain 
//	1->static array of size 10;
//	2->public void push(int data);
//	3->public int pop():int
//	4->public void display();
//	
//  function should return FullStackException if the size of stack is full and return EmptyStackException if stack is empty 
//  you should create FullStackException class and EmptyStackException  class which should accept the string as msg and it should print the msg Stack overflow for FullStackException
//  stack empty for EmptyStackException
//  
//  user should input choice(1/2)
//  1 -> push in to stack 
//  2 -> push / display / pop /
//	
	
class UserStack{
	public static int arr[] = new int[10];
	public static int count=0;
	public static void push(int data) throws FullStackException {
		if(count>=10) {
			--count;
			throw new FullStackException("Stack overflow");
		}
		else {
			arr[count++]=data;
		}
	}
	public static int pop() throws EmptyStackException {
		if(count>=0) {
			int data=arr[count--];
			return data;
		}
		else {
			++count;
			throw new EmptyStackException("Stack empty");
		}
	}
	public static void display() throws EmptyStackException{
		if(count>=0) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}else
			throw new EmptyStackException("Stack empty");
	}
}

public class Stack {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()) {
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					try {
						while(sc.hasNext()) {	
							UserStack.push(sc.nextInt());
						}
				     }catch (FullStackException e) {
						  System.out.println(e.getMessage());
					 }
					break;
				case 2:
					try {
						while(sc.hasNext()){
							UserStack.push(sc.nextInt());
						}
					}catch (FullStackException e) {
						System.out.println(e.getMessage());
					}
					
					try {
							UserStack.display();
					} catch (EmptyStackException e) {
						    System.out.println(e.getMessage());
					}
					
					try {
						for (int i = 0; i < 11; i++) {
							UserStack.pop();
						}
					}catch (EmptyStackException e) {
						System.out.println(e.getMessage());
					} 
					
					break;
					
				default:System.out.println("Invalid Option");
			}
		}
		sc.close();
	}
}
