package Leetcode;

public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddStrings a =new AddStrings();
		System.out.println(a.addStrings("9","99"));

	}
	public String addStrings(String num1, String num2) {
        return helper(num1,num2,0);
    }
        
    
    public String helper(String a, String b, int carry){
        StringBuilder sb = new StringBuilder();
        int i=a.length()-1,j=b.length()-1;
        
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum=sum+a.charAt(i)-'0';
                i--;
            } 
            if(j>=0){
                sum=sum+b.charAt(j)-'0';
                j--;
            } 
            carry=sum/10;
            sb.append(sum%10);
        }
        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();
    }

}
