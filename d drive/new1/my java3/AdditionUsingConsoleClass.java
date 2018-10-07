import java.io.*;
class create
{
public static void main(String arg[])
{
	int a,b,c,d;
	Console con=System.console();
	System.out.println("Enter the value: ");
	a=Integer.parseInt(con.readLine());
	
	
	b=Integer.parseInt(con.readLine());
	
	c=Integer.parseInt(con.readLine());
	d=a+b+c;
	System.out.println("Sum is:"+d);

}
}
