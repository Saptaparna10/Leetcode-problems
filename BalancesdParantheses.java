package Leetcode;

import java.util.Stack;

class BalancedParantheses
{
	public boolean isValid(String s) {

	Stack<Character> st = new Stack<>();
	char[] exp = s.toCharArray();
	for(char c : exp){
		if(c == '(' || c== '{' || c=='['){
			st.push(c);
		}
		else if(c == ')' || c=='}' || c==']'){
			if(st.isEmpty()){
				return false;
			}
			else{
				char temp = st.peek();
				if(checkMatching(temp,c)){
					st.pop();
				}
				else{
					return false;
				}
			}
		}
	}
	if(st.isEmpty()){
		return true;
	}
	else{
		return false;
	}

}

private boolean checkMatching(char open, char close) {
	if(open == '(' && close == ')'){
		return true;
	}
	else if(open == '{' && close == '}'){
		return true;
	} 
	else if(open == '[' && close == ']'){
		return true;
	}
	else
		return false;
}
}
