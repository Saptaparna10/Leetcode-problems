package Leetcode;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
		HappyNumber h = new HappyNumber();
		System.out.println(h.isHappy(3));

	}
	public boolean isHappy(int n) {
		Set<Integer> st = new HashSet<>();
		int remain;
		while(st.add(n)){
			int sum=0;
			while(n>0){
				remain = n%10;
				sum=sum+remain*remain;
				n=n/10;
			}
			if(sum==1){
				return true;
			}
			else{
				n=sum;
			}
		}
		return false;
	}
}
