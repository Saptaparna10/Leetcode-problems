package Leetcode;

public class CountAndSay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountAndSay c = new CountAndSay();
		System.out.println(c.countAndSay(6));
	}
	  public String countAndSay(int n) {
	        String s = "1";
	        for(int i = 1; i < n; i++){
	            s = countIdx(s);
	        }
	        return s;
	    }
	    
	    public String countIdx(String s){
	        StringBuilder sb = new StringBuilder();
	        char c = s.charAt(0);
	        int count = 1;
	        for(int i = 1; i < s.length(); i++){
	            if(s.charAt(i) == c){
	                count++;
	            }
	            else
	            {
	                sb.append(count);
	                sb.append(c);
	                c = s.charAt(i);
	                count = 1;
	            }
	        }
	        sb.append(count);
	        sb.append(c);
	        return sb.toString();
	    }

}
