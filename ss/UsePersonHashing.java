import java.util.*;
class PersonHashing
{
	private String name;
	private String surname;
	public PersonHashing(String nm,String snm)
	{
	name=nm;
	surname=snm;
	}
	public int hashCode()
	{
	String str=name+surname;
	return str.hashCode();
	}
	public boolean equals(Object o)
	{
	if(o==null)
	return false;
	PersonHashing p=(PersonHashing)o;
	if(name.equals(p.name)&&surname.equals(p.surname))
	return true;
	else
	return false;
	}
}
class UsePersonHashing
{
	public static void main(String args[])
	{
	HashMap map=new HashMap();
	PersonHashing p1=new PersonHashing("raj","sharma");
	map.put(p1,"22222");
	PersonHashing p2=new PersonHashing("raj","sharma");
	map.put(p2,"55555");
	System.out.print(map.size());
	}
}