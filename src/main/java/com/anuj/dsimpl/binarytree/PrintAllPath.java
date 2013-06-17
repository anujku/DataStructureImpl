package com.anuj.dsimpl.binarytree;

public class PrintAllPath {

	static void printAllPaths(Tree tree) {
		int[] paths = new int[1000];
		printPathsRecur(tree, paths, 0);
	}

	static void printPathsRecur(Tree tree, int paths[], int pathlen) {
		if (tree == null)
			return;
		paths[pathlen] = tree.val;
		pathlen++;

		if (tree.left == null && tree.right == null) {
			printArray(paths, pathlen);
		} else {
			printPathsRecur(tree.left, paths, pathlen);
			printPathsRecur(tree.right, paths, pathlen);
		}
	}

	static void printArray(int paths[], int pathlen) {
		for (int i = 0; i < pathlen; i++) {
			System.out.print(paths[i]);
			if (i + 1 < pathlen) {
				System.out.print(" -> ");
			}
		}
		System.out.println();
	}

	static Tree insert(Tree tree, int element) {
		Tree tree2 = new Tree(element, null, null);
		if (tree == null)
			tree = tree2;
		else if (element < tree.val)
			tree.left = insert(tree.left, element);
		else
			tree.right = insert(tree.right, element);
		return tree;
	}

	static void print(Tree tree) {
		if (tree == null)
			return;
		System.out.println(tree.val);
		print(tree.left);
		print(tree.right);
	}

	public static void main(String[] args) {
		Tree tree = new Tree(new Integer(5), null, null);
		tree = insert(tree, 10);
		tree = insert(tree, 100);
		tree = insert(tree, 11);
		tree = insert(tree, 110);
		tree = insert(tree, 50);
		System.out.println("The tree is as follows : ");
		print(tree);
		System.out.println("The paths in the tree are as follows : ");
		printAllPaths(tree);
	}
}
