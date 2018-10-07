import java.io.*;
class vertical
{
	public static void main(String args[])
	{
		int i,j,max=0;
		int arr[]=new int[11];
		Console con=System.console();
		System.out.println("Enter array elements:");
		for(i=0;i<=10;i++)
		{
			arr[i]=Integer.parseInt(con.readLine());
			if(arr[i]>max)
			{
			 	max=arr[i];
			}
		}
		while(max!=0)
		{
			for(j=0;j<arr.length;j++)
			{
				if(arr[j]<max)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println("");
			max--;
		}
	}
}