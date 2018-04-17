package Leetcode;

import java.util.Stack;

import DynamicProgramming.MaxRectangleof1s;

class Solution {
	
	public static void main(String[] args) {
		char matrix[][] = {};
		Solution mrs = new Solution();
		int maxRectangle = mrs.maximalRectangle(matrix);
		System.out.println("Max rectangle is of size " + maxRectangle);

	}

    class MaxHistogram {

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
	
	
}
    public int maximalRectangle(char[][] matrix) {
        
    	if(matrix.length == 0){
    		return 0;
    	}
		MaxHistogram mh = new MaxHistogram();
		int dp[] = new int[matrix[0].length];
		int maxArea=0;
		int area=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<dp.length;j++){
				if(matrix[i][j]=='0'){
					dp[j] = 0;
				}
				else{
					dp[j] += Integer.valueOf(matrix[i][j]-'0');
				}

			}
			area = mh.largestRectangleArea(dp);
			if(area > maxArea){
				maxArea = area;
			}
		}
		return maxArea;
	
    }
}

 
