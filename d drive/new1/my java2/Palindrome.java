import java.io.*;
class Palindrome
{
public static void main(String arg[])
{
	
	String n,reverse="";
	Console con=System.console();
	System.out.print("Eneter the String");
	n=con.readLine();
	int length=n.length();
	for(int i=length-1;i>=0;i--)
	{
		reverse=reverse+n.charAt(i);
	}
	if(n.equals(reverse))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("Not Palindrome");
	}
		
	
}
}
