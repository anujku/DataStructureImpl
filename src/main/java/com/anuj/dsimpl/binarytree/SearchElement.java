package com.anuj.dsimpl.binarytree;

class SearchElement {

	static boolean search(BST tree, int element) {
		if (tree != null) {
			if (tree.val == element) {
				return true;
			} else if (element < tree.val)
				return search(tree.left, element);
			else
				return search(tree.right, element);
		} else
			return false;
	}

	static BST insert(BST tree, int element) {
		BST newTree = new BST(element, null, null);
		if (tree == null)
			tree = newTree;
		else if (element <= tree.val)
			tree.left = insert(tree.left, element);
		else
			tree.right = insert(tree.right, element);

		return tree;
	}

	static void print(BST tree) {
		if (tree == null)
			return;
		System.out.println(tree.val + " ");
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

		int element = 5;
		System.out.println("Searching " + element + " in the tree above....");
		boolean flag = search(tree, element);
		if (flag)
			System.out.println("Element found ...!");
		else
			System.out.println("Element not found ...!");
	}
}

//class BST {
//	int val;
//	BST left;
//	BST right;
//
//	public BST(int val, BST left, BST right) {
//		this.val = val;
//		this.left = left;
//		this.right = right;
//	}
//}
