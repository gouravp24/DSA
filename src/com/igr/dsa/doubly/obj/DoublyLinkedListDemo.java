package com.igr.dsa.doubly.obj;

import java.util.Scanner;

public class DoublyLinkedListDemo {
	NodeDL head;
	Scanner scan = new Scanner(System.in);

	// 1.allocate memory to a node.
	// 2.user kadun ghetleli value list made set kartoy
	// 3.jar head null asel tr tyala new node banavaycha
	// 4.next add kelelya node la ata head banvtoy ani head chya privios node la new
	// node link kartoy
	// 5.navin node la ata head banava.
	void insertAtBegining(Object data) {
		NodeDL newNode = new NodeDL();
		newNode.setData(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head.setPrev(newNode);
		}
		
		head = newNode;
		head.setPrev(newNode);
		
	}

	/*
	 * insert at last *mhanje aplyala node chya last la jaun node add karaycha ahe
	 * ani tya last chya node chi link hi tyachya privious sobat pn dyayachi ahe
	 */

	// 1.node cha object banavl.tya object la value set karaychi
	// 2.check karaych LL empty ahe ka jar asel tr apan jo add kartoy node toch
	// first and last asel.mag aata head tya new node kad point kartoy.
	// 3.jar LL empty nasel tr pratek point la link n todata jaych asel tr
	// travelar navacha 1 tatapurta head ghetla to ata head kad point karoy
	// 4.ata joparyant pudhacha node null yet nahi to paryant traval kara.tya made
	// apan to continue pudh jato
	// last null ala ki apan loop chya baher yanar
	// 5.travelar ata last la point karto ata apan travelar chya next la new node
	// set karnar
	// 6.tya adhicha node mhanje atta aslela head tyala apan add kelelya node sobat
	// link karach

	void insertAtLast(Object data) {
		NodeDL newNode = new NodeDL();
		newNode.setData(data);
		if (head == null) {
			head = newNode;
		} else {
			NodeDL travelar = head;
			while (travelar.getNext() != null) {
				travelar = travelar.getNext();// moving the pointer to the next node.
			}
			travelar.setNext(newNode);
			travelar.setPrev(newNode);

		}

	}

	// 1.new node create kela
	//
	//
	//
	//
	void insertAtRandom(Object data) {
		NodeDL newNode = new NodeDL();
		newNode.setData(data);
		NodeDL travelar = head;
		System.out.println("Enter the Index");
		int index = scan.nextInt();
		if (head == null) {
			head = newNode;
		} else {
			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.getNext();
			}
			newNode.setNext(travelar.getNext());
			travelar.setNext(newNode);
			newNode.setPrev(travelar);
			System.out.println("node is inserted : ");
		}

	}

	void deleteAtFirst() {
		if (head == null) {
			System.out.println("list is empty ");
			return;
		} else {
			head = head.getNext();
		}
	}

	void deleteAtLast() {
		if (head == null) {
			System.out.println("list is empty ");
			return;
		} else {
			NodeDL travelar = head;
			while (travelar.getNext().getNext() != null) {
				travelar = travelar.getNext();
			}
			travelar.setNext(null);
		}
	}

	void deleteAtMiddle(int index) {
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			NodeDL travelar = head;
			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.getNext();
			}
			travelar.setNext(travelar.getNext().getNext());
			travelar.getNext().setPrev(travelar);
		}
	}

	void find(int index) {
		NodeDL travelar = head;
		int i = 1;
		while (travelar != null) {
			if (i == index) {
				System.out.print(index + " Index having : " + travelar.getData());
			}
			travelar = travelar.getNext();
			i++;
		}
	}

	// 1.DLL chya object la pahil tatapurata travel karaysathi head assign kel
	// 2.jeva head null nasel teva teva tya pratek point la jaun to data print kra
	// one by one
	// 3.pudhe puedhe
	void printDL() {
		NodeDL travelar = head;
		while (travelar != null) {
			System.out.print(travelar.getData() + " ");
			travelar = travelar.getNext();
		}
		// System.out.println("null");

	}

}
