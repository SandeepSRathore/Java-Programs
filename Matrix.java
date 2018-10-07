import java.io.*;
class Matrix
{
	Console con=System.console();
	private int arr[][];
	public Matrix()
	{
		arr=new int[3][3];
	}
	public Matrix(int n,int m)
	{
		arr=new int[n][m];
	}
	public Matrix(Matrix m)
	{	
		int i,j;
		i=m.arr.length;
		j=m.arr[0].length;
		arr=new int[i][j];
	}
	public void read()
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(con.readLine());
			}
		}
	}
	public void show()
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
		System.out.println("");
		}
	}
}