import java.util.Scanner;

public class Stairs {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int up = s.nextInt();
		int down = s.nextInt();
		int stairs=s.nextInt();

		int disp = up-down;

		int days = (int)Math.ceil((double)(stairs-down)/(double)disp);
		System.out.println(days);
	}
}
