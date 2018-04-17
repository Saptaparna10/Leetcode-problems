package Leetcode;

import java.util.Stack;

public class SortStack {

	public Stack<Integer> sortIterative(Stack<Integer> s){
		Stack<Integer> helper = new Stack<>();
		while(!s.isEmpty()){
			int temp = s.pop();
			while(!helper.isEmpty() && temp < helper.peek()){
				s.push(helper.pop());
			}
			helper.push(temp);
		}
		while(!helper.isEmpty()){
			s.push(helper.pop());
		}
		return s;
	}

	public Stack<Integer> sortRec(Stack<Integer> s){
		if(!s.isEmpty()){
			int temp = s.pop();
			sortRec(s);
			insertRec(temp,s);
		}
		return s;
	}

	public void insertRec(Integer element, Stack<Integer> s){
		if(s.isEmpty() || element > s.peek()){
			s.push(element);
			return;
		}

		int temp = s.pop();
		insertRec(element, s);
		s.push(temp);
	}



	public static void main(String[] args) {
		SortStack ss = new SortStack();
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(1);
		s.push(0);
		s.push(7);
		s.push(15);
		s.push(11);
		Stack<Integer> s2 = (Stack<Integer>) s.clone();
		
		Stack<Integer> resItr = ss.sortIterative(s);
		Stack<Integer> resRec = ss.sortRec(s2);
		System.out.println("Iterative..");
		while(!resItr.isEmpty()){
			System.out.print(resItr.pop()+" ");
		}
		System.out.println();
		System.out.println("Recursive..");
		while(!resRec.isEmpty()){
			System.out.print(resRec.pop() + " ");
		}

	}

}
