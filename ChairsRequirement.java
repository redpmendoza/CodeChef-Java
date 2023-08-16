import java.util.Scanner;

class ChairsRequirement{
	public static void main (String[] args) throws java.lang.Exception{
	
	    // Start of Solution
	    Scanner in = new Scanner(System.in);
	    
	    int T = in.nextInt();
	    
	    for(int ctr = 0; ctr < T; ctr++){
	        int X = in.nextInt();
	        int Y = in.nextInt();
	        
	        if(X > Y){
	            System.out.println(X-Y);
	        }
	        else{
	            System.out.println("0");
	        }
	    }
	    // End of Solution
	
	}
}
