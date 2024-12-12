package com.igr.dsa.binarysearchtree;

public class BinarySearchTreeImp {
	NodeB root;

//	add Method implementation

//	1.allocate memory and assign value.
//	2.check BST empty ahe ka? if yes then update that root as new node because root is null  when BST empty.
//	3. 2 temporary variable ghetl travel karayala 1) current jo attachya current
//	    rool la point kartoy 2)parent jo null la point karatoy
//	4.nantar infinite loop ghetla parent update kela as current
//	5.parent la update kel as current 
//	6.data is less than current data then current la update kra as current left
//	  jeva ata current cha left null yeil teva ( parent cha left update karayacha as new node.)
//	7.ata data motha asala ki current la update karaych as current right
//	  ata jeva keva current null yeil teva to new node parent chya right la add karaych 

	void addTO(int data) {
		NodeB newNode = new NodeB();
		newNode.data = data;
		if (root == null) {
			root = newNode;
		} else {
			NodeB current = root;
			NodeB parent = null;
			while (true) {
				parent = current;
				if (data < current.data) {
					current = current.left;
					if (current == null) {
						parent.left = newNode;
						return;
					}
				} else if (data > current.data) {
					current = current.right;
					if (current == null) {
						parent.right = newNode;
						return;
					}

				}
				if(current.data==data) {
					return;
				}
			}
		}

	}

//display methode
//	1 .display methode node type ch input ghete 
//	2.display methode la call karun node cha left print kela
//	3.data print kela
//	4.display methode la call karun node cha right print kela
	void display(NodeB node) {
		if (node != null) {
			display(node.left);
			System.out.print(node.data + " ");
			display(node.right);
		}
	}

}
