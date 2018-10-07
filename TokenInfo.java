import java.io.*;
import java.util.*;
class TokenInfo
{
	public static void main(String args[]) throws IOException
	{
		Console con=System.console();
		String fname;
		System.out.println("Enter the file name");
		fname=con.readLine();
		File f=new File(fname);
		FileInputStream fis=new FileInputStream(f);
		HashMap map=new HashMap();
		StreamTokenizer st=new StreamTokenizer(fis);
		while(st.nextToken()!=StreamTokenizer.TT_EOF)
		{
			String s;
			switch(st.ttype)
			{
				case StreamTokenizer.TT_NUMBER :
					s=st.nval+"";
					break;
				case StreamTokenizer.TT_WORD :
					s=st.sval;
					break;
				default :
					continue;
			}
			if(!(map.containsKey(s)))
			{
				Token t=new Token(s);
				map.put(s,t);
			}
			else
			{
				Token temp;
				temp=(Token)map.get(s);
				temp.incrementCount();
				map.put(s,temp);
			}			
		}
		System.out.println("TOKEN\tFREQUENCY");
		System.out.println();
		Set s=map.keySet();
		Iterator iter=s.iterator();
		while(iter.hasNext())
		{
			String key=(String)iter.next();
			Token temp=(Token)map.get(key);
			System.out.println(temp.showToken()+"\t"+temp.showCount());
		}
	}
}