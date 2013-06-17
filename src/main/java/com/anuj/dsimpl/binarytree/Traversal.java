package com.anuj.dsimpl.binarytree;

class Traversal {

	static BinaryTree insert(BinaryTree tree, int element) {
		BinaryTree binaryTree = new BinaryTree(element, null, null);

		if (tree == null)
			tree = binaryTree;
		else if (element <= tree.val)
			tree.left = insert(tree.left, element);
		else
			tree.right = insert(tree.right, element);

		return tree;
	}

	static void inOrderTraversal(BinaryTree tree) {
		if (tree != null) {
			inOrderTraversal(tree.left);
			System.out.println("The node data is " + tree.val);
			inOrderTraversal(tree.right);
		}
	}

	static void preOrderTraversal(BinaryTree tree) {
		if (tree != null) {
			System.out.println("The node data is " + tree.val);
			inOrderTraversal(tree.left);
			inOrderTraversal(tree.right);
		}
	}

	static void postOrderTraversal(BinaryTree tree) {
		if (tree != null) {
			inOrderTraversal(tree.left);
			inOrderTraversal(tree.right);
			System.out.println("The node data is " + tree.val);
		}
	}

	public static void main(String[] args) {
		// BinaryTree left1 = new BinaryTree(new Integer(22), null, null);
		// BinaryTree right1 = new BinaryTree(new Integer(33), null, null);
		// BinaryTree left = new BinaryTree(new Integer(2), left1, right1);
		// BinaryTree right = new BinaryTree(new Integer(3), left1, right1);
		// BinaryTree tree = new BinaryTree(new Integer(1), left, right);

		BinaryTree tree = new BinaryTree(new Integer(5), null, null);
		tree = insert(tree, 1);
		tree = insert(tree, 10);
		tree = insert(tree, 11);
		tree = insert(tree, 111);
		tree = insert(tree, -1);

		System.out.println("The InOrderTraversal of Tree is :");
		inOrderTraversal(tree);

		System.out.println("The PreOrderTraversal of Tree is :");
		preOrderTraversal(tree);

		System.out.println("The PostOrderTraversal of Tree is :");
		postOrderTraversal(tree);
	}
}

class BinaryTree {
	int val;
	BinaryTree left;
	BinaryTree right;

	public BinaryTree(int val, BinaryTree left, BinaryTree right) {
		this.left = left;
		this.right = right;
		this.val = val;
	}
}