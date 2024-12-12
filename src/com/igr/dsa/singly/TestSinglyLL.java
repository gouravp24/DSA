package com.igr.dsa.singly;

public class TestSinglyLL {
	public static void main(String[] args) {
//		NodeSL s=new NodeSL();
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.inserFirstNode(); // 5
		sll.inserFirstNode(); // 6
		sll.inserFirstNode();// 8
		sll.inserFirstNode();// 2
//		 sll.insertLastNode(); // 3
//		 sll.insertLastNode();
//		 sll.insertLastNode();
//		 sll.insertLastNode();
		// sll.randomInsertNode();//9
		// sll.deleteAtBeginingNode();
//		sll.deleteAtLast();
		//sll.deleteAtRandom();
//		sll.searchNode();
//		sll.isNodeInList();
		sll.printList();
//		sll.reverse();
		sll.reverseByRecursion();
		System.out.println();
		sll.printList();
		
		//sll.printList();
	}
}
//2 4 1 3
//4 1 3
//4 3 2 1 
//Node at last delete   4 3 2    
