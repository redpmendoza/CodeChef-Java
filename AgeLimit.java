import java.util.Scanner;

class AgeLimit{
	public static void main (String[] args) throws java.lang.Exception{
	   
        // Start of Solution 
	    Scanner in = new Scanner(System.in);
	    
	    int T = in.nextInt();
	    
	    for(int ctr = 0; ctr < T; ctr++){
	        int X = in.nextInt();
	        int Y = in.nextInt();
	        int A = in.nextInt();
	        
	        if(A >= X && A < Y){
	            System.out.println("YES");
	        }
	        else{
	            System.out.println("NO");
	        }
	        
	    }
	    // End of Solution
	    
	}
}