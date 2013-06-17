package com.anuj.dsimpl.binarytree;

class InsertElement {

	static BinarySearchTree insert(BinarySearchTree tree, int element) {
		if (tree == null) {
			tree = new BinarySearchTree(element, null, null);
		} else {
			if (element <= tree.val) {
				tree.left = insert(tree.left, element);
			} else {
				tree.right = insert(tree.right, element);
			}
		}

		return (tree); // in any case, return the new pointer to the caller
	}

	static void print(BinarySearchTree tree) {
		if (tree == null)
			return;
		System.out.println(tree.val + " ");
		print(tree.left);
		print(tree.right);
	}

	public static void main(String[] args) {

		BinarySearchTree left1 = new BinarySearchTree(new Integer(22), null,
				null);
		BinarySearchTree right1 = new BinarySearchTree(new Integer(33), null,
				null);
		BinarySearchTree left = new BinarySearchTree(new Integer(2), left1,
				right1);
		BinarySearchTree right = new BinarySearchTree(new Integer(3), left1,
				right1);
		BinarySearchTree tree = new BinarySearchTree(new Integer(1), left,
				right);

		System.out.println("The Tree is :");
		print(tree);

		int num = 15;
		System.out.println("Inserting " + num + " in the Tree : \n");
		tree = insert(tree, num);

		System.out.println("The New Tree is :");
		print(tree);

	}
}

//class BinarySearchTree {
//	int val;
//	BinarySearchTree left;
//	BinarySearchTree right;
//
//	public BinarySearchTree(int val) {
//		this.val = val;
//	}
//
//	public BinarySearchTree(int val, BinarySearchTree left,
//			BinarySearchTree right) {
//		this.val = val;
//		this.left = left;
//		this.right = right;
//	}
//}