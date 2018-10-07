import java.io.*;
class MountainUpto9
{
	public static void main(String args[])
	{
		int i,j,num=0;
		Console con=System.console();
		int n=Integer.parseInt(con.readLine());
		for(i=0;i<=n;i++)
		{
			
			for(j=0;j<=i;j++)
			{
				System.out.print(num);
				//num++;
			
			
				if(num==9)
				{
					num=0;
				}
				else
				{
					num++;
				}
			}
		
			System.out.println();
		
		}
	}
}