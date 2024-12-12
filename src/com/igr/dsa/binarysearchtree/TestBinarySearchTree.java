package com.igr.dsa.binarysearchtree;

public class TestBinarySearchTree {
	public static void main(String[] args) {
		BinarySearchTreeImp bST = new BinarySearchTreeImp();
		bST.addTO(12);
		bST.addTO(9);
		bST.addTO(7);
		bST.addTO(25);
		bST.addTO(44);
		bST.addTO(97);
		bST.addTO(1);
		bST.display(bST.root);

	}
}
