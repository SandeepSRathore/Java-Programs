import java.io.*;
class File1
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("F:/java files/FirstFile.txt");
		File f2=new File("F:/java files/FirstDirectory/SecondFile.txt");
		System.out.println(f1.renameTo(f2));				
	}
}
