import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

/*class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        if(N<2)
            return 0;
        int l=0;
        int h=(int)N-1;
        long ans=countInversion(arr,l,h);
        return ans;
        
    }
    static long countInversion(long arr[], int l, int h)
    {
        long res=0;
        if(l<h)
        {
            int m=l+(h-l)/2;
            res+=countInversion(arr, l, m);
            res+=countInversion(arr, m+1, h);
            res+=countAndMerge(arr, l, m, h);
        }
        return res;
    }
    static long countAndMerge(long arr[], int l, int m, int h)
    {
        int n1=m-l+1;
        int n2=h-m;
        long left[]=new long[n1];
        long right[]=new long[n2];
        for(int i=0;i<n1;i++)
            left[i]=arr[l+1];
        for(int i=0;i<n2;i++)
            right[i]=arr[m+1+i];
        int i=0, j=0,k=l;
        long res=0;
        while(i<n1&&j<n2)
        {
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
            {
                arr[k++]=right[j++];
                res+=n1-i;
            }
            
        }
        while(i<n1)
        {
            arr[k++]=left[i++];
        }
        while(j<n2)
        {
            arr[k++]=right[j++];
        }
        return res;

    }
    
    
    
    
    
    
    
    
    
}*/
class Solution {
    static long inversionCount(long a[],long N) {
        if(N<2)
          return 0;
        return mergeSort(a,0,(int)N-1);
    }
    static long mergeSort(long a[],int l,int r){
        long count=0;
        if(l<r){
            int m = l + (r-l)/2;
            count += mergeSort(a, l, m);
            count += mergeSort(a,m+1,r);
            count += merge(a,l,m,r);
        }
        return count;
    }
    static long merge(long a[],int l,int m,int r){
        int n1=m-l+1, n2=r-m;
        long[] a1=new long[n1], a2=new long[n2];
        for(int i=0; i< n1; i++)
            a1[i]=a[l+i];
        for(int i=0; i< n2; i++)
            a2[i]=a[m+i+1];
        int i=0, j=0, k=l;
        long count=0;
        while(i<n1 && j<n2){
            if(a1[i]<=a2[j]){
                a[k++]=a1[i++];
            } else {
                a[k++]=a2[j++];
                count+=(m+1)-(l+i); //Extra line
            }
        }
        while(i<n1)
            a[k++] = a1[i++];
        while(j<n2)
            a[k++] = a2[j++];
        return count;
    }
}
