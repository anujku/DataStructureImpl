package com.anuj.dsimpl.binarytree;

class MinValue {

	static BinarySearchTree insert(BinarySearchTree tree, int element) {
		BinarySearchTree searchTree = new BinarySearchTree(element, null, null);
		if (tree == null)
			tree = searchTree;
		else if (element <= tree.val)
			tree.left = insert(tree.left, element);
		else
			tree.right = insert(tree.right, element);
		return tree;
	}

	static int minVal(BinarySearchTree tree) {
		int minVal = 0;
		if (tree != null) {
			while (tree.left != null)
				tree = tree.left;
			minVal = tree.val;
		}
		return minVal;
	}

	static void print(BinarySearchTree tree) {
		if (tree == null)
			return;
		System.out.println(tree.val + "");
		print(tree.left);
		print(tree.right);
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree(new Integer(5), null, null);
		tree = insert(tree, 10);
		tree = insert(tree, 100);
		tree = insert(tree, 11);
		tree = insert(tree, 110);
		tree = insert(tree, -50);
		print(tree);
		System.out.println("Min value in the tree : "+ minVal(tree));
	}
}

class BinarySearchTree {
	int val;
	BinarySearchTree left;
	BinarySearchTree right;

	public BinarySearchTree(int val, BinarySearchTree left,
			BinarySearchTree right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}