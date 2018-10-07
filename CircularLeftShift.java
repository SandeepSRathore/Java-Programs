import java.io.*;
class CircularLeftShift
{
	public static void main(String args[])
	{
		Console con=System.console();
		int arr[]=new int[10];
		int i,j,n,temp;
		con.printf("Enter 10 values in the array\n");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=Integer.parseInt(con.readLine());
		}
		System.out.println("Array is");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		con.printf("\nEnter the no of positions for circular shift\n");
		n=Integer.parseInt(con.readLine());
		for(i=1;i<=n;i++)
		{
			temp=arr[0];
			for(j=0;j<arr.length-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.println("Array after circular shift is");
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}