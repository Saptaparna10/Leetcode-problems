import java.util.Stack;

public class MatchingPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(find("FXPpxff"));
		
		//A65-90 a97-122

	}
	static int find(String s){
		Stack<Character> st=new Stack<>();
		int last=-1;
		
		char[] inp = s.toCharArray();
		for(int i=0;i<inp.length;i++){
			
			if((int)inp[i]>=65 && (int)inp[i]<=90){
				st.push(inp[i]);
			}
			else{
				if(!(st.isEmpty()) &&((st.peek()-'A')==inp[i]-'a')){
					st.pop();
					last=i;
				}
				else{
					break;
				}
			}
		}
		return last;

	}
}
