import java.io.*;
class Matrix
{
	private int arr[][];
	Console con=System.console();
	public Matrix()
	{
		arr=new int[3][3] ;
		
	}
	public Matrix(int m,int n)
	{
		arr=new int[m][n] ;
		
	}
	public Matrix(Matrix m)
	{
		int i=0;
		arr=arr[m.arr.length][m.arr[i].length];
	}
	public void show()
	{
		for(int i=0; i<arr.length; i++)
		{	for(int j=0;j<arr[i].length; j++)
			{	
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}