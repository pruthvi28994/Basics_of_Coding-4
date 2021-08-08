package com.pruthvi.java.InterviewQuestion;

/*Leetcode:You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *Constraints:
 *		The number of nodes in each linked list is in the range [1, 100].
 *		0 <= Node.val <= 9
 *		It is guaranteed that the list represents a number that does not have leading zeros. 
 *
 **/

 // Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next){ 
    	  this.val = val; 
    	  this.next = next;
    }
 }
 

class Solution2{
	static int rem=0,last=0;
	static int sum=0;
	static ListNode output;
	 static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		 while(l1!=null || l2!=null) {
			 if(l1==null && l2!=null) sum=l2.val+0;
			 else if(l2==null && l1!=null) sum=l1.val+0;
			 else sum=l1.val+l2.val;
			 sum=CheckAddRem(sum);
			 insert(findlast(sum));
			 if(l1!=null) l1=l1.next;
			 if(l2!=null) l2=l2.next;
		 }
		 if(rem>0) {
			 insert(rem);
			 rem=0;
		 }
	return output; 
    }
	 public static void insert(int ele) {
		 ListNode temp=new ListNode(ele);
		 if(output==null)
			 output=temp;
		 else {
			 ListNode cur=output;
			 while(cur.next!=null) {
				 cur=cur.next;
			 }
			 cur.next=temp;
		 }
	 }
	 public static int findlast(int num) {
		 if(num>9) {
			 last=num%10;
			 rem=num/10;
			 return last;
		 }else {
			 return num;
		 }
	 }
	 public static int CheckAddRem(int sum) {
		 if(rem!=0) {
			   sum=sum+rem;
			   rem=0;
		 	}
		 return sum;
	 }

}

public class AddTwoNumberList {
	static ListNode list1;
	static ListNode list2;
	public static ListNode insert(ListNode root,int ele) {
		ListNode temp=new ListNode(ele);
		if(root==null) {
			root=temp;
		}else {
			ListNode cur=root;
			while(cur.next!=null) {
				cur=cur.next;
			}
			cur.next=temp;
		}
		return root;
	}
	public static void display(ListNode list1) {
		ListNode cur=list1;
		while(cur!=null) {
			System.out.print(cur.val+"=>");
			cur=cur.next;
		}
		System.out.println("NULL");
	}
	public static void main(String[] args) {
//			//List 1
			System.out.println("Test Case 1");
			list1=insert(list1,9);
			list1=insert(list1,9);
			list1=insert(list1,9);
			list1=insert(list1,9);
			list1=insert(list1,9);
			list1=insert(list1,9);
			list1=insert(list1,9);
			display(list1);
			
			//List
			list2=insert(list2,9);
			list2=insert(list2,9);
			list2=insert(list2,9);
			list2=insert(list2,9);
			display(list2);
			ListNode output=Solution2.addTwoNumbers(list1,list2);
			System.out.println("Addition of two list");
			display(output);	
			
//			System.out.println("Test Case 2");
//			list1=insert(list1,0);
//			list2=insert(list2,0);
//			ListNode output=Solution2.addTwoNumbers(list1,list2);
//			System.out.println("Addition of two list");
//			display(output);	
//
//			System.out.println("Test Case 3");
//			ListNode output=Solution2.addTwoNumbers(list1,list2);
//			System.out.println("Addition of two list");
//			display(output);
	}
}
