package com.igr.dsa.hashtable;

public class HashtableImpl {
//	NodeH head;

//  create array of hold 16 element of type NodeH
//	hi line sangte ki apan hashtable nava navacha array banavla ,array ha 16 slot cha ahe jyachya index 0 to 15 ahet .
//	pratek slot null ahe jo paryant apan tyala kay value det nai to paryant.
	NodeH[] hashtable = new NodeH[16];

//***Add Node in hashtable:***
//	 1.create node or allocate memory to a node
//	 2.assign value for that node.
//	 3.calculate index of that data by using modulo
//	 4.create object of node holding
//	 4a.Hashtable is type of node array each slot is null until assign a node object to it.
//	 
//	 5.if index of hashtable is null then add create new node ad that index.
//	 6.create temporary variable of node pointing to bucket
//	 6a.while temporary variable is not null then
//	      if temporary data and  and new data is equal then return && temporary variable moves next node
//	 7.temporary variable is initialized with the reference to the bucket.
//	 8. now while temporary variables next not null ;
//	    then temporary variable moves next node &&  temporary variables next make it new node.

	void add(int data) {
		NodeH newNode = new NodeH(); // create a new node with provided data
		newNode.data = data;
		int index = data % 16; // index calculation using modulo operation
		NodeH bucket = hashtable[index]; // NodeH cha bucket varible banvla jya kd node cha hashtable index ahe
		if (hashtable[index] == null) {
			// if the list is empty add a new node
			hashtable[index] = newNode;
		} else {
			NodeH temp = bucket;
			while (temp != null) {
				if (temp.data == newNode.data) {
//					System.out.println("Duplicate data: " + data + " At Index " + index);
					return;
				}
				temp = temp.next;
			}

			temp = bucket;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

//	***Display Bucket List*** 
//	1. i is start 0 to 15  and access i th element of hashtable array and storing buckete 
//	2. print index 
//	3.print bucket but for print bucket we want print of bucket wali method.

	void displayBucketList() {
		for (int i = 0; i < 16; i++) {
			NodeH bucket = hashtable[i];
			System.out.println("index:" + i + ":");
			PrintList(bucket);
		}
	}

//	****Print Wali method****
//	create temporary variable of NodeH type which is pointing to current bucket
//	we want all buckets to print so we go end of buckets. 
//	by the [joparyant travelar mhanje current buckets sampant nay to paryant pudh pudh jaych &&
//	                                              tya pratek temp cha (current bucket)DATA]

	void PrintList(NodeH bucket) {
		NodeH traveler = bucket;
		while (traveler != null) {
			System.out.println(traveler.data + "->");
			traveler = traveler.next;
		}
	}
}
