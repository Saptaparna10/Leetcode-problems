package Leetcode;

public class Pow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pow p = new Pow();
		System.out.println(p.myPow(0.00001
				,2147483647));
	}
	public double myPow(double x, int n) {
		if(n==0){
			return 1;
		}
		double res= myPow(x,n/2);
		int pow=n>0?n:(0-n);

		for(int i=1;i<=pow/2;i++){
			res=res*x;
		}
		return n>0?res*res:1/(res*res);


	}

}
