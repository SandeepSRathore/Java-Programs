import java.io.*;
class FileRename
{
	public static void  main(String args[]) throws IOException
	{
		File f1=new File("F:/java files/FirstDirectory/SecondFile.txt");
		File f2=new File("F:/java files/FirstFile.txt");
		f1.renameTo(f2);
		
	}
}