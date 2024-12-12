package com.igr.dsa.hashtable;

public class TestHashTable {
	public static void main(String[] args) {
		HashtableImpl hs = new HashtableImpl();
		hs.add(12);
		hs.add(28);
		hs.add(25);
		hs.add(85);
		hs.add(24);
		hs.add(24);
		hs.add(9);
		hs.add(8);
		hs.displayBucketList();

	}

}
