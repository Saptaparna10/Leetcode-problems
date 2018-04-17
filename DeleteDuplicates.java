package Leetcode;

import LinkedList.Node;

public class DeleteDuplicates {

	public static void main(String[] args) {
		DeleteDuplicates d = new DeleteDuplicates();
		Node head = new Node();
		head.data=1;
		head.next = new Node(1);
		//head.next.next = new Node(2);
		Node res = d.deleteDuplicates(head);
		while(res!=null){
			System.out.println(res.data);
			res=res.next;
		}
	}

	public Node deleteDuplicates(Node head) {
		if(head==null){
			return null;
		}
		Node cur = head;
		Node prev = null;

		while(cur!=null){
			if(null!=prev && prev.data==cur.data){
				prev.next=cur.next;
				cur=cur.next;
			}
			else{
				prev=cur;
				cur=cur.next;
			}
		}
		return head;
	}

}
