import java.util.Scanner;

class Parity{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int N = in.nextInt();
		    
		    if(N % 2 == 0){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		// End of Solution
		
	}
}
