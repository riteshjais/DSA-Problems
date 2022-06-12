import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;

class Main{
    
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		
		//input number of testcases
		int t=sc.nextInt();
		int m,n;
		while(t-->0) {
		    
		    
            Solution obj = new Solution();
            //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    System.out.println(obj.posOfRightMostDiffBit(m, n));
		}
	}
}





//User function Template for Java

class Solution
{
    public static int getrightbit(int n){
        if(n==0){
            return 0;
        }
        return (int)(Math.log(n&-n)/Math.log(2))+1;
    }
    //Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n)
    {
        if(n==m){
            return -1;
        }  
        return getrightbit(m^n);        
            
    }
}
