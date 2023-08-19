import java.util.Scanner;

class GetSubscription{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int X = in.nextInt();
		    
		    if(X <= 30){
		        System.out.println("NO");
		    }
		    else{
		        System.out.println("YES");
		    }
		}
		// End of Solution
		
	}
}
