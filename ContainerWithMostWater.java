package Leetcode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContainerWithMostWater c= new ContainerWithMostWater();
		int[] input={10,4,3,5,6};
		System.out.println(c.maxArea(input));

	}
	public int maxArea(int[] height) {
		int maxArea=0;
		int low=0;
		int high=height.length-1;
		while(low<high){
			maxArea=Math.max(maxArea, Math.min(height[high],height[low])*(high-low));
			if(height[high]>height[low]){
				low++;
			}
			else{
				high--;
			}
		}
		return maxArea;
	}

}
