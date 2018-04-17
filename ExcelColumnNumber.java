package Leetcode;

public class ExcelColumnNumber {

	public static void main(String[] args) {
		ExcelColumnNumber e = new ExcelColumnNumber();
		System.out.println(e.titleToNumber("BA"));


	}

	public int titleToNumber(String s) {
		int result = 0;
		for(int i = 0 ; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		return result;
	}

}
