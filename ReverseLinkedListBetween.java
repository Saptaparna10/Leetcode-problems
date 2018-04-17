package Leetcode;

import LinkedList.LinkedList;
import LinkedList.Node;

public class ReverseLinkedListBetween {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();

		// creating first list
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(3);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(5);


		ReverseLinkedListBetween rs = new ReverseLinkedListBetween();
		list.printList();
		System.out.println("Reverse!!");
		list.head = rs.reverseBetween(list.head,2,4);
		list.printList();


	}
	public Node reverseBetween(Node head, int m, int n) {
		int count=1;
		Node newHead = null;
		Node curr=head;
		while(curr!=null && count<m){
			count++;
			newHead=curr;
			curr=curr.next;
		}
		Node prev=newHead;
		Node last = curr;
		newHead=curr;
		curr=curr.next;
		while(curr!=null && count>=m && count<n){
			Node next = curr.next;
			curr.next = newHead;
			newHead = curr;
			curr = next;
			count++;
		}
		if(prev!=null){
			prev.next=newHead;
			
		}
		if(last!=null){
			last.next=curr;
		}

		return m>1?head:newHead;
	}
}
