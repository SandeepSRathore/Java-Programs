import java.io.*;
class Ascii
{
	public static void main(String args[])
	{
		Console con=System.console();
		char ch;
		System.out.println("Enter the ascii value");
		ch=(con.readLine()).charAt(0);
		System.out.println("Corresponding Character is "+(int)ch);
	}
}