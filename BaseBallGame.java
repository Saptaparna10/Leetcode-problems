package Leetcode;

import java.util.Stack;

public class BaseBallGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseBallGame b = new BaseBallGame();
		String ops[]={"5","2","C","D","+"};
		System.out.println(b.calPoints(ops));
	}
	public int calPoints(String[] ops) {
		Stack<Integer> st = new Stack<Integer>();
		for(String s:ops){
			if(isInteger(s)==true){
				st.push(Integer.parseInt(s));
			}
			else if(s.equals("+")){
				int temp = st.pop();
				int res=temp+st.peek();
				st.push(temp);
				st.push(res);
			}
			else if(s.equals("C")){
				st.pop();
			}
			else if(s.equals("D")){
				st.push(2*st.peek());
			}
		}
		int sum=0;
		while(!st.isEmpty()){
			sum = sum + st.pop();
		}
		return sum;
	}

	public static boolean isInteger(String s) {
		boolean isValidInteger = false;
		try
		{
			Integer.parseInt(s);

			// s is a valid integer

			isValidInteger = true;
		}
		catch (NumberFormatException ex)
		{
			// s is not an integer
		}

		return isValidInteger;
	}

}
