import java.io.*;
class Dvd implements Item
{
	String title,directory,category;
	public void read()
	{

	Console con=System.console();
	System.out.println("Enter the title of movie");
	title=con.readLine();
	System.out.println("Enter the directory name");
	directory=con.readLine();
	System.out.println("Enter the category");
	category=con.readLine();
	}
	public void show()
	{
		System.out.println("List of issue item DVD:"+title+" "+"Directory:"+directory+" "+"catagory:"+" "+category);
	}

}