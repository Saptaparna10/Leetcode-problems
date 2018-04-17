package Leetcode;

import LinkedList.LinkedList;
import LinkedList.Node;

public class SorLinkList {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();

		// creating first list
		list1.head = new Node(10);
		list1.head.next = new Node(2);
		list1.head.next.next = new Node(4);

		list1.printList();
		SorLinkList ml = new SorLinkList();
		LinkedList list3 = new LinkedList();
		list3.head = ml.sortList(list1.head);
		list3.printList();

	}

	public Node sortList(Node head) {
		if(head==null || head.next==null){
			return head;
		}
		Node slow=head;
		Node prev=	null;
		Node fast=head;

		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			prev=slow;
			slow=slow.next;
		}
		prev.next = null;
		Node l1= sortList(head);
		Node l2= sortList(slow);
		return merge(l1,l2);
	}

	private Node merge(Node l1, Node l2) {
		Node l = new Node(0), p = l;

		while (l1 != null && l2 != null) {
			if (l1.data < l2.data) {
				p.next = l1;
				l1 = l1.next;
			} else {
				p.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}

		if (l1 != null)
			p.next = l1;

		if (l2 != null)
			p.next = l2;

		return l.next;
	}
}
