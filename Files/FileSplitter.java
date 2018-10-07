import java.io.*;
class FileSplitter
{
	public static void main(String agrs[]) throws IOException
	{
		Console con=System.console();
		String fname;
		int size;
		System.out.println("Enter the name of the source file ");
		fname=con.readLine();
		System.out.println("Enter the size of new splitted files");
		size=Integer.parseInt(con.readLine());
		File f=new File(fname);
		int fsize=(int)f.length();
		int n;
		if(fsize%size==0)
			n=fsize/size;
		else
			n=(fsize/size)+1;
		FileInputStream fis=new FileInputStream(f);
		int ch;
		File d=new File("C:/Users/HP/Documents/java programs/Files/Splitted");
		d.mkdir();
		int i;
		for(i=1;i<=n;i++)
		{
			File sf=new File("C:/Users/HP/Documents/java programs/Files/Splitted/"+i+"."+fname);
			sf.createNewFile();
			FileOutputStream fos=new FileOutputStream(sf);
			int j;
			for(j=1;j<=size;j++)
			{
				while((ch=fis.read())!=-1)
				{
					fos.write(ch);
					break;
				}
			}
			fos.close();
		}
		fis.close();
	}
}