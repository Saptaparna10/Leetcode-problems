package Leetcode;

import LinkedList.Node;

public class SwapNodes {

	public static void main(String[] args) {
		SwapNodes s = new SwapNodes();
		Node head = new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(3);
		/*head.next.next.next=new Node(4);
		head.next.next.next.next=new Node(5);
		head.next.next.next.next.next=new Node(6);*/
		Node res = s.swapPairs(head);
		while(res!=null){
			System.out.println(res.data);
			res=res.next;
		}

	}
	public Node swapPairs(Node head) {
        if(head==null){
            return null;
        }
        Node pre=null;
        Node prev=head;
        if(prev.next==null){
            return head;
        }
        Node current=head.next;
        while(current!=null){
            prev.next=current.next;
            current.next=prev;
            if(prev==head){
            	head=current;
            }
            if(pre!=null){
            	pre.next=current;
            }
            pre=prev;
            prev=prev.next;
            if(prev==null){
            	current=null;
            	continue;
            }
            current=prev.next;
        }
        return head;
    }

}
