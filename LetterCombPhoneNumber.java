package Leetcode;

import java.util.*;

public class LetterCombPhoneNumber {

	public static void main(String[] args) {


	}
	public List<String> letterCombinations(String digits) {
		Map<Character, String> dict = new HashMap<>();
		dict.put('2', "abc");
		dict.put('3', "def");
		dict.put('4', "ghi");
		dict.put('5', "jkl");
		dict.put('6', "mno");
		dict.put('7', "pqrs");
		dict.put('8', "tuv");
		dict.put('9', "wxyz");

		char[] input = digits.toCharArray();
		for(int i=0;i<input.length;i++){
		}
		return null;

	}

}
