package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		FizzBuzz f = new FizzBuzz();
		List<String> res= f.fizzBuzz(15);
		for(String s:res){
			System.out.println(s);
		}

	}
	
	public List<String> fizzBuzz(int n) {
		List<String> res= new ArrayList<String>(n);
		for(int i=1;i<=n;i++){
			if(i%3==0){
				if(i%5==0){
					res.add(i-1, "FizzBuzz");
				}
				else{
					res.add(i-1, "Fizz");
				}
			}
			else if(i%5==0){
				res.add(i-1, "Buzz");
			}
			else{
				res.add(i-1, String.valueOf(i));
			}
		}
		return res;
	}

}
