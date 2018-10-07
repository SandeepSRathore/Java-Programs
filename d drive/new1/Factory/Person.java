package a.b.c;

public class Person
{
  public String name;
  public String surname;
  public Person()
   {
   name="Unknown";
    surname="Unknow";
   }
  public Person(String str1,String str2)
   {
    name=str1;
	surname=str2;
   }  
  public Person(Person n)
  {
   name=n.name;
   surname=n.surname;
  }
}