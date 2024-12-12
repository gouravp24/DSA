package com.igr.dsa.doubly.obj;

public class TextDL {
	public static void main(String[] args) {
		DoublyLinkedListDemo DList = new DoublyLinkedListDemo();
		DList.insertAtBegining("Ram");
		DList.insertAtBegining(24);
		DList.insertAtBegining("Sham");
//		DList.insertAtBegining("IGR");
//		DList.insertAtLast("Raja");
//		DList.printDL();
//		System.out.println();
//		DList.insertAtRandom("IGR");
//		DList.deleteAtFirst();
//		DList.deleteAtLast();
//		DList.deleteAtMiddle(1);
		DList.find(2);
		System.out.println();
		DList.printDL();

	}

}
