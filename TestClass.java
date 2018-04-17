import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        TestClass t = new TestClass();
        Scanner s= new Scanner(System.in);
        int length = s.nextInt();
        List<String> input = new ArrayList<>();
        //String[] input=new String[length];
        for(int i=0;i<length;i++){
            input.add(s.next());
        }
        check(input);

    }
    public static void check(List<String> input){
        for(String s:input){
            StringBuffer temp = new StringBuffer(s);
            if(input.contains(temp.reverse().toString())){
            	int len = temp.length();
                System.out.print(len + " ");
                System.out.println(temp.charAt(len/2));
                break;
            }
        }
    }
}