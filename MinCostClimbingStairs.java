package Leetcode;

public class MinCostClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinCostClimbingStairs m = new MinCostClimbingStairs();
		int cost[]={10,15,20};
		System.out.println(m.minCostClimbingStairs(cost));

	}
	public int minCostClimbingStairs(int[] cost) {
		int dp[] = new int[cost.length+1];
		
		for(int i=2;i<dp.length;i++){
			dp[i]=Math.min(cost[i-1]+dp[i-1], cost[i-2] + dp[i-2]);
		}
		return dp[dp.length-1];
	}

}
