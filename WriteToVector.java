import java.io.*;
import java.util.*;
class WriteToVector extends Thread
{
	private Resource rsrc;
	private File arr[];
	public WriteToVector(Resource r,File f[]) throws IOException
	{
		rsrc=r;
		arr=f;
	}
	public void run()
	{
		int i;
		for(i=0;i<arr.length;i++)
		{
			try
			{
				rsrc.setVector(arr[i]);
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}	
	}
}