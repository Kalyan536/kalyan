import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n;
		Scanner s= new Scanner(System.in);
		 n=s.nextInt();
		if(n>0)
		{
			if(n%2==0)
			System.out.println("given number "+n+ " is even");
			else
			System.out.println("given number" +n+"  is odd");
		}
		else
		System.out.println("invaild");
	}
}
