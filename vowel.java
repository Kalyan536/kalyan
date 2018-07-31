import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  char x;
	  Scanner s = new Scanner(System.in);
	  x=s.next().charAt(0);
	  if(x>='a'&&x<='z'||x>='A'&&x<='Z')
	      {
	        if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x==
	        'I'||x=='U')
	        {
	        System.out.println("Vowel");
	        }
	        else
	        {
	            System.out.println("Consonant");
	        }   
	      }
	      else
	      System.out.println("invalid");
	}
}
