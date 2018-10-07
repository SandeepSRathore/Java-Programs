package a.b;

import a.b.c.Person;

public class Contactinfo extends Person
{
 public int phone;
 public Contactinfo()
 {
  phone=00000;
 }
 public Contactinfo(String str1,String str2,int ci)
 {
 super(str1,str2);
 phone=ci;
  }
 public Contactinfo(Contactinfo c )
    {
	super(c);
	phone=c.phone;
	}
}