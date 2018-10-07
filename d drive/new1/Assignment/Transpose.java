
import java.io.*;
class Transpose
{
	public static void main(String[] args)
	{
		int i,j;
		Console con=System.console();
		int arr[][]=new int[3][3];
		int tArr[][]=new int[3][3];
		System.out.println("Enter elements for a 3*3 matrix");
		for( i=0;i<arr.length;i++)
		{
			for( j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(con.readLine());
			}
		}
		System.out.println("Matrix formed is");	
		for( i=0;i<arr.length;i++)
		{
			for( j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println("");
		}	
		System.out.println("Matrix formed after transpose operation is");	
		for( i=0;i<arr.length;i++)
		{
			for( j=0;j<arr[i].length;j++)
			{
				
				tArr[i][j]=arr[j][i];
			}
			
		}	
		for( i=0;i<arr.length;i++)
		{
			for( j=0;j<arr[i].length;j++)
			{
				System.out.print(tArr[i][j]+" ");
				
			}
			System.out.println("");
		}
	}
}