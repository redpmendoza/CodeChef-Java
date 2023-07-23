import java.util.Scanner;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int N = in.nextInt();
		    int M = in.nextInt();
		    
		    int diff = N-M;
		    
		    if(diff < 0){
		       System.out.println(0); 
		    }
		    else{
		        System.out.println(diff);
		    }
		}
		// End of Solution
		
	}
}
