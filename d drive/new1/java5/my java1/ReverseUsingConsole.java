import java.io.*;
class create
{
public static void main(String arg[])
{
	int n,reverse=0;
	Console con=System.console();
		System.out.println("enter the no for reverse:");
		n=Integer.parseInt(con.readLine());
	while(n!=0)
	{
		reverse=reverse*10;
		reverse=reverse+n%10;
		n=n/10;
	}
	System.out.println("reverse is:"+reverse);
	

}
}
