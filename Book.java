import java.io.*;
class Book implements Item
{
	Console con=System.console();
	private String title,author,publication;
	public void read()
	{
		System.out.println("Enter the title of the book");
		title=con.readLine();	
		System.out.println("Enter the author of the book");
		author=con.readLine();
		System.out.println("Enter the publication of the book");
		publication=con.readLine();
	}
	public void show()
	{
		System.out.println("Book : "+title+"  Author : "+author+"  Publication : "+publication);
	}
}