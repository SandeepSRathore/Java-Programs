import java.io.*;
class Merger
{
	public static void main(String args[])throws IOException
	{
		String nameS, nameD;
		Console con= System.console();
		System.out.println("enter the file to be retrive");
		nameS=con.readLine();
		System.out.print("enter destination file name");
		nameD=con.readLine();
		FileOutputStream fos=new FileOutputStream(nameD, true);
		File f1= new File(nameS);
		int i;
		for(i=0; ;i++)
		{
			File f= new File(f1.getParent()+"\\"+(i+1)+f1.getName());
			if(!f.exists())
			{
				System.out.print("file merging finish");
				fos.close();
				System.exit(0);
			}
			FileInputStream fis= new FileInputStream(f);
			int ch;
			while((ch=fis.read())!=-1)
			{
				fos.write(ch);
			}
			fis.close();
		}
	}
}
				
		