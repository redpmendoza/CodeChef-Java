import java.util.Scanner;

class WaitingTime{
	public static void main (String[] args) throws java.lang.Exception{
	    
	    // Start of Solution
	    Scanner in = new Scanner(System.in);
	    
	    int T = in.nextInt();
	    
	    for(int ctr = 0; ctr < T; ctr++){
	        int K = in.nextInt();
	        int X = in.nextInt();
	        
	        System.out.println((K*7)-X);
	    }
	    // End of Solution
	    
	}
}
