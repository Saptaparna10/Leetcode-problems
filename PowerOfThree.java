package Leetcode;

public class PowerOfThree {

	public static void main(String[] args) {
		PowerOfThree h = new PowerOfThree();
		System.out.println(h.isPowerOfThree(0));

	}
	public boolean isPowerOfThree(int n) {
		if(n==0){
			return false;
		}
		while(n!=1){
			int mod = n%3;
			n=n/3;
			if(mod!=0){
				return false;
			}
		}
		return true;
	}
}
