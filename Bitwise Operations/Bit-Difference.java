import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends


//User function Template for Java

class CountBitFlip{
    
    // Function to count number of bits to 
    // be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
        int c= a^b;
        int r=0;
        while(c!=0)
        {
            c= c&(c-1);
            r++;
        }
        return r;
    }
    
    
}


// { Driver Code Starts.

// Driver class
class BitWise {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    m = sc.nextInt();
		    n = sc.nextInt();
		    CountBitFlip obj = new CountBitFlip();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}
