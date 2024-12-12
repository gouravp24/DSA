package com.igr.dsa.doublycircular;

import java.util.Scanner;

public class DoublyCircularLinkedListImp {
	NodeDCLL head;
	Scanner scan = new Scanner(System.in);

	// insert at begining
	// 1.allocate memory to
	// 2.get data from scanner
	// 3.assign value to the new node
	// 4.check list is empty if yes then added node is first and that is head and
	// new node cha next head kr point karto
	// 5.temparary variable banvla jo head kadun point karto
	// 6.to toparyant travel karat raha jo paryant head yet nahi.
	// 7.ata last chya next la new node takala
	// 8.tya new node add kela tyachya prev la ata travelar ahe .
	// 9.ata new node add kela tyacha next la ata current head ghetala
	// 10.ata current head chya priv ata aplya new node la point karto
	// 11.banvlela new node update kara current head mhanun
	void insertAtBegining() {
		NodeDCLL newNode = new NodeDCLL();
		System.out.println("Enter data to add ");
		int data = scan.nextInt();
		newNode.data = data;
		if (head == null) {
			head = newNode;// new node head ahe
			newNode.next = head;// new node cha next parat tyachya link head la deto
			newNode.prev = head;
			return;
		} else {
			NodeDCLL travelar = head;
			while (travelar.next != head) {
				travelar = travelar.next;
			}
			travelar.next = newNode;
			newNode.prev = travelar;
			newNode.next = head;
			head.prev = newNode;
//	
			head = newNode;
		}
	}

//1.allocate memory for new node or create object of new node
//2.get value from user assign value for node
//3.check list empty ahe ka jar list empty asel tr new node la head banvto and tya new node cha next an previos head kd poin karto	
//4.List empty nasel tr	new node la head banvto,ata head cha next and prev ha ata head kad point karto
//5.nasel tr temparary variable banavla jo ki current head kd point karto	
//6.temparary variable use karun apan list chya last la gelo
//7.ata travelar last chya node var ahe mag apan travelar chya next la new node takala & tyachya new node chya
//	previous la travaler la link kel
//8.ata new node cha next head kd point karto & head previous ata new Node kd point karto
	void insertAtLast() {
		NodeDCLL newNode = new NodeDCLL();
		System.out.println("Enter data add in last");
		int data = scan.nextInt();
		newNode.data = data;
		if (head == null) {
			head = newNode;
			newNode.next = head;
			newNode.prev = head;
		} else {
			NodeDCLL travelar = head;
			while (travelar.next != head) {
				travelar = travelar.next;
			}
			/*
			 * LHS = RHS => write/update=read
			 */
			travelar.next = newNode;
			newNode.prev = travelar;
			newNode.next = head;
			head.prev = newNode;

		}
	}

//1.create new node or allocate memory for node.
//2.get value from user and assign to Node 
//3.head null asel tr list empty ahe	
//4.nasel tr pahil new node chya next la travelar chya next chi link dili
//	new Node cha previous travelar sobat link kel
//	 ata travelar cha ne
	void insertAtMiddle() {
		NodeDCLL newNode = new NodeDCLL();
		System.out.println("Enter data at middle : ");
		int data = scan.nextInt();
		newNode.data = data;
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			NodeDCLL travelar = head;
			System.out.println("Enter index where you want to add ");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.next;
			}
			newNode.next = travelar.next;
			newNode.prev = travelar;
			travelar.next.prev = newNode;
			travelar.next = newNode;

		}

	}

	void deleteAtBegining() {
		if (head == null) {
			System.out.println("List is empty ");
			return;
		} else {
			NodeDCLL travelar = head;
			while (travelar.next != head) {
				travelar = travelar.next;
			}
			head = head.next;
			head.prev = travelar;
			travelar.next = head;

		}
	}

	void deleteAtLast() {
		if (head == null) {
			System.out.println("List is empty ");
			return;
		} else {
			NodeDCLL travelar = head;
			while (travelar.next.next != head) {
				travelar = travelar.next;
			}
			travelar.next = head;
			head.prev = travelar;
		}
	}

	void deleteAtMiddle() {
		if (head == null) {
			System.out.println("List is empty ");
			return;
		} else {
			NodeDCLL travelar = head;
			System.out.println("Enter index which want to delete");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.next;
			}
			travelar.next = travelar.next.next;
			travelar.next.prev = travelar;

		}

	}

	void find() {
		NodeDCLL travelar = head;
		System.out.println("Enter index");
		int index = scan.nextInt();
		int i = 1;
		while (travelar.next != head) {
			if (i == index) {
				System.out.println("index ::" + index + " is having value :" + travelar.data);
//				break;
			}
			travelar = travelar.next;
			i++;

		}
		System.out.println("InvalidIndex");

	}
	// Temporary variable which is pointing to current head
	// check list empty.if not empty print all data of travelar at the last points
	// while travelar cha next point head not get

	void printDC() {
		NodeDCLL travelar = head;
		if (head == null) {
			System.out.println("List is empty ");
			return;
		} else {
			do {
				System.out.print(travelar.data + " ");
				travelar = travelar.next;
			} while (travelar != head);
		}
	}

	

}
