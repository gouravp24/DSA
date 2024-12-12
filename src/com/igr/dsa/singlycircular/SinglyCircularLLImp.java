package com.igr.dsa.singlycircular;

import java.util.Scanner;

public class SinglyCircularLLImp {
	NodeSCLL head;
	Scanner scan = new Scanner(System.in);

	// 1. allocate memory to node
	// 2. get data from user assign to new node
	// 3. jar head null asel tr tyala head banavala
	// 4. travelar cha next la new node la dila
	// 4. singly circular made apan newNode cha next ahe tyala head kd point kel
	// 5. update new node to a head.
	void insertAtBegining() {
		NodeSCLL newNode = new NodeSCLL();
		System.out.println("Enter value to add ");
		int data = scan.nextInt();
		newNode.data = data;
		if (head == null) {
			head = newNode;
			newNode.next = head;
			return;
		} else {
			NodeSCLL travelar = head;
			while (travelar.next != head) {
				travelar = travelar.next;
			}
			travelar.next = newNode;
			newNode.next = head;
			head = newNode;
		}
	}

	// 1 allocate memory to new Node or create new node
	// 2 value assign to new node taken from user
	// 3 travelar navacha 1 temporary variable ghetla
	// 4 check kara LL empty ahe ka asel tr head new node la banava ani
	// 5 empty nasel tr mg jo paryant head parat firun head yet nay to paryant
	// firavat raha
	// 6 head repeat ala mhanje apal last la alo ata travelar last la point kara
	// 7 ata tya travelar chya next la new node assign kera
	// 8 m ata new node cha next ha aata head kd point kera
	void insertAtLast() {
		NodeSCLL newNode = new NodeSCLL();
		System.out.println("Enter value add at last : ");
		int data = scan.nextInt();
		newNode.data = data;
		NodeSCLL travelar = head;
		if (head == null) {
			head = newNode;
			newNode.next = head;
		} else {
			while (travelar.next != head) {
				travelar = travelar.next;
			}
			travelar.next = newNode;
			newNode.next = head;
//			System.out.println("Inserted Successfully");
		}
	}

	// 1 pahila object banavala node cha Successfully
	// 2 user kadun data ghetla to tya node la assign kela
	// 3 traval karayla travelar navacha 1 temprary variable banavla jo ki ata head
	// kd point karto
	// 4 check kara new node null ahe ka asel tr toch apala
	void insertAtMiddle() {
		NodeSCLL newNode = new NodeSCLL();
		System.out.print("Enter index which add to given index : ");
		int data = scan.nextInt();
		newNode.data = data;
		NodeSCLL travelar = head;
		if (head == null) {
			System.out.println("list is empty : ");
			return;
		} else {
			System.out.println(" give index");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.next;
			}
			newNode.next = travelar.next;
			travelar.next = newNode;
		}
	}

//1.check LL is empty
//2.LL not empty then take temporary variable of node which point to the current head.	
//3.travel that current head to the next node of that travelar is not head.
//4.update head to heads next & travelar cha next to that head. 	
	void deleteAtFirst() {
		if (head == null) {
			System.out.println("List is empty");
		} else {
			// head = head.next;
			NodeSCLL travelar = head;
			while (travelar.next != head) {
				travelar = travelar.next;
			}
			head = head.next;
			travelar.next = head;
		}
	}

//1 node la hold karnara temparary variable ghetala jo ki head la point karto
//2 check kel head empty ahe ka asel tr list empty ahe 
//3 jar empty nasel tr travelar to parayant travel kra ki tyachya next cha next parat head yet nahi to parayant pudh jat ja
//4 ata aplyala last delete karayche mg apan tya last chya adhichi link head sobat karto mg last delete zala	
	void deleteAtLast() {
		NodeSCLL travelar = head;
		if (head == null) {
			System.out.println("List Is Empty : ");
			return;
		} else {

			while (travelar.next.next != head) {
				travelar = travelar.next;// travelar pudh pudh sarkavnya sathi
			}
			travelar.next = head;

		}
	}

//1.Temporary variable ghelta to head kd point karto
//2.Check kara list empty ahe 
//3.Jar nael tr user kadun index ghetali	
//4.Natar tya index paryant apan jayla pratek veli pudh pudh janar	
//5.ti index ali ki apan apan Tya travelar chya next chi link todun apan tyala travelar chya next chya next chi link deli		
	void deleteAtMiddle() {
		NodeSCLL travelar = head;
		if (head == null) {
			System.out.println("List is empty");
			return;
		} else {
			System.out.println("Index after which Node want to delele: ");
			int index = scan.nextInt();

			for (int i = 0; i < index - 1; i++) {
				travelar = travelar.next;
			}
			travelar.next = travelar.next.next;
			System.out.println("Node deleted succesfully");

		}

	}

//	index dilela no find karaycha ahe
//1.travelar temparary variable ghelta jo ata head kde point karto
//2.user kadun index ghya 
//3.tya index la 1 pasun start kela 
//4.ata to index head yet nahi to paryant travel kara an tyachya aat made
//5.jeva index and i asel teva to data print kra.	
	void findNode() {
		System.out.println("Enter index where value is to be find :  ");
		int index = scan.nextInt();
		NodeSCLL travelar = head;
		int i = 1;
		while (travelar != head) {
			if (i == index) {
				System.out.println("index you gave having value is : " + travelar.data);
			}
			travelar = travelar.next;
			i++;
		}
		System.out.println("indexOutOfBound");

	}

	void printDSLL() {
		NodeSCLL travelar = head;
		if (head == null) {
			System.out.println("List is empty ");
			return;
		}
		do {
			System.out.print(travelar.data + " ");
			travelar = travelar.next;
		} while (travelar != head);

		/*
		 * while(travelar!=head) { System.out.println(travelar.data +" ");
		 * travelar=travelar.next; }
		 */

	}

	void disp() {
		NodeSCLL travelar = head;
		while (travelar.next != head) {
			System.out.print(travelar.data + " ");
			travelar = travelar.next;
		}
	}
}
