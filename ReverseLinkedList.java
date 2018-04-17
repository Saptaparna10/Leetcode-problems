package Leetcode;

import LinkedList.LinkedList;
import LinkedList.Node;

public class ReverseLinkedList {

	public static void main(String args[]){
		LinkedList list = new LinkedList();

		// creating first list
		list.head = new Node(7);
		list.head.next = new Node(5);
		list.head.next.next = new Node(9);
		ReverseLinkedList rs = new ReverseLinkedList();
		list.printList();
		System.out.println("Reverse!!");
		list.head = rs.reverseList(list.head);
		list.printList();
	}
	public Node reverseList(Node head) {
		
		Node newHead = null;
		while(head!=null){
			Node next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

}
