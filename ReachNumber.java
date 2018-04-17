
public class ReachNumber {
	public static void main(String args[]){
		ReachNumber r = new ReachNumber();
		System.out.println(r.reachNumber(2));
	}
	public int reachNumber(int target) {/*
		int dp[] = new int[target+1];
		int step=1;
		dp[0]=0;
		for(int i=1;i<=target;i++){
			if((i-1)+step==i){
				dp[i]=step;
				step++;
			}
			else{
				if(((i-1)-step++)+step==i){
					dp[i]=step;
					step++;
				}
			}
		}
		return dp[target];
	*/
		int i=1;
		int sum =0;
		int count=0;
		while(sum<target){
			sum=sum+i;
			count++;
			i++;
		}
		if(sum>target) count++;
		return count;
	}
}
