package Leetcode;

import LinkedList.LinkedList;
import LinkedList.Node;

public class OddEvenLinkedList {
	public Node oddEvenList(Node head) {if (head != null) {
    
        Node odd = head, even = head.next, evenHead = even; 
    
        while (even != null && even.next != null) {
            odd.next = odd.next.next; 
            even.next = even.next.next; 
            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead; 
    }
    return head;
    }

	public static void main(String[] args) {
		OddEvenLinkedList o = new OddEvenLinkedList();
		LinkedList input = new LinkedList();
		for(int i=1;i<=5;i++){
			input.addAtEnd(i);
		}
		input.printList();
		Node res=o.oddEvenList(input.head);
		LinkedList output = new LinkedList();
		output.head = res;
		output.printList();
	}

}
