import java.util.Scanner;

class AudibleRange{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int X = in.nextInt();
		    
		    if(X >= 67 && X <= 45000){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		// End of Solution
		
	}
}