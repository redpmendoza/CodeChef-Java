import java.util.Scanner;

class Bidding{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int A = in.nextInt();
		    int B = in.nextInt();
		    int C = in.nextInt();
		    
		    if(A > B && A > C){
		        System.out.println("ALICE");
		    }
		    else if(B > A && B > C){
		        System.out.println("BOB");
		    }
		    else{
		        System.out.println("CHARLIE");
		    }
		}
		// End of Solution
		
	}
}
