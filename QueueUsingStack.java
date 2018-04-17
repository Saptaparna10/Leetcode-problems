package Leetcode;

import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> oldest;
	Stack<Integer> newest;
	
	public QueueUsingStack(){
		oldest = new Stack<>();
		newest = new Stack<>();
	}
	
	public void add(int item){
		newest.push(item);
	}
	
	public int remove(){
		shiftStack();
		return oldest.pop();
	}
	
	
	private void shiftStack() {
		if(oldest.isEmpty()){
			while(!newest.isEmpty()){
				oldest.push(newest.pop());
			}
		}
		
	}

	public static void main(String[] args) {
		QueueUsingStack q = new QueueUsingStack();
		q.add(1);
		q.add(5);
		System.out.println(q.remove());
	}

}
