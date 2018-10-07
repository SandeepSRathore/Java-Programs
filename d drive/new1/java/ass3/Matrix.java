import java.io.*;
class Matrix
{
	private int arr[][];

	public Matrix()
	{
		arr=new int [3][3];
	}
	
	public Matrix(int x,int y)
	{
		arr=new int [x][y];
	}
		
	public Matrix (Matrix m)
	{
		arr=new int[m.arr.length][m.arr[0].length];
	}


	public void read ()
	{
	int i,j;
	Console con=System.console();
	System.out.println(arr.length+","+arr[0].length);
	for(i=0;i<arr.length;i++)
	    for(j=0;j<arr[i].length;j++)
		arr[i][j]=Integer.parseInt(con.readLine());
	}

	public void show()
	{
	int i,j;
	for(i=0;i<arr.length;i++)
	{	
	  for(j=0;j<arr[i].length;j++)

	System.out.print(arr[i][j]+" ");
	System.out.println();

	}
}}



