package com.pruthvi.java.interviewQuestion;

/*
 * NOTE: if you make use of insert_rear() and delete_front() then it is like implementing LinkedList using QUEUE
 * 		if you make use of insert_rear() and delete_rear() then it is like implementing List using STACK
 * 
 * 
 * */
class NODE {
	int info;
	NODE llink;

	public NODE(int info) {
		this.info = info;
		this.llink = null;
	}
}

public class Java_LinkedList {
	NODE head;

	/*
	 * Insertion and Deletion using the rear end of the list
	 */
	void insert_rear(int ele) {
		NODE temp = new NODE(ele);
		if (head == null) {
			head = temp;
		} else {
			NODE cur = head;
			while (cur.llink != null) {
				cur = cur.llink;
			}
			cur.llink = temp;
		}
	}

	void delete_rear() {
		NODE cur = head, prev = null;
		if (head == null) {
			System.out.println("Linked List is EMPTY");
		} else {
			while (cur.llink != null) {
				prev = cur;
				cur = cur.llink;
			}
			cur = null; // optional bcz garbage collector in java automatically frees memory which are
						// not in use
			prev.llink = null;
		}
	}

	/*
	 * 
	 * Insertion and deletion at front end
	 * 
	 */
	void insert_front(int ele) {
		NODE temp = new NODE(ele);
		if (head == null) {
			head = temp;
		} else {
			temp.llink = head;
			head = temp;
		}
	}

	void delete_front() {
		if (head == null) {
			System.out.println("Linked List is EMPTY");
		} else {
			NODE cur = head.llink;
			head = null;
			head = cur;
		}
	}

	// display function helps in printing the elements of LINKED LIST
	void display() {
		NODE cur = head;
		if (head == null) {
			System.out.println("Linked list is EMPTY");
		} else {
			while (cur != null) {
				System.out.print(cur.info + "=>");
				cur = cur.llink;
			}
			System.out.println("NULL");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Linked list using JAVA CLASS");
		Java_LinkedList nodes = new Java_LinkedList();
		System.out.println("Inserting and deleting at REAR end");
		nodes.insert_rear(11);
		nodes.insert_rear(12);
		nodes.insert_rear(13);
		nodes.insert_rear(14);
		nodes.display();
		nodes.delete_rear();
		nodes.display();

		System.out.println();
		System.out.println("Inserting and deleting at FRONT end");
		nodes.delete_front();
		nodes.display();
		nodes.delete_front();
		nodes.delete_front();
		nodes.display();
		//
		nodes.insert_front(12);
		nodes.insert_front(9);
		nodes.display();

	}

}
