package com.igr.dsa.singly.obj;

import java.util.Scanner;

public class SinglyLLImpl {
	NodeSL head;
	Scanner scan = new Scanner(System.in);
//insert at first
	// 1.create new node
	// 2.set value to that data node
	// 3.check LL is empty if yes then head is newNode
	// 4.nasel tr new node juna pahila node connect karto
	// 5.update kela head to new node

	void insertAtBegining(Object data) {
		NodeSL newNode = new NodeSL();
		newNode.setData(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
	}
//	insert at last
	// 1.create new object
	// 2.set data to new node
	// 3.check LL is empty then head is assign to new node
	// 4.if not take temp variable of Node which is pointing to current head.
	// 5.using this variable reach point of last.and add the new node to the last.

	void insertAtLast(Object data) {
		NodeSL newNode = new NodeSL();
		newNode.setData(data);
		if (head == null) {
			head = newNode;
		} else {
			NodeSL travelar = head;
			while (travelar.getNext() != null) {
				travelar = travelar.getNext();
			}
			travelar.setNext(newNode);
		}
	}

//Insert at middle 
	// 1.create new node
	// 2.set value to that new node
	// 3.check LL is empty
	// 3a.if yes then node is not add at middle
	// 3b.if no then

	void insertAtMiddle(Object data) {
		NodeSL newNode = new NodeSL();
		newNode.setData(data);
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			System.out.println("Enter index where you want to add");
			int index = scan.nextInt();
			NodeSL travelar = head;
			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.getNext();
			}
			newNode.setNext(travelar.getNext());
			travelar.setNext(newNode);

		}
	}

	void deleteAtFirst() {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			head = head.getNext();
		}
	}

	void deleteAtLast() {
		NodeSL travelar = head;
		while (travelar.getNext().getNext() != null) {
			travelar = travelar.getNext();
		}
		travelar.setNext(null);
	}

	void deleteAtMiddle(int index) {
		NodeSL travelar = head;
//		System.out.println("Enter index ");
//		int index = scan.nextInt();
		for (int i = 0; i < index - 1; i++) {
			travelar = travelar.getNext();
		}
		travelar.setNext(travelar.getNext().getNext());
	}

	void find(int index) {
		NodeSL travelar = head;
		int i = 0;
		while (travelar != null) {
			if (i == index) {
				System.out.println("index " + index + " having value is : " + travelar.getData());
			}
			travelar = travelar.getNext();
			i++;
		}
	}

	void printSl() {
		NodeSL travelar = head;
		while (travelar != null) {
			System.out.print(travelar.getData() + " ");
			travelar = travelar.getNext();
		}
	}

}
