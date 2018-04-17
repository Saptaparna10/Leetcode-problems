package Leetcode;

import LinkedList.LinkedList;
import LinkedList.Node;

public class RemoventhNodeFromEnd {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// creating first list
		list.head = new Node(7);
		list.head.next = new Node(5);
		list.head.next.next = new Node(9);
		list.head.next.next.next = new Node(11);

		RemoventhNodeFromEnd rs = new RemoventhNodeFromEnd();
		list.printList();
		System.out.println("Remove!!");
		list.head = rs.removeNthFromEnd(list.head,3);
		list.printList();
	}

	private Node removeNthFromEnd(Node head, int i) {
		if(head==null){
			return null;
		}
		Node slow = head;
		Node prev = null;
		Node fast = head;
		
		for(int j=0;j<i;j++){
			if(fast==null){
				return null;
			}
			fast=fast.next;
		}

		
		while(fast!=null){
			fast=fast.next;
			prev=slow;
			slow=slow.next;
		}
		//last node to be removed
		if(slow==null){
			prev.next=null;
		}
		//ist node to be deleted
		else if(prev==null){
			head=slow.next;
		}
		//remove
		else{
			prev.next=slow.next;
		}
		return head;

	}

}
