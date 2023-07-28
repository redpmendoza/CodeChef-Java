import java.util.Scanner;

class MyVeryFirstContest{
	public static void main (String[] args) throws java.lang.Exception{
	
        // Start of Solution
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int A = in.nextInt();
        int B = in.nextInt();
        
        System.out.println((N-A) + " " + ((N-A)-B));
        // End of Solution
        
	}
}
