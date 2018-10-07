import java.io.*;
class FileMerge
{
	public static void main(String args[])throws IOException
	{
		Console con=System.console();
		System.out.print("Enter destination file name with path:-");
		String str=con.readLine();
		File f=new File(str);
		if(f.exists())
			f.delete();
		File t=new File(f.getParent()+"//"+'0'+f.getName());
		if(!t.exists())
		{
			con.printf("Source file does not exist");
			System.exit(0);
		}
		FileOutputStream fos=new FileOutputStream(str);
		int i=0;
                                   File f1=new File(f.getParent()+"//"+i+f.getName());
		while(f1.exists())
		{               
			FileInputStream fis=new FileInputStream(f1);
			int ch;
			while((ch=fis.read())!=-1)
				fos.write(ch);
			fis.close();
			f1.delete();
			i++;
                                                     f1=new File(f.getParent()+"//"+i+f.getName());
		}
		fos.close();
	}
}