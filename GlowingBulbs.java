package Algorithms.java;

import java.util.*;

public class GlowingBulbs 
{
	public static void main(String args[])
	{
	    Scanner s = new Scanner(System.in);
	    short T = s.nextShort();
	    long[] L = new long[T];
	    for(int i=0;i<T;i++)
	    {
	        String s1 = s.nextLine();
	        String sw = s.nextLine();// Reading input from STDIN
	        long k = s.nextLong();
	        ArrayList<Integer> ons = new ArrayList<Integer>();
	        for(int b = 0; b < 40; b++)
	        {
	            if(sw.charAt(b) == '1')   ons.add(b+1);
	        }
	        long n=1;
	        L[i]=1;
	        while(n<=k)
	        {
	            for(int p=0;p<ons.size();p++)
	            {
	                if(L[i]%ons.get(p)==0)
	                {
	                    n++;
	                    break;
	                }
	                else continue;
	            }
	            L[i]+=1;
	        }
	    }
        for(int i=0;i<T;i++)
	    {
	        System.out.println(L[i]-1);    // Writing output to STDOUT
	    }
	}

}