import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


 // } Driver Code Ends


//User function Template for Java

class CountBits{
    
    // Function to count number of set bits
    public static int countSetBits(int n){
    
        // Your code here
        int s=0;
        for(int i=1;i<=n;i++)
        {
         int j=i;   
         int r=0;
         while(j!=0)
         {
             j=(j&(j-1));
             r++;
         }
         s+=r;
        }
        return s;
    }
}

// { Driver Code Starts.

// Driver code
class BitWise {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int x, n;
		while(t-->0) {
	        n = sc.nextInt();

		    CountBits obj = new CountBits();

		    System.out.println(obj.countSetBits(n));
		}
	}
}
