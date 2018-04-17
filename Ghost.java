import java.util.*;

public class Ghost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ghost g=new Ghost();
		Scanner s = new Scanner(System.in);
		int days=s.nextInt();
		int ghosts=s.nextInt();
		int arr[]=new int[days];
		while(days>0){
			int day=s.nextInt()-1;
			arr[day]+=1;
			g.printRes(arr);
			days--;
		}

	}

	private void printRes(int[] arr) {
		// TODO Auto-generated method stub
		/*int[] copy = arr.clone();
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);*/
		List<Integer> possWinners=new ArrayList<>();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==max){
				possWinners.add(i);
			}
		}
		Collections.sort(possWinners);
		int consWinner= possWinners.get(possWinners.size()-1);
		System.out.print(consWinner+1 + " ");
		System.out.println(arr[consWinner]);
		
	}
	

}
