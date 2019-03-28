package Algorithms.java;

import java.util.*;

public class RodCutting 
{
	public static void main(String args[])
	{
		//Scanner
	    Scanner s = new Scanner(System.in);
	    int T = s.nextInt();                 // Reading input from STDIN
	    int[] S = new int[T];
	    int k1 = Integer.MAX_VALUE;
	    for(int i=0;i<T;i++)
	    {
	    	int k = s.nextInt();
	        S[i]=0;
	        int h=3;
	        if(k1<k) 
	        {
	        	if(k1%2==0) h=k1+1;
	            else h=k1+2;
	            S[i]=S[i-1];
	        }
	        for(int j=h;j<=k;j+=2)
	        {
	        	int m=j;
	            while(m>1)
	            {
	                if(m%2==0) break;
	                m=m/2;
	            }
	            if(m==1) S[i]+=1;
	        }
	        k1=k;
	    }
	    for(int i=0;i<T;i++)
	    {
	    	System.out.println(S[i]); // Writing output to STDOUT
	   	}
	        
	}
}