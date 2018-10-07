package a.b.c;
public class Person
{
	private String name,surname;
	public Person()
	{
		name="Unknown";
		surname="Unknown";
	}
	public Person(String s1,String s2)
	{
		name=s1;
		surname=s2;
	}
	public Person(Person p)
	{
		name=p.name;
		surname=p.surname;
	}
	public void show()
	{
		System.out.println("NAME :"+name+" "+surname);
	}
}