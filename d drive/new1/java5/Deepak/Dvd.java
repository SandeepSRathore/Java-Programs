import java.io.*;
class Dvd implements Item
{
	String title,director,category;
	Console con=System.console();
	public void read()
	{
	System.out.println("enter the title of movie");
	title=con.readLine();
	System.out.println("enter the director of movie");
	director=con.readLine();
	System.out.println("enter the category of movie");
	category=con.readLine();
	}
	public  void show()
	{
	System.out.println("title:"+title+"\t"+"\t"+"director:"+director+"\t"+"\t"+"category:"+category);
	}                                       
}