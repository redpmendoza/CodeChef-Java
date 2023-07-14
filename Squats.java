import java.util.Scanner;

class Squats{
	public static void main (String[] args) throws java.lang.Exception{
		
        // Start of Solution
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for(int ctr = 0; ctr < T; ctr++){
            int X = in.nextInt();
            
            System.out.println(X * 15);
        }
        // End of Solution

	}
}
