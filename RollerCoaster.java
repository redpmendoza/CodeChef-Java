import java.util.Scanner;

class RollerCoaster{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int X = in.nextInt();
		    int H = in.nextInt();
		    
		    if(X >= H){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		// End of Solution
		
	}
}
