import java.io.*;
class Matrix
{
	private int arr[][];
	public Matrix()
	{
		arr=new int[3][3];
		Console con=System.console();
		for(int i=0;i<arr.length;i++)
			for(int j=1;j<arr[i].length;j++)
				arr[i][j]=Integer.parseInt(con.readLine());
	}
	
	public Matrix add(Matrix m)
	{
		Matrix temp=new Matrix();
		for(int i=0;i<arr.length;i++)
			for(int j=1;j<arr[i].length;j++)
					temp.arr[i][j]=arr[i][j]+m.arr[i][j];
		return temp;
	}
		public Matrix less(Matrix m)
	{
		Matrix temp=new Matrix();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
					temp.arr[i][j]=arr[i][j]-m.arr[i][j];
		return temp;
	}
	public Matrix Multiply(Rational m)
	{
		int s=0;
		Matrix temp=new Matrix();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				for(k=0;k<arr[i].length;k++)
				{
					s=s+arr[i][k]+m.arr[k][j];
				
				temp.arr[i][j]=s;
				}
		return temp;
	}
		public Matrix transpose(Matrix m)
	{
		Matrix temp=new Matrix();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
			{
				temp.arr[i][j]=arr[j][i];
			}
				
		return temp;
		
	}
	public void show()
	{
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
			System.out.println();	
	}
}
class MatrixAddMulDiVSub1
{
	public static void main(String args[])
	{
		System.out.println("first Matrix");
		Matrix m1=new Matrix();
		m1.show();
		System.out.println("sec Matrix ");
		Matrix m2=new Matrix();
		m2.show();
		Matrix m3,m4,m5,m6;
		m3=m1.add(m2);
		System.out.println("Addition Matrix");
		m3.show();
		m4=m1.less(m2);
		System.out.println("Substract Matrix");
		m4.show();
		m5=m1.Multiply(m2);
		System.out.println("Multiply Matrix");
		m5.show();
		m6=m1.transpose(m2);
		System.out.println("Addition Matrix");
		m3.show();

	}
}