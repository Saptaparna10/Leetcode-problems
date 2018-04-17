import java.util.Scanner;

public class Parcel {

	public static void main(String[] args) {
		Parcel p =new Parcel();
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int players = s.nextInt();
		String song = s.next();
		System.out.println(p.last(players,song));

	}

	private int last(int players, String song) {
		 
		boolean dp[] = new boolean[players];
		for(int i=0; i<dp.length;i++){
			dp[i]=true;
		}
		int idx=0;
		int count=0;
		while(!gotWinner(dp)){
			idx=idx%song.length();
			count=count%dp.length;

			if(song.charAt(idx)=='a' && dp[count]==true){
				dp[count]=true;
				idx++;
			}
			else if(song.charAt(idx)=='b' && dp[count]==true){
				dp[count]=false;
				idx++;
			}
			
			count++;
		}
		int winner = 0;
		for(int i=0; i<dp.length;i++){
			if(dp[i]){
				 winner= i+1;
			}
		}
		return winner;
	}

	private boolean gotWinner(boolean[] dp) {
		int count=0;
		for(boolean b:dp){
			if(b){
				count++;
			}
		}
		return count==1;
	}

}
