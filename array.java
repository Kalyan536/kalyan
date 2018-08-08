import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		int k;
		int i;
		int sum=0;
		Scanner s = new Scanner (System.in);
		n=s.nextInt();
		k=s.nextInt();
		int a[]= new int[10];
		for (i=1; i<=n;i++)
		{
			a[i] = s.nextInt();
		}
		for (i=1;i<=k;i++)
		{
			sum = sum + a[i];
		}
		System.out.println(sum);
		
		
		
		
		
	}
}
