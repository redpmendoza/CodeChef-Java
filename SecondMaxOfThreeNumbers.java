import java.util.Scanner;

class SecondMaxOfThreeNumbers{
	public static void main (String[] args) throws java.lang.Exception{
		
		// Start of Solution
		Scanner in = new Scanner(System.in);
		
		int size = 3;
		int T = in.nextInt();
		
        for(int ctr = 0; ctr < T; ctr++){
            int A = in.nextInt();
            int B = in.nextInt();
            int C = in.nextInt();
            
            int arr[] = {A, B, C};
            
            for(int ctr2 = 0; ctr2 < size-1; ctr2++){
                for(int ctr3 = 0; ctr3 < size-ctr2-1; ctr3++){
                    if(arr[ctr3] > arr[ctr3 + 1]){
                        int temp = arr[ctr3];
                        arr[ctr3] = arr[ctr3+1];
                        arr[ctr3+1] = temp;
                    }
                }
            }
            
            System.out.println(arr[1]);
        }
		// End of Solution
		
	}
}
