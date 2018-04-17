package Leetcode;

import java.util.*;

public class GroupAnagram {

	public static void main(String[] args) {
		GroupAnagram g = new GroupAnagram();
		List<List<String>> res = new ArrayList<List<String>>();
		String[] strs={"eat", "tea", "tan", "ate", "nat", "bat"};
		res = g.groupAnagrams(strs);
		for(List<String> l:res){
			for(String s: l){
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}

	public List<List<String>> groupAnagrams(String[] strs) {

		if (strs == null || strs.length == 0) return new ArrayList<List<String>>();
		Map<String, List<String>> dic = new HashMap<>();
		for(String s:strs){
			char[] c = s.toCharArray();
			Arrays.sort(c);
			String st = String.valueOf(c);
			if(!dic.containsKey(st)){
				dic.put(st, new ArrayList<String>());
			}
			dic.get(st).add(s);
		}
		return new ArrayList<>(dic.values());



	}
}
