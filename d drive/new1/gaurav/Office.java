import a.Employee;
import a.b.ContactInfo;
import a.b.c.Person;
class Office
{
public static void main(String args[])
{
Employee e1= new Employee();
System.out.println("First details are");
e1.show();
Employee e2 = new Employee(25,90,"john","smith");
System.out.println("Second details are");
e2.show();
Employee e3 = new Employee(e2);
System.out.println("Third details are");
e3.show();
}
}