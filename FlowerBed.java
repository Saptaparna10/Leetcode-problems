package Leetcode;

public class FlowerBed {

	public static void main(String[] args) {

		FlowerBed f = new FlowerBed();
		int input[]={1,0,1,0,1,0,1};
		System.out.println(f.canPlaceFlowers(input, 0));

	}
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		
		
		/*int count = 0;
        for(int i = 0; i < flowerbed.length && count < n; i++) {
            if(flowerbed[i] == 0) {
	     //get next and prev flower bed slot values. If i lies at the ends the next and prev are considered as 0. 
               int next = (i == flowerbed.length - 1) ? 0 : flowerbed[i + 1]; 
               int prev = (i == 0) ? 0 : flowerbed[i - 1];
               if(next == 0 && prev == 0) {
                   flowerbed[i] = 1;
                   count++;
               }
            }*/

		boolean[] res=new boolean[flowerbed.length];
		for(int i=0;i<res.length;i++){
			res[i]=true;
		}
		for(int i=0;i<flowerbed.length;i++){
			if(flowerbed[i]==1){
				res[i]=false;
				if(i<flowerbed.length-1){
					res[i+1]=false;
				}
				if(i>0){
					res[i-1]=false;
				}
			}
		}
		boolean found = true;
		while(n>0){
			n--;
			for(int i=0;i<res.length;i++){
				found=false;
				if(res[i]){
					found=true;
					res[i]=false;
					if(i<flowerbed.length-1){
						res[i+1]=false;
					}
					if(i>0){
						res[i-1]=false;
					}
					break;
				}
			}
		}
		return found;

	}


}
