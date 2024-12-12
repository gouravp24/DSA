package com.igr.dsa.singly.obj;

public class TestSinglyLL {
	public static void main(String[] args) {

		SinglyLLImpl slist = new SinglyLLImpl();
		slist.insertAtBegining(12);
		slist.insertAtBegining(24);
		slist.insertAtBegining("Ram");
		slist.insertAtBegining(27);
//		slist.insertAtBegining("Raj");
//		slist.insertAtLast("Krishna");
//		slist.insertAtMiddle("Rajesh");
//		slist.deleteAtFirst();
//		slist.deleteAtLast();
//		slist.deleteAtMiddle(1);
		slist.find(1);
		slist.find(3);
		slist.printSl();
	}
}
