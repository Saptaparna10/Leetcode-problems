package Leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseInt {



	public int reverse(int x) {
		long rev=0;
		while(x!=0){
			rev=rev*10+(long)x%10;
			x=x/10;
			if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
				return 0;
			}
		}
		return (int)rev;
	}

	public static void main(String[] args) {
		ReverseInt r = new ReverseInt();
		System.out.println(r.reverse(-123));
	}

}
