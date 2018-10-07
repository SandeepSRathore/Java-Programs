import java.io.*;
class PatternOfString
{
public static void main(String arg[])
{
	String n;
	Console con=System.console();
	System.out.print("Enter the String:");
	n=con.readLine();
	int length=n.length();
	for(int i=0;i<length;i++)
	{
		n=n.substring(1,length)+n.charAt(0);
		
		
		
	
	
		System.out.println(n);
	}
}
}
