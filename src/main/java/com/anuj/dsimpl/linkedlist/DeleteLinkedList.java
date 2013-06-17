package com.anuj.dsimpl.linkedlist;

//Uncomment the List.java at the bottom of this file.
class DeleteLinkedList {

	static List deleteLinkedList(List inpList) {
		List tempList = inpList;
		while (inpList != null) {
			tempList = inpList.next;
			inpList.next = null;
			inpList = tempList;
		}
		return inpList;
	}

	public static void main(String[] args) {

		List inpList = new List(1);
		inpList.next = new List(2);
		inpList.next.next = new List(3);
		inpList.next.next.next = new List(4);
		inpList.next.next.next.next = new List(5);
		inpList.next.next.next.next.next = new List(6);

		System.out.println("Input List : " + inpList.toString());
		inpList = deleteLinkedList(inpList);

		try {
			System.out.println("Input List : " + inpList.toString());
		} catch (NullPointerException ex) {
			System.out.println("List Deleted !!");
		}
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