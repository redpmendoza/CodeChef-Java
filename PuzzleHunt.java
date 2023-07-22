import java.util.Scanner;

class PuzzleHunt{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		if(N >= 6 && N <= 8){
		    System.out.println("YES");
		}
		else{
		    System.out.println("NO");
		}
		// End of Solution
		
	}
}