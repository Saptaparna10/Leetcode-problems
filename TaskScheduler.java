package Leetcode;

import java.util.Arrays;

public class TaskScheduler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskScheduler t = new TaskScheduler();
		char[] tasks={'A','A','A','B','B','B'};
		System.out.println(t.leastInterval(tasks, 2));

	}
	public int leastInterval(char[] tasks, int n) {
		int[] c = new int[26];
		for(char t : tasks){
			c[t - 'A']++;
		}
		Arrays.sort(c);
		int i = 25;
		while(i >= 0 && c[i] == c[25]) i--;

		return Math.max(tasks.length, (c[25] - 1) * (n + 1) + 25 - i);

	}

}
