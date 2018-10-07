package a.b.c;
public class Person
{
private String name;
private String surname;
public Person()
{
name="unknown";
surname="unknown";
}
public Person(String nm, String sm)
{
name=nm;
surname=sm;
}
public Person(Person p)
{
name=p.name;
surname=p.surname;
}
public void show()
{
System.out.println("name="+name+"surname="+surname);
}
}
