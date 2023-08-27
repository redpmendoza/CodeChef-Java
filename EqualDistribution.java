import java.util.Scanner;

class Codechef{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		for(int ctr = 0; ctr < T; ctr++){
		    int A = in.nextInt();
		    int B = in.nextInt();
		    
		    if(((A+B) % 2) == 0){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
		// End of Solution
		
	}
}
