package com.anuj.dsimpl.binarytree;

class MaxDepth {

	static int maxDepth(BST tree) {
		if (tree == null)
			return 0;
		else {
			int leftDepth = maxDepth(tree.left);
			int rightDepth = maxDepth(tree.right);

			if (leftDepth > rightDepth)
				return (1 + leftDepth);
			else
				return (1 + rightDepth);
		}
	}

	static BST insert(BST tree, int element) {
		BST bst = new BST(element, null, null);
		if (tree == null)
			tree = bst;
		else if (element < tree.val)
			tree.left = insert(tree.left, element);
		else
			tree.right = insert(tree.right, element);
		return tree;
	}

	static void print(BST tree) {
		if (tree == null)
			return;
		System.out.println(tree.val);
		print(tree.left);
		print(tree.right);
	}

	public static void main(String[] args) {
		BST tree = new BST(new Integer(5), null, null);
		tree = insert(tree, 10);
		tree = insert(tree, 100);
		tree = insert(tree, 11);
		tree = insert(tree, 110);
		tree = insert(tree, 50);
		System.out.println("The tree is as follows : ");
		print(tree);
		System.out.println("The max depth of the tree is : " + maxDepth(tree));
	}
}

class BST {
	int val;
	BST left;
	BST right;

	public BST(int val, BST left, BST right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
