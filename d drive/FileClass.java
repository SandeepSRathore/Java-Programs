import java.io.*;
class FileClass 
{
	public static void main(String[] args)throws IOException
	{
		//String result;
		File f1=new File("D:/temp/A.txt");
		File f2=new File("D:/temp/B.txt");
		f1.renameTo(f2);
		
		
	}
}
