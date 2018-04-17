package Leetcode;

import java.util.*;
import java.util.Map.Entry;

public class SortMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("java", 20);
		map.put("C++", 45);
		map.put("Java2Novice", 2);
		map.put("Unix", 67);
		map.put("MAC", 26);
		map.put("Why this kolavari", 93);
		
		List<Entry<String, Integer>> l= new ArrayList<>(map.entrySet());
		
		Collections.sort(l,new MapComparator());
		
		for(Map.Entry<String, Integer> m:l){
			System.out.println(m.getKey()+"---"+m.getValue());
		}
	}

}

class MapComparator implements Comparator<Map.Entry<String, Integer>>{

	@Override
	public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}

	
	
}
