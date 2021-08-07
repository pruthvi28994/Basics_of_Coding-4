package com.pruthvi.java.InterviewQuestion;

import java.util.*;

/*
 * Given the root of a Binary Search Tree and a target number k, return true if there exist two elements in the BST such that their sum is equal to the given target.
 * 
 * Input: root = [5,3,6,2,4,null,7], k = 9
   Output: true
   
   Input: root = [5,3,6,2,4,null,7], k = 28
   Output: false
   
   Input: root = [2,1,3], k = 1
   Output: false
 *
 * */
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val=val;
	}
	TreeNode(int val, TreeNode left, TreeNode right) {
		 this.val = val;
		 this.left = left;
		 this.right = right;
	}
}

class twoSumIV{
	//i will be adding the elements into the list using in-order traversal
	public static List<Integer> input=new ArrayList<Integer>();
	
	public static boolean findTarget(TreeNode root, int k) {
		Map<Integer, Integer> map=new HashMap<>();  //map bcz if the element(k-input.get(i)) is not found you will be inserting into map (ele,pos).once it returns true that element exist (k-input.get(i)) you will return true
		inorder(root);  //traversing and adding the element into the list
		//System.out.println(input); check if all element exist are not
		for(int i=0;i<input.size();i++) {
			if(!map.containsKey(k-input.get(i)))  
				map.put(input.get(i), i);
			else
				return true;
		}
        return false;
    }
	public static void inorder(TreeNode root) {
		if (root == null)
			return;
		inorder(root.left);
		input.add(root.val);
		inorder(root.right);
	}
}

public class Java_TwoSumBST {
	TreeNode root=null;
	TreeNode insert(TreeNode root,int ele) {
		if(root==null)
			root=new TreeNode(ele);
		else if(ele<=root.val)
			root.left=insert(root.left,ele);
		else
			root.right=insert(root.right,ele);
		return root;
	}
	public static void main(String[] args) {
		//[5,3,6,2,4,null,7]
		Java_TwoSumBST t=new Java_TwoSumBST();
		t.root=t.insert(t.root, 5);
		t.root=t.insert(t.root, 3);
		t.root=t.insert(t.root, 6);
		t.root=t.insert(t.root, 2);
		t.root=t.insert(t.root, 4);
		t.root=t.insert(t.root, 7);
		System.out.println(twoSumIV.findTarget(t.root, 8));
	}

}
