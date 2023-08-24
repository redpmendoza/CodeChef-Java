import java.util.Scanner;

class TastyDecisions{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int X = in.nextInt();
		    int Y = in.nextInt();
		    
		    int choco = 2 * X;
		    int candy = 5 * Y;
		    
		    if(choco > candy){
		        System.out.println("CHOCOLATE");
		    }
		    else if(choco < candy){
		        System.out.println("CANDY");
		    }
		    else{
		        System.out.println("EITHER");
		    }
		}
		// End of Solution
		
	}
}
