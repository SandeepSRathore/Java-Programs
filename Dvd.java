import java.io.*;
class Dvd implements Item
{
	Console con=System.console();	
	private String title,director,category;
	public void read()
	{
		System.out.println("Enter the title of the movie");
		title=con.readLine();
		System.out.println("Enter the director of the movie");
		director=con.readLine();
		System.out.println("Enter the category of the movie");
		category=con.readLine();
	}
	public void show()
	{
		System.out.println("Dvd : "+title+"  Director : "+director+"  Category : "+category);
	}			
}