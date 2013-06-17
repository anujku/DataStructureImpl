package com.anuj.dsimpl.linkedlist;

//Uncomment the List.java at the bottom of this file.

class CountLinkedListNode {

	static int nodeCount(List inpList) {
		int count = 0;

		while (inpList != null) {
			count++;
			inpList = inpList.next;
		}
		return count;
	}

	public static void main(String[] args) {
		List inpList = new List(1);
		inpList.next = new List(2);
		inpList.next.next = new List(3);
		inpList.next.next.next = new List(4);
		inpList.next.next.next.next = new List(5);
		inpList.next.next.next.next.next = new List(6);

		System.out.println("Input List : " + inpList.toString());

		System.out.println("No. of nodes in the list : " + nodeCount(inpList));
	}
}

//class List {
//	int val;
//	List next;
//
//	public List(int val) {
//		this.val = val;
//	}
//
//	public String toString() {
//		List current = this;
//		String output = "";
//
//		while (current != null) {
//			output += current.val + "->";
//			current = current.next;
//		}
//
//		return output + "NULL";
//
//	}
//}
