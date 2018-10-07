import java.io.*;
class CountWord
{
public static void main(String arg[])
{
	int count=0;
	String n;
	Console con=System.console();
	System.out.println("enter the sentence");
	for(int i=0;i<arg.length;i++)
	{
		n=con.readLine();
		count++;
	}
	System.out.println(count);	
	
}
}
