import java.util.*;
class ListIterator1
{
	public static void main(String args[])
	{
		String str[]={"s","a","n","d","y"};
		Vector v=new Vector();
		for(int i=0;i<str.length;i++)
		{
			v.add(str[i]);
		}
		ListIterator iter=v.listIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
			
		}
		while(iter.hasPrevious())
		{
			System.out.println(iter.previous());
		}
	}
}