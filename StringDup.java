import java.util.*;

public class StringDup {

	 public static void main(String args[] ) throws Exception {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	        Scanner s=new Scanner(System.in);
	        String str = s.next();
	        Set<Character> res = calc(str);
	        List<Integer> index = new ArrayList<>();
	        //int[] index = new int[str.length()];
	        int i=0;
	        for(char c:res){
	            index.add(str.indexOf(String.valueOf(c)));
	        }
	        Collections.sort(index);
	        
	        System.out.println(str.charAt(index.get(0)));
	    }
	    private static Set<Character> calc(String s){
	        int letter[] = new int[58];
	        Set<Character> set = new HashSet<>();
	        for(char c:s.toCharArray()){
	            int index=c-'A';
	            if(letter[index]>0){
	                set.add(c);
	            }
	            letter[index]++;
	        }
	        return set;
	    }

}
