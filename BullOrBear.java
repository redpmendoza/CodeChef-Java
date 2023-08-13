import java.util.Scanner;

class BullOrBear{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int X = in.nextInt();
		    int Y = in.nextInt();
		    
		    if(X == Y){
		        System.out.println("NEUTRAL");
		    }
		    else if(X > Y){
		        System.out.println("LOSS");
		    }
		    else{
		        System.out.println("PROFIT");
		    }
		}
		// End of Solution
		
	}
}
