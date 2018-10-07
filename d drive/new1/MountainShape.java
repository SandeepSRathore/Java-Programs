//import java.io.*;
class MountainShape
{
	public static void main(String args[])
	{
		java.io.Console con=System.console();
		int n=Integer.parseInt(con.readLine());
		for(int i=1;i<=n;i++)
		{
			for(int j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}