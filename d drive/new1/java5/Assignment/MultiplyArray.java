import java.io.*;
class Transpose
{
	public static void main(String[] args)
	{
		int i,j;
		Console con=System.console();
		int arr1[][]=new int[3][3];
		int arr2[][]=new int[3][3];
		System.out.println("Enter elements for a 3*3 matrix");
		for( i=0;i<arr1.length;i++)
		{
			for( j=0;j<arr1[i].length;j++)
			{
				arr1[i][j]=Integer.parseInt(con.readLine());
			}
		}
		System.out.println("Enter elements for another 3*3 matrix");
		for( i=0;i<arr2.length;i++)
		{
			for( j=0;j<arr2[i].length;j++)
			{
				arr2[i][j]=Integer.parseInt(con.readLine());
			}
		}
		
	}
}