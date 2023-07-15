import java.util.Scanner;

class Burgers{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		    Scanner in = new Scanner(System.in);
		    
		    int T = in.nextInt();
		    
		    for(int ctr = 0; ctr < T; ctr++){
		        int X = in.nextInt();
		        int Y = in.nextInt();
		        
		        int total = Math.min(X, Y);
		        
		        System.out.println(total);
		    }
		// End of Solution
		
	}
}