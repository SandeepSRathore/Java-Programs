import java.util.*;
class MyStack
{
	private Vector v;
	public MyStack()
	{
		v=new Vector();
	}
	public MyStack(int s)
	{
		v=new Vector(s);
	}
	public MyStack(int s,int f)
	{
		v=new Vector(s,f);
	}
	public int size()
	{
		int s;
		s=v.size();
		return s;
	}
	public void push(Object o)
	{
		v.add(0,o);
	}
	public Object pop() throws UnderFlowException
	{
		if(empty()==true)
		{
			UnderFlowException e=new UnderFlowException("Your Stack is Empty.You can't pop item");
			throw e;
		}
		else
		{
			Object obj=v.firstElement();
			v.remove(0);
			return obj;
		}

	}
	public Boolean empty()
	{
		for(Object o:v)
		{
			if(o==null)
				continue;
			else
				return false;
		}
		return true;
	}
	public void show()
	{
		int i;
		for(i=0;i<v.size();i++)
		{
			System.out.println((String)v.get(i));
		}
	}
}