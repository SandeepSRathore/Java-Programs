import java.io.*;
class CopyFile
{
	public static void main(String args[]) throws IOException
	{
		File f1=new File("F:/java files/file1.txt");
		File f2=new File("F:/java files/file2.txt");
		f1.createNewFile();
		f2.createNewFile();
		FileOutputStream fos1=new FileOutputStream(f1);
		FileOutputStream fos2=new FileOutputStream(f2);
		String s1,s2;
		Console con=System.console();
		System.out.println("Enter the data for first file");
		s1=con.readLine();
		fos1.write(s1);
		System.out.println("Enter the data for second file");
		s2=con.readLine();
		fos2.write(s2);
		File f3=new File("F:/java files/file3.txt");
		f3.createNewFile();
		FileInputStream fis1=new FileInputStream(f1);
		FileOutputStream fos3=new FileOutputStream(f3);
		int ch;
		while((ch=fis1.read())!=-1)
			fos3.write(ch);
		FileInputStream fis2=new FileInputStream(f2);
		FileOutputStream fos3=new FileOutputStream(f3,true);
		while((ch=fis2.read())!=-1)
			fos3.write(ch);
		fos1.close();
		fos2.close();
		fos3.close();
	}
}