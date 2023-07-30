import java.util.Scanner;

public class BestOfTwo {
    public static void main(String args[]) {
        
        // Start of Solution
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for(int ctr = 0; ctr < T; ctr++){
            int X = in.nextInt();
            int Y = in.nextInt();
            
            if(X > Y){
                System.out.println(X);
            }
            else{
                System.out.println(Y);
            }
        }
        // End of Solution
        
    }
}
