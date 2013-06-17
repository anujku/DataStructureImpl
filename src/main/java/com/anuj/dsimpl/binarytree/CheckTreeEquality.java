package com.anuj.dsimpl.binarytree;

public class CheckTreeEquality {

	static Tree insert(Tree tree, int element) {
		Tree newTree = new Tree(element, null, null);
		if (tree == null)
			tree = newTree;
		else if (element < tree.val)
			tree.left = insert(tree.left, element);
		else
			tree.right = insert(tree.right, element);
		return tree;
	}

	static void print(Tree tree) {
		if (tree == null)
			return;
		System.out.println(tree.val + " ");
		print(tree.left);
		print(tree.right);
	}

	static boolean checkTreeEquality(Tree tree1, Tree tree2) {
		// if (tree1 != null) {
		// if (tree2 != null) {
		// if (tree1.val == tree2.val) {
		// if (checkTreeEquality(tree1.left, tree2.left))
		// if (checkTreeEquality(tree1.right, tree2.right))
		// return true;
		// }
		// } else
		// return false;
		// } else if (tree2 != null)
		// return false;
		// else
		// return true;
		// return false;

		if (tree1 == null && tree2 == null)
			return true;
		else if (tree1 != null && tree2 != null)
			return ((tree1.val == tree2.val)
					&& checkTreeEquality(tree1.left, tree2.left) 
					&& checkTreeEquality(tree1.right, tree2.right));
		else
			return false;
	}

	public static void main(String[] args) {
		// Tree tree1 = new Tree(new Integer(5), null, null);
		// tree1 = insert(tree1, 10);
		// tree1 = insert(tree1, 10);
		// tree1 = insert(tree1, 100);
		// tree1 = insert(tree1, 11);
		// tree1 = insert(tree1, 1100);
		// tree1 = insert(tree1, 50);

		Tree left1 = new Tree(new Integer(22), null, null);
		Tree right1 = new Tree(new Integer(33), null, null);
		Tree left = new Tree(new Integer(-2), left1, right1);
		Tree right = new Tree(new Integer(3), left1, right1);
		Tree tree1 = new Tree(new Integer(1), left, right);

		System.out.println("The tree1 is as follows : ");
		print(tree1);

		// Tree tree2 = new Tree(new Integer(5), null, null);
		// tree2 = insert(tree2, 10);
		// tree2 = insert(tree2, 100);
		// tree2 = insert(tree2, 11);
		// tree2 = insert(tree2, 1100);
		// tree2 = insert(tree2, 50);

		Tree left2 = new Tree(new Integer(22), null, null);
		Tree right2 = new Tree(new Integer(33), null, null);
		Tree left3 = new Tree(new Integer(-2), left2, right2);
		Tree right3 = new Tree(new Integer(3), left2, right2);
		Tree tree2 = new Tree(new Integer(1), left3, right3);

		System.out.println("The tree2 is as follows : ");
		print(tree2);

		boolean equality = checkTreeEquality(tree1, tree2);

		if (equality)
			System.err.println("Tress are equal");
		else
			System.err.println("Tress are not equal");
	}
}
