import java.util.*;
import java.io.*;
class Resource
{
	private Vector v=new Vector();
	private boolean empty=true;
	synchronized public void setVector(File file) throws IOException
	{
		while(!empty)
		{
			try
			{	
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}	
		String str="";
		int ch;
		FileInputStream fis=new FileInputStream(file);
		StreamTokenizer st=new StreamTokenizer(fis);
		while(st.nextToken()!=StreamTokenizer.TT_EOF)
		{
			String s;
			switch(st.ttype)
			{
				case StreamTokenizer.TT_NUMBER :
					s=" "+st.nval;
					break;
				case StreamTokenizer.TT_WORD :
					s=" "+st.sval;
					break;
				default :
					continue;
			}
			str+=s;
		}
		v.add(str);
		fis.close();
		empty=false;
		notify();
	}
	synchronized public String getVector() throws IOException
	{
		while(empty)
		{
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
		String str=(String)v.get(0);
		v.remove(0);
		empty=true;
		notify();
		return str;
	}
} 