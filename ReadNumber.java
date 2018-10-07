import java.util.*;
import java.io.*;
class ReadNumber extends Thread
{
	private int n;
	public static int sum;
	private File file;
	public ReadNumber(File f)
	{
		file=f;
	}
	public void run()
	{
		sum=0;
		try
		{
			FileInputStream fis=new FileInputStream(file);
			StreamTokenizer st=new StreamTokenizer(fis);
			while(st.nextToken()!=StreamTokenizer.TT_EOF)
			{
				int num;
				switch(st.ttype)
				{
					case StreamTokenizer.TT_NUMBER :
						num=(int)st.nval;
						break;
					default :
						continue;
				}
				sum+=num;	
			}		
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}