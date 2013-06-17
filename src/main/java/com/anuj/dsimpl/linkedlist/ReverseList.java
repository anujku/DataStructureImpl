package com.anuj.dsimpl.linkedlist;

// Uncomment the List.java at the bottom of this file.
class ReverseList {

	static List reverse(List inputList) {

		if (inputList == null || inputList.next == null)
			return inputList;

		List reverseList = reverse(inputList.next);
		inputList.next.next = inputList;
		inputList.next = null;

		return reverseList;
	}

	public static void main(String[] args) {
		List inpList = new List(1);
		inpList.next = new List(2);
		inpList.next.next = new List(3);
		inpList.next.next.next = new List(4);
		inpList.next.next.next.next = new List(5);

		System.out.println("Input List : " + inpList.toString());
		List reverseList = reverse(inpList);
		System.out.println("Reverse List : " + reverseList.toString());
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
//	}
//}
