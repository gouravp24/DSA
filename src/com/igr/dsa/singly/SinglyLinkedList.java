package com.igr.dsa.singly;

import java.util.Scanner;

public class SinglyLinkedList {
	NodeSL head; // holds first node address, null if LL is empty
	Scanner scan = new Scanner(System.in);

	// 1. get data from user using scanner
	// 2. allocate memory to a node(create a node object in memory)
	// 3. assign the value taken from user to the data part of node, just created.
	// 4. next part of this newly created node will be assigned with head
	// 5. update head to newly created node
	void inserFirstNode() {
		System.out.println("Enter data insert in singly linked List : ");
		int data = scan.nextInt();
		NodeSL created = new NodeSL();
		created.data = data;
		created.next = head;
		head = created;
	}

// 1.check the LL is empty.
// 2.if no then previous part of node will be assign with head.
	void deleteAtBeginingNode() {
		if (head == null) {
			System.out.println("list is empty");
		} else {
			head = head.next;
			System.out.println("Node at begining deleted");
		}
	}

// 1.next part of this newly created node will be assigned with head
// 2.check LL is empty.
// 3.if LL is not empty then reach to the 2nd last node	
// 4.then make last node is null

	void deleteAtLast() {
		NodeSL travelar = head;
		if (head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("Node at Last Delete ");
			while (travelar.next.next != null) {
				travelar = travelar.next;
				// LHS = RHS
				// write|update = read
			}
			travelar.next = null;
		}
	}

// 1.get data from user using scanner
// 2.next part of new node assign to the head
// 3.check LL is empty
// 4.if its not empty then reach to last node 
// 5.the index that we are passing that part reff is delete and make new reff to next of next node 
	void deleteAtRandom() {
		NodeSL travelar = head;
		if (head == null) {
			System.out.println("List is Empty");
			return;
		} else {
			System.out.println(" give index where you want to delete ");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.next;
			}
			travelar.next = travelar.next.next;
			System.out.println("node delete successfully");
		}
	}

	// 1.get data from user using scanner
	// 2.allocate memory to a node
	// 3.assign the value taken from user to the data part of node
	// 4. update last node's next part
	/*
	 * 4a. check if LL is empty, if Yes means the newly created node is first and
	 * last.
	 *
	 * 4b.reach to the last node of linked list and assign this newly created node
	 * to the next part of last node of LL
	 */
	void insertLastNode() {
		System.out.println("Enter data in singly linked List ");
		int data = scan.nextInt();
		NodeSL created = new NodeSL();
		created.data = data;
		if (head == null) {
			head = created;
		} else {
			NodeSL travelar = head;
			while (travelar.next != null) {
				travelar = travelar.next;
			}
			travelar.next = created;
		}
	}

// 1.get data from user using scanner and get index no
// 2.allocate memory to a node
// 3.assign the value taken from user to the data part of node, just created.
// 4.next part of this newly created node will be assigned with head
// 5.check LL is empty
// 6.if LL is not empty then reach to a last node of LL	
// 7.newly created node assign by the our node
// 8.new node is points to now current travelar node is points same
// 9.update new node which is right now pointing

	void randomInsertNode() {
		System.out.println("Enter data in singly linked list : ");
		int data = scan.nextInt();
		System.out.println("Enter index no where to add:  ");
		int index = scan.nextInt();
		NodeSL newNode = new NodeSL();
		newNode.data = data;
		NodeSL travelar = head;

		if (travelar == null) {
			System.out.println("List is empty");
		} else {

			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.next;
			}
		}
		newNode.next = travelar.next;
		travelar.next = newNode;
		System.out.println("node is inserted : ");

	}

	void isNodeInList() {
		if (head == null) {
			System.out.println("List is empty ");
			return;
		} else {
			System.out.println("Enter data : ");
			int data = scan.nextInt();
			NodeSL travelar = head;
			while (travelar != null) {
				if (travelar.data == data) {
					System.out.println(travelar.data + ": is in list");
					return;
				} else if (travelar.next == null) {
					System.out.println(data + ":  is NOT in List ");
				}
				travelar = travelar.next;
			}

		}
	}

// 1.get data from user using scanner 
// 2.assign new node is to be head
// 3.index starts from 1
// 4.check travelar is not null if not then index of LL and index given by user are same then print the value of given address	
//5.
	void searchNode() {
		System.out.println("Enter index where value is to be find :  ");
		int index = scan.nextInt();
		NodeSL travelar = head;
		int i = 1;

		while (travelar != null) {
			if (i == index) {
//				travelar.data = index;
				System.out.println("index you gave having value is : " + travelar.data);
				return;
			} else if (travelar.next == null) {
				System.out.println("IndexOutOfBound");
			}
			travelar = travelar.next;
			i++;

		}
	}

	// 1. object of LL assign to head
	// 2. check LL is empty ,if yes then newly created node first and last if not
	// then print data upto next node is not null
	//

	void printList() {
		NodeSL traveler = head;
		while (traveler != null) {
			System.out.print(traveler.data + " ");
			traveler = traveler.next;
		}

	}

//	ata apan karnar ahe list ale tyala reverce
	// 1.apan ata node type cha 1temporary variable ghetla jo current head kad point
	// kartoy
	// 2.apan 1 temp variable banavla jo current null kad point kartay
	// 3.current la last paryant gheun gelo ani ata tya made::
	// 3a.

	void reverse() {
		NodeSL current = head;
		NodeSL prev = null;
		while (current != null) {
			NodeSL temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}

		head = prev;

	}

	// recursion

	NodeSL reverseByRecursion() {
		if (head == null | head.next == null) {
			return head;
		}
		NodeSL newHead = reverseByRecursion();
		NodeSL headNext = head.next;
		headNext.next = head;
		head.next = null;
		return head= newHead;

	}
//	

}
