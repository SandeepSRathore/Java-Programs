import java.io.*;
class Library 
{
	public static void main(String[] args) 
	{
		String s1="B",i;
		String s2="D";
		int m;
		Item arr[]=new Item[10];
		for(m=0;m<2;m++)
		{
		Console con=System.console();
		System.out.print("Book or DVD:");
		i=con.readLine();
		if(i.equalsIgnoreCase(s1))
		{
			System.out.println("you want isue book");
			Item bb=new Book();
			bb.read();
			arr[m]=bb;
		}
		else
		{
			System.out.println("you want isue DVD");
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
