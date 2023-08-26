import java.util.Scanner;

class RainInChefland{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int X = in.nextInt();
		    
		    if(X < 3){
		        System.out.println("LIGHT");
		    }
		    else if(X >= 3 && X < 7){
		        System.out.println("MODERATE");
		    }
		    else{
		        System.out.println("HEAVY");
		    }
		}
		// End of Solution
		
	}
}
