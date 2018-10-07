import java.io.*;
class Library
{
public static void main(String args[])
{
	Item arr[]=new Item[10];
	int m;
	String s1="B",i;
	String s2="D";
	
	for(m=0;m<2;m++)
	{
	System.out.println("book or dvd <b/d>");
	Console con=System.console();
	i=con.readLine();
	if(i.equalsIgnoreCase(s1))
	{
	System.out.println("you want to issue book");
	Item bb=new Book();
	bb.read();
	arr[m]=bb;
	}
	else
	{
	System.out.println("you want to issue dvd");
	Item dd=new Dvd();
	dd.read();
	arr[m]=dd;
	}
	}
	for(m=0;m<2;m++)
	{
	arr[m].show();
	}
}
}