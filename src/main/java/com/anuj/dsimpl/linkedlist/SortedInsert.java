package com.anuj.dsimpl.linkedlist;

//Uncomment the List.java at the bottom of this file.
class SortedInsert {

	static List sortedInsert(List inpList, int num) {

		if (inpList == null || inpList.val < num) {
			return push(inpList, num);
		} else {
			List tempList = inpList;

			while (tempList.next != null && tempList.next.val > num) {
				tempList = tempList.next;
			}

			List list = new List(num);
			list.next = tempList.next;
			tempList.next = list;
			return inpList;
		}
	}

	static List push(List list, int val) {
		List newList = new List(val);
		newList.next = list;
		return newList;
	}

	public static void main(String[] args) {
		List inpList = new List(10);
		inpList = push(inpList, 12);
		inpList = push(inpList, 32);
		inpList = push(inpList, 405);
		inpList = push(inpList, 5315);
		inpList = push(inpList, 6534);

		System.out.println("Input List : " + inpList.toString());
		int num = 20;
		System.out.println("\n We will insert " + num + " in the list");
		inpList = sortedInsert(inpList, num);
		System.out.println("List now is : " + inpList.toString());
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
//		String output = "";
//		List current = this;
//
//		while (current != null) {
//			output += current.val + "->";
//			current = current.next;
//		}
//		return output + "NULL";
//
//	}
//}