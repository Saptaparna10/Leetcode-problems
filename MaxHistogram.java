package Leetcode;

import java.util.Stack;

public class MaxHistogram {

	public int largestRectangleArea(int[] heights) {

		Stack<Integer> stack = new Stack<>();
		int maxArea = -1;
		int area = 0;
		int i;
		
		for(i=0;i<heights.length;){
			if(stack.isEmpty() || heights[stack.peek()] <= heights[i]){
				stack.push(i++);
			}
			else{
				int top = stack.pop();
				if(stack.isEmpty()){
					area = heights[top] * i;
				}
				else{
					area = heights[top] * (i - stack.peek() - 1);
				}
				if(area > maxArea){
					maxArea = area;
				}
			}
		}
		while(!stack.isEmpty()){
			int top = stack.pop();
			if(stack.isEmpty()){
				area = heights[top] * i;
			}
			else{
				area = heights[top] * (i - stack.peek() - 1);
			}
			if(area > maxArea){
				maxArea = area;
			}
		}
		return maxArea;
	}
	
	
	public static void main(String[] args) {
		MaxHistogram m = new MaxHistogram();
		int[] heights = {2,1,2,3,1};
		System.out.println(m.largestRectangleArea(heights));

	}

}
