import java.util.Scanner;

class IPLTickerRush{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int N = in.nextInt();
		    int M = in.nextInt();
		    
		    System.out.println(N-M);
		}
		// End of Solution
		
	}
}