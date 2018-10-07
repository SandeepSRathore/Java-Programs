import java.io.*;
class ReadFile
{
	public static void main(String[] args)throws IOException 
	{
	FileInputStream fis1=new FileInputStream("A.txt");
	//FileInputStream fis2=new FileInputStream("B.txt");
	BufferedInputStream bis1=new BufferedInputStream(fis1);
	//BufferedInputStream bis2=new BufferedInputStream(fis2);
	FileOutputStream fos=new FileOutputStream(fis1);
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	int ch;
	while((ch=bis1.read())!=-1)
		ch.lowerCase();
		//System.out.print((char)ch);
	bos.write(ch);
	//bos2.write(ch);
	bis1.close();
//	bis2.close();
	bos.close();

	}
}
