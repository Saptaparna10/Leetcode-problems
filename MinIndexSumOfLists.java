package Leetcode;

import java.util.*;

public class MinIndexSumOfLists {
	
	public static void main(String[] args){
		MinIndexSumOfLists m = new MinIndexSumOfLists();
		String list1[] = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String list2[] = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		String[] res=m.findRestaurant(list1, list2);
		for(String s:res){
			System.out.println(s);
		}
	}
	
	
	
	
	public String[] findRestaurant(String[] list1, String[] list2) {
    
    List<String> res = new LinkedList<>();
    int minSum=Integer.MAX_VALUE;
    
    Map<String,Integer> m = new HashMap<>();
    
    for(int i=0;i<list1.length;i++){
        m.put(list1[i],i);
    }
    
    for(int i=0;i<list2.length;i++){
        if(m.containsKey(list2[i])){
            Integer j=m.get(list2[i]);
          if (j != null && i + j <= minSum) {
            if (i + j < minSum) { res.clear(); minSum = i+j; }
                res.add(list2[i]);
             }
        }
    }
    
    return res.toArray(new String[res.size()]);
}

}
