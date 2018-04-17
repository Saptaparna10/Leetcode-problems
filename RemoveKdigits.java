package Leetcode;

public class RemoveKdigits {
	
	public String removeKdigits(String num, int k) {
		int digits = num.length()-k;
		char stk[] = new char[digits];
		int top=0;
		
		for(int i=0;i<num.length();i++){
			char c=num.charAt(i);
			while(k>0 && top>0 && stk[i-1]>c){
				top--;
				k--;
			}
			stk[top++]=c;
		}
		//get index of first non zero digit
		int idx=0;
		while(idx<digits && stk[idx]=='0'){
			idx++;
		}
		return idx==digits?"0":new String(stk,idx,digits-idx);
	}

}
