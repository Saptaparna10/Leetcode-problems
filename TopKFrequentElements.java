package Leetcode;

import java.util.*;

public class TopKFrequentElements {

	public static void main(String[] args) {
		TopKFrequentElements t = new TopKFrequentElements();
		int[] nums= {1,1,4,4,4,5,1,2,2,3};
		List<Integer> res = t.topKFrequent(nums, 2);
		for(int x:res){
			System.out.println(x);
		}

	}
	public List<Integer> topKFrequent(int[] nums, int k) {
		TreeMap<Integer, Integer> t = new TreeMap<>();
		for(int i:nums){
			if(t.containsKey(i)){
				t.put(i, t.get(i)+1);
			}
			else{
				t.put(i, 1);
			}
		}
		 PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue()-b.getValue());
		    for(Map.Entry<Integer, Integer> entry : t.entrySet()) {
		        pq.offer(entry);
		        if(pq.size() > k) pq.poll();
		    }
		    
		    List<Integer> res = new LinkedList<>();
		    while(!pq.isEmpty()) {
		        res.add(0, pq.poll().getKey());
		    }
		    return res;
	}

}
