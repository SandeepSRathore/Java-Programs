import java.io.*;
class create
{
public static void main(String arg[])
{
	int n;
	Console con=System.console();
	
	System.out.println("enter the no for table:");
	n=Integer.parseInt(con.readLine());
	
	

		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	
	
	
	
	
	

}
}
