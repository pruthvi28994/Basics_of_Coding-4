package com.pruthvi.java.interviewQuestion;

/*
 * Binary tree is a directed tree in which out degree of each node is 2 or <2
 * a)nodes  having out degree 0 is leaf node
 * 							  a
 * 						b			c	
 * 					d		e   f		g
 * 
 * 
 * b) traversal
 * 		1)inorder(L-ROOT-R)    (dbeAfcg)
 * 		2)PreOrder(ROOT-L-R)   (Abdecfg)
 * 		3)PostOrder(L-R-ROOT)  (debfgcA) 
 * */
class BST {
	int info;
	BST llink;
	BST rlink;

	public BST(int info) {
		this.info = info;
		this.llink = this.rlink = null;
	}
}

/*
 * if the ele < root insert at left subtree else right subtree
 * 
 */
public class java_Trees {
	BST root = null;

	// inserting in to BST
	BST insert_BST(BST root, int ele) {
		if (root == null) {
			root = new BST(ele);
		} else if (ele <= root.info) {
			root.llink = insert_BST(root.llink, ele);
		} else {
			root.rlink = insert_BST(root.rlink, ele);
		}
		return root;
	}

	// Traversal
	// recursion -->calling the function itself
	void preorder(BST root) {
		if (root == null)
			return;
		System.out.print(root.info + "=>");
		preorder(root.llink);
		preorder(root.rlink);
	}

	void inorder(BST root) {
		if (root == null)
			return;
		inorder(root.llink);
		System.out.print(root.info + "=>");
		inorder(root.rlink);
	}

	void postorder(BST root) {
		if (root == null)
			return;
		postorder(root.llink);
		postorder(root.rlink);
		System.out.print(root.info + "=>");
	}

	void BST_Search(BST root, int ele) {
		if (root == null) {
			System.out.println("Element " + ele + " not found");
		} else if (root.info == ele) {
			System.out.println("Element " + ele + " found");
		} else if (root.info < ele) {
			BST_Search(root.llink, ele);
		} else if (root.info > ele) {
			BST_Search(root.llink, ele);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Binary search Tree\n");
		java_Trees bst = new java_Trees();
		bst.root = bst.insert_BST(bst.root, 13);
		bst.root = bst.insert_BST(bst.root, 12);
		bst.root = bst.insert_BST(bst.root, 18);
		bst.root = bst.insert_BST(bst.root, 14);
		bst.root = bst.insert_BST(bst.root, 17);
		System.out.println("1) Post Order Traversal");
		bst.postorder(bst.root);
		System.out.println("\n");
		System.out.println("2) Inorder Traversal");
		bst.inorder(bst.root);
		System.out.println("\n");
		System.out.println("3) Pre Order Traversal");
		bst.preorder(bst.root);
		System.out.println("\n\n");
		System.out.println("4) Searching an element using BST");
		bst.BST_Search(bst.root, 20);
	}

}
