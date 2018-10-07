import java.io.*;
class Matrix
{
	private int arr[][];
	public Matrix()
	{
		arr=new int[3][3];
		Console con=System.console();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=Integer.parseInt(con.readLine());
		
	}
	public Matrix(int a,int b)
	{
		arr=new int[a][b];
		Console con=System.console();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=Integer.parseInt(con.readLine());
		
	}
	public Matrix(Matrix m)
	{
		int x=0;
		arr=new int[m.arr.length][m.arr[x].length];
		Console con=System.console();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=m.arr[i][j];
		
		
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
class UseMatrixForContrucorClass
{
	public static void main(String args[])
	{
		System.out.println("3*3");
		Matrix m1=new Matrix();
		m1.show();
		System.out.println("5*4");
		Matrix m2=new Matrix(5,4);
		m2.show();
		System.out.println("copy of m2");
		Matrix m3=new Matrix(m2);
		m3.show();
		
		
	}
}