import java.io.*;
import java.util.*;
class Stored
{
	private String s1;
	private boolean flag=true;
	private Vector v=new Vector();
	synchronized public void setData(Object o)
	{
		while(flag)
		{
		v.add(o);
		flag=false;
		notify();
		}
		try
		{
		wait();
		}
		catch(Exception e)
		{
		Systm.out.print(e.getMessage());
		}	
	synchronized public Object getData()
	{
	while(flag)
	{
	try
	{
	wait();
	}
	catch(Exception e)
	{
	System.out.print(e.getMessage());
	}
	notify();
	flag=true;
	return  v.lastElement();
	}
	}
class Read extends Thread
{
	private Stored s;
	public Read(Stored s)
	{
	this.s=S;
	}
	public void run()
	{
	try
	{
	File f=new File("c:\\Users\\aa");
	File f1[]=f.listFiles();
	for(int i=0;i<f1.length;i++)
	{
	FileInputStream fis=new FileInputStream(f1[]);
	String st="";
	int ch;
	while((ch=fis.read())!=-1)
	st=(char)ch;
	s.setData(st);
	fis.close();
	}
}
catch(Exception ex){}
}
}
class Write extends Thread
{
	private Stored s;
	public write(Stored s)
	}
	this.s=s;
}
public void run()
{
try
{
File f=new File("c:\\Users\\aa");
File f1[]=f.listFiles();
for(int i=0;i<f1.length;i++)
{
FileOutputStream fos=new FileOutputStream("sandy"+i+".txt);
char ch[];
ch=((String)(s.getData())).toCharArray();
for(int i=0;j<ch.length;j++)
fos.write((byte)ch[j]);
}
}
catch(Exception ex){}
}
public class Reading 
{
public static void main(String args[])
{
Stored s=new Stored();
Read r=new Read(s);
Write w=new Write(s);
r.start();
w.start();
}
}
		
		