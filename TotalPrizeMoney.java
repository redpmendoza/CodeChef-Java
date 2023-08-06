import java.util.Scanner;

class TotalPrizeMoney{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int X = in.nextInt();
		    int Y = in.nextInt();
		    
		    System.out.println((X * 10) + (Y * 90));
		}
		// End of Solution
		
	}
}
