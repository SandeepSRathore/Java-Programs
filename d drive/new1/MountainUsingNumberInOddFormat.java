import java.io.*;
class Test5
{
	public static void main(String args[])
	{
		int i,j;
		Console con=System.console();
		int n=Integer.parseInt(con.readLine());
		for(i=1;i<=n;i++)
		{
			
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print(i);
			}
		
			System.out.println();
		}
	}
}