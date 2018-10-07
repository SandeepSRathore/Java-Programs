import java.io.*;
class Matrix
{
	private int arr[][];
	public Matrix()
	{
		arr=new int[3][3];
		Console con=System.console();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(con.readLine());

			}
		}
	}
	public Matrix(int a,int b)
	{
		arr=new int[a][b];
		Console con=System.console();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(con.readLine());

			}
		}
		
	}
	public Matrix(Matrix m)
	{
		int x=0;
		arr=new int[m.arr.length][m.arr[x].length];	
	}

	public void show()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");

			}
		System.out.println("");

		}
	}


}