import java.io.*;
class circularshift
{
	public static void main(String args[])
	{
		int i,j,n,k,temp;
		Console con = System.console();
		System.out.print("enter the no of element:");
		n=Integer.parseInt(con.readLine());
		int arr[] = new int[n];
		for(i=0;i<arr.length;i++)
			arr[i]=Integer.parseInt(con.readLine());

			System.out.println("enter the position");
		k=Integer.parseInt(con.readLine());
		for(j=0;j<k;j++)
		{
		temp=arr[0];
		
		for(i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
			//arr[arr.length-1]=temp;
		}
		arr[arr.length-1]=temp;
		}
	for(i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
		
	}
}
	
}
