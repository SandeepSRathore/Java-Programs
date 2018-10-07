package a.b;
import a.b.c.Person;
public class ContactInfo extends Person
{
private int phone;
public ContactInfo()
{
phone=0;
}
public ContactInfo(int phn,String nm,String sm)
{
super(nm,sm);
phone=phn;
}
public ContactInfo(ContactInfo c)
{
super(c);
phone=c.phone;
}
public void show()
{
super.show();
System.out.println("phone no="+phone);
}
}