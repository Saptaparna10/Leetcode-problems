package Leetcode;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HammingDistance h =new HammingDistance();
		System.out.println(h.hammingDistance(1,4));

	}
		public int hammingDistance(int x, int y) {
			
			int dist=0;
			while(x!=0 || y!=0){
				if(x%2 != y%2){
					dist++;
				}
				x=x/2;
				y=y/2;
			}
			return dist;
		}
}
