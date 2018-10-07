//import java.io.*;
class HalfMountain
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
		
			System.out.println();
		}
	}
}