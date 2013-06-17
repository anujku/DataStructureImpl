package com.anuj.dsimpl.linkedlist;

public class NthElementData {

	static Node insert(Node node, int val) {
		Node newNode = new Node(val);
		newNode.next = node;
		return newNode;
	}

	static int getNthElem(Node node, int index) {
		int count = 1;
		while (node != null) {
			if (count == index)
				return node.val;
			node = node.next;
			count++;
		}
		return 0;
	}

	public static void main(String[] args) {
		Node node = new Node(0);
		node = insert(node, 1);
		node = insert(node, 2);
		node = insert(node, 3);
		node = insert(node, 4);
		node = insert(node, 5);

		int element = 1;
		System.out.println(+element + " postion node of the list is : "
				+ getNthElem(node, element));
	}
}

class Node {
	int val;
	Node next;

	public Node(int val) {
		this.val = val;
	}

	public String toString() {
		Node current = this;
		String output = "";

		while (current != null) {
			output += current.val + "->";
			current = current.next;
		}
		return output + "NULL";
	}
}