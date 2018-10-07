import java.io.*;
class FileSize
{
	public static void main(String args[]) throws IOException
	{
		File f=new File("C:/Users/HP/Documents/java programs/Files/Tushar.txt");
		System.out.println("Size is "+f.length());
	}
}