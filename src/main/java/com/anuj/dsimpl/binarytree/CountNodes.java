package com.anuj.dsimpl.binarytree;

class CountNodes {

	static int minValue(Tree tree, int val) {
		int min = val;
		int min1, min2;
		if (tree != null) {
			if (tree.left != null) {
				if (tree.right != null) {
					min1 = minValue(tree.left, tree.val);
					min2 = minValue(tree.right, tree.val);
					min = findMin(min1, min2, tree.val);
				} else {
					min = minValue(tree.left, tree.val);
				}
			} else if (tree.right != null) {
				min1 = minValue(tree.right, tree.val);
				if (min1 < tree.val)
					min = min1;
				else
					min = tree.val;
			} else {
				min = tree.val;
			}
		}
		return min;
	}

	static int findMin(int val1, int val2, int val3) {
		if (val1 < val2) {
			if (val1 < val3)
				return val1;
			else
				return val3;
		} else if (val2 < val3)
			return val2;
		else
			return val3;
	}

	static int treeSize(Tree tree) {
		if (tree == null)
			return 0;
		return (1 + treeSize(tree.left) + treeSize(tree.right));
	}

	static int total(Tree tree) {
		if (tree == null)
			return 0;
		Integer val = (Integer) tree.val;
		return val.intValue() + total(tree.left) + total(tree.right);
	}

	/**
	 * For the example expression the output is + 1 * 2 3. This is different
	 * from both postfix and infix; it is a new notation called prefix, in which
	 * the operators appear before their operands. You might suspect that if we
	 * traverse the tree in a different order we get the expression in a
	 * different notation. For example, if we print the subtrees first, and then
	 * the root node:
	 * 
	 * @param tree
	 */
	static void printPostorder(Tree tree) {
		if (tree == null)
			return;
		printPostorder(tree.left);
		printPostorder(tree.right);
		System.out.print(tree.val + " ");
	}

	/**
	 * We get the expression in postfix (1 2 3 * +)! As the name of the previous
	 * method implies, this order of traversal is called postorder. Finally, to
	 * traverse a tree inorder, we print the left tree, then the root, then the
	 * right tree: The result is 1 + 2 * 3, which is the expression in infix.
	 * 
	 * @param tree
	 */
	static void printInorder(Tree tree) {
		if (tree == null)
			return;
		printInorder(tree.left);
		System.out.print(tree.val + " ");
		printInorder(tree.right);
	}

	static void print(Tree tree) {
		if (tree == null)
			return;
		System.out.print(tree.val + " ");
		print(tree.left);
		print(tree.right);
	}

	public static void main(String[] args) {
		Tree left1 = new Tree(new Integer(22), null, null);
		Tree right1 = new Tree(new Integer(33), null, null);
		Tree left = new Tree(new Integer(-2), left1, right1);
		Tree right = new Tree(new Integer(3), left1, right1);
		Tree tree = new Tree(new Integer(1), left, right);

		System.out.println("Size of the Tree is : \n" + treeSize(tree));

		System.out.println("Total of the Tree is : \n" + total(tree));

		System.out.println("The Tree is :");
		print(tree);

		System.out.println("\nThe Tree printed inorder is :");
		printInorder(tree);

		System.out.println("\nThe Tree printed postorder is :");
		printPostorder(tree);

		System.out.println("The Min Value in this Tree is :"
				+ minValue(tree, 0));
	}
}

//class Tree {
//	int val;
//	Tree left;
//	Tree right;
//
//	public Tree(int val) {
//		this.val = val;
//	}
//
//	public Tree(int val, Tree left, Tree right) {
//		this.val = val;
//		this.left = left;
//		this.right = right;
//	}
//
//}