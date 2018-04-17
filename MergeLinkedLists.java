package Leetcode;

import LinkedList.LinkedList;
import LinkedList.Node;

public class MergeLinkedLists {

	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		// creating first list
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.next.next = new Node(4);

		// creating first list
		list2.head = new Node(1);
		list2.head.next = new Node(3);
		list2.head.next.next = new Node(4);

		list1.printList();
		list2.printList();
		MergeLinkedLists ml = new MergeLinkedLists();
		LinkedList list3 = new LinkedList();
		list3.head = ml.mergeTwoLists(list1.head, list2.head);
		list3.printList();

	}

	public Node mergeTwoLists(Node l1, Node l2) {
		LinkedList result = new LinkedList();
		if(l1 == null && l2 == null){
			return null;
		}
	

		while(l1!=null && l2!=null){
			if(l1.data < l2.data){
				result.addAtEnd(l1.data);
				l1 = l1.next;
			}
			else{
				result.addAtEnd(l2.data);
				l2=l2.next;
			}
		}

		if(l1!=null){
			while(l1!=null){
				result.addAtEnd(l1.data);
				l1=l1.next;
			}
		}
		if(l2!=null){
			while(l2!=null){
				result.addAtEnd(l2.data);
				l2=l2.next;
			}
		}
		return result.head;

	}

}
