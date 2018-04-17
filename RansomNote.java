package Leetcode;

public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RansomNote r = new RansomNote();
		System.out.println(r.canConstruct("a", "b"));
	}
	public boolean canConstruct(String ransomNote, String magazine) {
	       int[] mag = new int[128];
	        for(int i=0;i<magazine.length();i++){
	            mag[magazine.charAt(i)]++;
	        }
	        for(int i=0;i<ransomNote.length();i++){
	        	int c =(int)ransomNote.charAt(i);
	            mag[c]--;
	            if(mag[c]<0){
	                return false;
	            }
	        }
	        return true;
	    }

}
