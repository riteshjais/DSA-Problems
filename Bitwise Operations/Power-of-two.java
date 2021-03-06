import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            long n = Long.parseLong(read.readLine());
            
            if(new PowerCheck().isPowerofTwo(n) == true)
              System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class PowerCheck{
    
    // Function to check if given number is power of two
    public static boolean isPowerofTwo(long n){
        
        // Your code here
        if(n==0) return false;
        //return ((n&(n-1))==0);
        long r= (int)(Math.log(n)/Math.log(2));
        return (n==Math.pow(2,r));
        
    }
    
}
