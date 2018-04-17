package Leetcode;

import LinkedList.Node;

public class SplitLinkedList {

	public Node[] splitListToParts(Node root, int k) {

		if(root==null){
			return null;
		}
		int length=0;
		Node t=root;
		while(t!=null){
			t=t.next;
			length++;
		}
		Node[] res= new Node[k];
		int ind=0;
		int eachLength=length/k;
		int extra = length%k;
		Node main = root;
		while(main!=null){
			Node tempRoot = new Node();
			Node temp=tempRoot;
			for(int i=0;i<eachLength;i++){
				temp.next = new Node(main.data);
				temp=temp.next;
				main=main.next;
			}
			if(extra>0){
				temp.next= new Node(main.data);
				extra--;
				temp=temp.next;
				main=main.next;
			}
			temp.next=null;
			res[ind++]=tempRoot.next;
		}

		return res;
	}
	public static void main(String args[]){
		SplitLinkedList s = new SplitLinkedList();
		Node root= new Node(1);
		root.next=new Node(2);
		root.next.next = new Node(3);
		root.next.next.next =  new Node(4);
		Node[] res= s.splitListToParts(root, 5);
		for(Node head:res){
			if(head==null){
				System.out.print("null");
			}
			while(head!=null){
				System.out.print(head.data+" ");
				head=head.next;
			}
			
			System.out.println();
		}
	}
}
