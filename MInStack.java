package Leetcode;

import java.util.EmptyStackException;
import java.util.Stack;

public class MInStack {

	Stack<Integer> helper;
	Stack<Integer> main;

	/** initialize your data structure here. */
	public MInStack() {
		helper = new Stack<>();
		main = new Stack<>();
	}

	public void push(int x) {
		if(helper.isEmpty() || helper.peek() >= x){
			helper.push(x);
		}
		main.push(x);
	}

	public void pop() {
		int temp = main.pop();
		if(temp == helper.peek()){
			helper.pop();
		}
	}

	public int top() {
		return main.peek();
	}

	public int getMin() {
		return helper.peek();
	}

	public static void main(String args[]){
		MInStack m = new MInStack();
		m.push(1);
		m.push(2);
		//m.push(0);
		System.out.println(m.top());
		System.out.println(m.getMin());
		m.pop();
		System.out.println(m.getMin());
		//System.out.println(m.top());
		

	}
}
