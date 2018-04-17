package Leetcode;

import LinkedList.Node;

public class IntersectionOfLinkedLists {
	
	public Node getIntersectionNode(Node headA, Node headB) {
		Node a= headA;
		Node b= headB;
		if(a==null || b==null){
			return null;
		}
		while(a!=b){
			a=a==null?headB:a.next;
			b=b==null?headA:b.next;
		}
		return a;
	}
}
