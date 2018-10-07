import java.io.*;
class VerticalHistogram
{
	public static void main(String args[])
	{
		Console con=System.console();
		int arr[]=new int[4];
		int i,j,max=0;
		con.printf("Enter 4 values in the array\n");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(con.readLine());
		}
		System.out.println("Array is");
		for(i=0;i<arr.length;i++)
		{
			con.printf("%d ",arr[i]);
		}
		
		for(i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];	
			}
		}
	con.printf("\n");
		for(i=max;i>0;i--)
		{
			for(j=0;j<arr.length;j++)
			{
				if(i>arr[j])
				{
					con.printf("  ");
				}
				else
				{
					con.printf(" *");
				}
			}
			con.printf("\n");
		}
	}
}