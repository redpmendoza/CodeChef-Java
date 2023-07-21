import java.util.Scanner;

class TaxInChefland{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int X = in.nextInt();
		    
		    if(X > 100){
		        System.out.println(X-10);
		    }
		    else{
		        System.out.println(X);
		    }
		}
		// End of Solution
		
	}
}