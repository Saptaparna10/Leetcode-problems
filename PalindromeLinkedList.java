package Leetcode;

import java.util.Stack;

import LinkedList.LinkedList;
import LinkedList.LoopDetection;
import LinkedList.Node;

public class PalindromeLinkedList {

	public static void main(String[] args) {
		PalindromeLinkedList p = new PalindromeLinkedList();
		LinkedList list = new LinkedList();
		list.head = new Node(1);
		list.head.next = new Node(2);
		list.head.next.next = new Node(2);
		//list.head.next.next.next = new Node(1);
		System.out.println(p.isPalindrome(list.head));
	}
	
	public boolean isPalindrome(Node head) {
		
		if(head==null){
			return false;
		}
		Stack<Integer> s = new Stack<>();
		
		Node fast = head;
		Node slow = head;
		while(fast!=null && fast.next!=null){
			fast=fast.next.next;
			s.push(slow.data);
			slow=slow.next;
		}
		if(fast!=null){
			slow=slow.next;
		}
		while(slow!=null){
			if(slow.data!=s.pop()){
				return false;
			}
			slow=slow.next;
		}
		return true;
	}
}
