package Leetcode;

import java.util.Stack;

public class BasicCalculator {

	public static void main(String[] args) {
		BasicCalculator b =new BasicCalculator();
		System.out.println(b.calculate("3*2+2"));
	}
	public int calculate(String s) {
		if(s.length()==0 || null==s){
			return 0;
		}
		Stack<Integer> stack = new Stack<>();
		int num=0;
		char sign='+';
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				num=num*10+s.charAt(i)-'0';
			}
			if(!(Character.isDigit(s.charAt(i))) && (' '!=s.charAt(i)) || i==s.length()-1){
				if(sign=='-'){
	                stack.push(-num);
	            }
	            if(sign=='+'){
	                stack.push(num);
	            }
	            if(sign=='*'){
	                stack.push(stack.pop()*num);
	            }
	            if(sign=='/'){
	                stack.push(stack.pop()/num);
	            }
	            sign = s.charAt(i);
	            num = 0;
			}
		}
		int re=0;
		for(int i:stack){
			re=re+i;
		}
		return re;
		
	}

}
