package Leetcode;

import java.util.Stack;

public class DailyTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DailyTemp d= new DailyTemp();
		int[] temperatures={73, 74, 75, 71, 69, 72, 76, 73};
		int[] res=d.dailyTemperatures(temperatures);
		for(int i:res){
			System.out.println(i);
		}

	}
	public int[] dailyTemperatures(int[] temperatures) { 
		Stack<Integer> stack = new Stack<>();
		int[] ret = new int[temperatures.length];
		for(int i = 0; i < temperatures.length; i++) {
			while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
				int idx = stack.pop();
				ret[idx] = i - idx;
			}
			stack.push(i);
		}
		return ret;}

}
