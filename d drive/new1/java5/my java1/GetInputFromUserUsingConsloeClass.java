import java.io.*;
class create
{
public static void main(String arg[])
{
	int a;
	String s;
	float f;
	Console con=System.console();
	System.out.println("Enter the String: ");
	s=con.readLine();
	System.out.println("String is:"+s);
	System.out.println("Enter the Int: ");
	a=Integer.parseInt(con.readLine());
	System.out.println("Integer is:"+a);
	System.out.println("Enter the float: ");
	f=Float.parseFloat(con.readLine());
	System.out.println("Float is:"+f);

}
}
