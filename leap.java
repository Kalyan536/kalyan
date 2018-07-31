import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int x;
		Scanner s = new Scanner(System.in);
		x=s.nextInt();
		if((x%4==0)&&(x%400==0))
		 System.out.println("yes");
		 else 
		 System.out.println("no");
		 
	}
}
