/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int a;
		int d;
		int n;
		int result;
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
		a=s.nextInt();
		d=s.nextInt();
		result = (n)*(2*a+(n-1)*d);
		result =result/2;
		System.out.println(result);
		
		
		
	}
}
