import java.io.*;
class Library
{
	public static void main(String args[])
	{
		Console con=System.console();
		String ch;
		Item arr[]=new Item[3];
		try{
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter 'B' to select Book or Enter 'D' to select Dvd");
			ch=con.readLine();
			if(ch.equalsIgnoreCase("B"))
			{
				arr[i]=new Book();
				arr[i].read();
			}
			else
			{
				arr[i]=new Dvd();
				arr[i].read();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			arr[i].show();
		}
		}
		catch(Exception e){}
	}
}