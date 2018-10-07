import java.io.*;
class Book implements Item
{
	String title,auther,publication;
	public void read()
	{
	Console con=System.console();
	System.out.println("Enter the title of book");
	title=con.readLine();
	System.out.println("Enter the auther name");
	auther=con.readLine();
	System.out.println("Enter the Publication");
	publication=con.readLine();
	}
	public void show()
	{
		System.out.println("List of issue item book:"+title+" "+"Auther:"+auther+" "+"publication:"+" "+publication);
	}
	

}