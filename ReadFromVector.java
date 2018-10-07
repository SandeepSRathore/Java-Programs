import java.io.*;
import java.util.*;
class ReadFromVector extends Thread
{
	private Resource rsrc;
	File arr[];
	public ReadFromVector(Resource r,File f[]) throws IOException
	{
		rsrc=r;
		arr=f;
	}
	public void run()
	{
		int i,j=0;
		char ch;
		String string=null;
		for(i=0;i<arr.length;i++)
		{
			try
			{
				string=rsrc.getVector();	
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
			try
			{
				File file=new File("C:/Users/HP/Documents/java programs/Threading/Reloaded Files");
				file.mkdirs();
				FileOutputStream fos=new FileOutputStream("C:/Users/HP/Documents/java programs/Threading/Reloaded Files/"+arr[i].getName());
				j=0;
				while(j<string.length())
				{
					ch=string.charAt(j);
					fos.write((int)ch);
					j++;
				}
				fos.close();
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
}