package com.anuj.dsimpl.linkedlist;

//Uncomment the List.java at the bottom of this file.
class AppendLinkedLists {

	static List push(List list, int num) {
		List newList = new List(num);
		newList.next = list;
		return newList;
	}

	static List appendLists(List listA, List listB) {
		if (listA == null)
			return listB;
		else {
			List tempList = listA;
			while (tempList.next.next != null) {
				tempList = tempList.next;
			}
			tempList.next.next = listB;
			return listA;			
		}
	}

	public static void main(String[] args) {
		List listA = new List(0);
		listA = push(listA, 1);
		listA = push(listA, 2);
		listA = push(listA, 3);
		listA = push(listA, 4);

		List listB = new List(0);
		listB = push(listB, 1);
		listB = push(listB, 2);
		listB = push(listB, 3);
		listB = push(listB, 4);

		System.out.println("Input List A : " + listA.toString());
		System.out.println("Input List B : " + listB.toString());
		listA = appendLists(listA, listB);
		System.out
				.println("Combined Input Lists A and B : " + listA.toString());
	}
}

class List {
	int val;
	List next;

	public List(int val) {
		this.val = val;
	}

	public String toString() {
		String output = "";
		List current = this;

		while (current != null) {
			output += current.val + "->";
			current = current.next;
		}
		return output + "NULL";
	}
}