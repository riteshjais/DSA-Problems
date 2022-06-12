import java.io.*;
import java.util.*;


 // } Driver Code Ends


//User function Template for Java

class Swap{
    
    // Function to swap odd and even bits
    public static int swapBits(int n) {
	    
	    // Your code
	    int e= n&0xAAAAAAAA;
	    int o= n&0x55555555;
	    e>>=1;
	    o<<=1;
	    return (e|o);
	    
	    
	}
    
}

// { Driver Code Starts.

class BitWise{

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    
		    Swap obj = new Swap();
		    
		    System.out.println(obj.swapBits(n));
		}
	}
}
