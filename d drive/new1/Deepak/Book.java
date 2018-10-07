import java.io.*;
//import Item;
class Book implements Item
{
String name,author,publi;
Console con=System.console();
public void read()
{
	System.out.println("Enter the name of book");
	name=con.readLine();
	System.out.println("enter the author of book");
	author=con.readLine();
	System.out.println("Enter the publication of book");
	publi=con.readLine();
}
public void show()
{
	System.out.println("book:"+name+"\t"+"\t"+"author:"+author+"\t"+"\t"+"publication:"+publi);

}
}
