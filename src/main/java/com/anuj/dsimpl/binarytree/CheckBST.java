package com.anuj.dsimpl.binarytree;

public class CheckBST {

	static boolean checkBST(Tree tree) {
		if (tree == null)
			return true;
		if (tree.left != null) {
			if (tree.right != null) {
				if (tree.val > tree.left.val && tree.val < tree.right.val)
					return (checkBST(tree.left) && checkBST(tree.right));
				else
					return false;
			} else {
				if (tree.val > tree.left.val)
					return checkBST(tree.left);
				else
					return false;
			}
		} else if (tree.right != null) {
			if (tree.val < tree.right.val)
				return checkBST(tree.right);
			else
				return false;
		} else
			return true;
	}

	public static void main(String[] args) {
		Tree left1 = new Tree(new Integer(22), null, null);
		Tree right1 = new Tree(new Integer(33), null, null);
		Tree left = new Tree(new Integer(25), left1, right1);
		Tree right = new Tree(new Integer(31), left1, right1);
		Tree tree = new Tree(new Integer(20), left, right);

		if (checkBST(tree))
			System.out.println("Its a binary com.anuj.dsimpl.search tree");
		else
			System.out.println("Its not a binary com.anuj.dsimpl.search tree");

		if (checkBST(new Tree(new Integer(20), left, null)))
			System.out.println("Its a binary com.anuj.dsimpl.search tree");
		else
			System.out.println("Its not a binary com.anuj.dsimpl.search tree");

		if (checkBST(new Tree(new Integer(20), null, right)))
			System.out.println("Its a binary com.anuj.dsimpl.search tree");
		else
			System.out.println("Its not a binary com.anuj.dsimpl.search tree");
	}

}

class Tree {
	int val;
	Tree left;
	Tree right;

	public Tree(int val, Tree left, Tree right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
