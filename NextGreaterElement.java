package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


/*Key observation:
Suppose we have a decreasing sequence followed by a greater number
For example [5, 4, 3, 2, 1, 6] then the greater number 6 is the next greater element for all previous numbers in the sequence

We use a stack to keep a decreasing sub-sequence, whenever we see a number x greater than stack.peek() we pop all elements less than x and for all the popped ones, their next greater element is x
For example [9, 8, 7, 3, 2, 1, 6]
The stack will first contain [9, 8, 7, 3, 2, 1] and then we see 6 which is greater than 1 so we pop 1 2 3 whose next greater element should be 6*/
public class NextGreaterElement {


	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<>();
		Stack<Integer> st=new Stack<>();
		int res[] = new int[nums1.length];
		
		for(int i:nums2){
			while(!st.isEmpty() && i>st.peek()){
				map.put(st.pop(), i);
			}
			st.push(i);
		}
		for(int i=0;i<nums1.length;i++){
			res[i]=map.getOrDefault(nums1[i], -1);
		}
		return res;
		
	}

}
