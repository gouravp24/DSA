package com.igr.dsa.doubly;

import java.util.Scanner;

public class DoublyLLImpl {
	NodeDl head;
	Scanner scan = new Scanner(System.in);

	// 1.new node banavala
	// 2.new node la data assign kela
	// 3.new node chya next la ata head kad point kra
	// 4.head ata new node kad point karto
	void insertionAtBegining() {
		NodeDl newNode = new NodeDl();
		System.out.println("Enter value to add");
		int data = scan.nextInt();
		newNode.data = data;
		newNode.next = head;
		head = newNode;
		head.prev = newNode;

	}

	// new node banavla
	// new node la data assign kela
	// check kel list empty ahe ka asel tr kelela asel tr add kelelach head ahe
	// empty nasel tr travel karay sathi 1 temparary varible banvla
	// head cha next null yei paryant iterate kr
	void insertAtLast() {
		NodeDl newNode = new NodeDl();
		System.out.println("Enter value to add last : ");
		int data = scan.nextInt();
		newNode.data = data;
		if (head == null) {
			head = newNode;
			newNode.prev = head;
		} else {
			NodeDl travelar = head;
			while (travelar.next != null) {
				travelar = travelar.next;
			}
			travelar.next = newNode;
			newNode.prev = head;
		}
	}

	// new node banava
	// user kadun value gheun new node la assign kara
	// navin variable assingn kela node la jo ki head la point karto
	// check kara list empty ahe ka asel tr add kelela node hach 1 node ahe tyala
	// head kare point kara
	// nasel tr newNode apan kute add karnare ti index user kadun ghya
	// for loop laun travel karun apan jo index dilay tya paryant pochato
	// navin node chya next la atachya node cha next set karto
	// travelar chya next node la navin node chi link dili jate
	// atacha head jya kad point karto tyala newNode cha privious chi link dili jate
	void insertAtMiddle() {
		NodeDl newNode = new NodeDl();
		System.out.println("Enter value add at middle : ");
		int data = scan.nextInt();
		newNode.data = data;
		NodeDl travelar = head;
		if (head == null) {
			head = newNode;
		} else {
			System.out.println("Enter index : ");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.next;
			}
			newNode.next = travelar.next;
			travelar.next = newNode;
			newNode.prev = travelar;

		}
	}

	void updateNode() {
		NodeDl newNode = new NodeDl();
		System.out.println("Enter value which is update");
		int data = scan.nextInt();
		newNode.data = data;
		NodeDl travaler = head;
		if (head == null) {
			System.out.println("list is empty ");
			return;
		} else {
			System.out.println("Enter index which Want to Update");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				travaler = travaler.next;
			}
			newNode.next = travaler.next.next;// traveler.next म्हणजे सध्याच्या नोडचा पुढचा नोड.//traveler.next.next
												// म्हणजे पुढच्या नोडचा पुढचा नोड.या ओळीने नवीन नोडचा (newNode) next
												// पत्ता हा traveler.next.next वर सेट केला जातो.
			travaler.next = newNode;

			newNode.prev = travaler;
		}
	}

	// apan Pahali list null Ahe ka te check kel
	// nasel tr head chya next la apan head banaval

	void deleteFirst() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			head = head.next;
		}
	}

	// temparary new node banavala jo head kd point karto
	// apan Pahali list null Ahe ka te check kel
	// list empty nasel tr travelar chya next cha next null yet nai to paryant pude
	// apan alo tit ki travelar cha next null kara
	void deleteLast() {
		NodeDl travelar = head;
		if (head == null) {
			System.out.println("List is Empty ");
		} else {
			while (travelar.next.next != null) {
				travelar = travelar.next;
			}
			travelar.next = null;
			// LHS = RHS
			// write|update = read
		}

	}

	void deleteAtMiddle() {
		NodeDl travelar = head;
		if (head == null) {
			System.out.println("list is empty : ");
			return;
		} else {
			System.out.println("Enter index which want to delete : ");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {// travelar la jo parayant pudh net ja jo paryant apan dilela index yet
													// nay
				travelar = travelar.next;
			}
			travelar.next = travelar.next.next;
			travelar.next.prev = travelar;
			System.out.println("Node is delete succefully at index : " + index);
		}
	}

	void findNode() {
		System.out.println("Enter index where value is to be find :");
		int index = scan.nextInt();
		NodeDl travelar = head;
		int i = 1;
		if (head == null) {
			System.out.println("list is empty");
		} else {
			while (travelar != null) {
				if (i == index) {
					System.out.println("Node value at given index " + index + " is = " + travelar.data);
				}
				travelar = travelar.next;
				i++;
			}
			System.out.println("IndexOutOfBound");
		}
	}

//	now we will make
	void reverse() {
		NodeDl current = head;
		NodeDl temp = null; // Temporary variable to assist in swapping

		while (current != null) {
			// Swap prev and next pointers
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;

			// Move to the next node in the original sequence
			current = current.prev;
		}

		// Update head to the last processed node

		head = temp.prev;

	}

//print method
	void printDLL() {
		NodeDl travelar = head;
		while (travelar != null) {
			System.out.print(travelar.data + " ");
			travelar = travelar.next;
		}
	}

	void print() {
		NodeDl travelar = head;
		do {
			System.out.print(travelar.data + " ");
			travelar = travelar.next;
		} while (travelar != null);
	}

}
