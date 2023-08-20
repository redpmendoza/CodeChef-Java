import java.util.Scanner;

class MessiVsRonaldo{
	public static void main (String[] args) throws java.lang.Exception{
	    
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int A = in.nextInt();
		int B = in.nextInt();
		int X = in.nextInt();
		int Y = in.nextInt();
		
		int M = (A * 2) + B;
		int R = (X * 2) + Y;
		
		if(M > R){
		    System.out.println("MESSI");
		}
		else if(M < R){
		    System.out.println("RONALDO");
		}
		else{
		    System.out.println("EQUAL");
		}
		// End of Solution
		
	}
}
