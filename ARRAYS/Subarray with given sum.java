import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();//taking input size of array
	    int [] a = new int[n];//array declaration
	    for(int i=0;i<n;i++)
	    {
	        a[i]= sc.nextInt();  //input array elements
	    }
	    int s= sc.nextInt();// input sum to match in array
	    int lo=0;
	    int hi=0;
	    int sum =0;
	    while(lo<n && hi<n)
	    {
	        if(sum == s)
	        {   System.out.print(lo+1); // print start index
	            System.out.print(hi);   // print end index
	            break;
	        }
	        else if(sum<s)
	        {
	            sum = sum + a[hi];
	            ++hi;
	        }
	        else if(sum >s)
	        {
	            sum = sum - a[lo];
	            ++lo;
	        }
	        else{
	            System.out.print("-1");//set our answer to -1 if we do not find our sum
	        }
	    }
	    
	
	}
}
