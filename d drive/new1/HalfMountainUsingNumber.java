//import java.io.*;
class HalfMountainUsingNumber
{
	public static void main(String args[])
	{
		java.io.Console con=System.console();
		int n=Integer.parseInt(con.readLine());
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
		
			System.out.println();
		}
	}
}