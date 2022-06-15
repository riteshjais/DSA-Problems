import java.util.*;
import java.io.*;
import java.lang.*;

class Driverclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();//taking total testcases
        
        while(t-- > 0)
        {
            int n = sc.nextInt();//taking number n
            
            //calling digitalRoot() function of 
            //class Digital
            System.out.println(new Solution().digitalRoot(n));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the function
    public static int digitalRoot(int n)
    {
        // add your code here
        int sum=sumOfDigits(n);
        if(sum<10)
            return sum;
        return digitalRoot(sum);
    }
    static int sumOfDigits(int n)
    {
        if(n==0)
            return 0;
        return n%10+sumOfDigits(n/10);
    }
}
