/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  int N;
		int Q;
		Scanner s = new Scanner(System.in);
		N=s.nextInt();
		Q=s.nextInt();
		if(N<=Q)
		{
			for(int i=N+1;i<Q;i++)
			{
				if(i%2!=0)
				System.out.print(i+" ");
			}
		}
	}
}
