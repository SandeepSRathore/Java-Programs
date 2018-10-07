import java.io.*;
class Matrix
{
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
		
	}
	public void setValue(int n,int m,int value)
	{
		arr[n][m]=value;
	}
	public void show()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i]+" ");
			}
			System.out.println();
		}
	}

}
class UseMatrixContrutor
{
	public static void main(String args[])
	{
		Matrix m1=new Matrix();
		m1.setValue(1,2,73);
		m1.show();
	
		Matrix m2=new Matrix(3,3);
		System.out.println("the Matrix is:");
		m2.setValue(0,1,66);
		m2.show();
	
	}
}