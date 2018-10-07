import java.io.*;
class Test2
{
	public static void main(String args[])
	{
		int n;
		Console con=System.console();
		n=Integer.parseInt(con.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=4;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}	
			for(int j=i-1;j<=1;j++)
			{
				System.out.print(j);
			}
		System.out.println();
		}
		
		
	}
}