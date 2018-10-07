import java.io.*;
class Matrix
{
	private int arr[][];
	public Matrix()
	{
		arr=new int[3][3];
	
	}
	
	public Matrix add(Matrix m)
	{
		Matrix temp=new Matrix();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
					temp.arr[i][j]=arr[i][j]+m.arr[i][j];
		return temp;
	}
	public void Read()
	{
			Console con=System.console();
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]=Integer.parseInt(con.readLine());
	}
	/*
		public Rational less(Rational m)
	{
		Rational temp=new Rational();
		temp.numerator=m.denominator*numerator-m.numerator*denominator;
		temp.denominator=denominator*m.denominator;
		return temp;
	}
	public Rational Multiply(Rational m)
	{
		Rational temp=new Rational();
		temp.numerator=m.numerator*numerator;
		temp.denominator=denominator*m.denominator;
		return temp;
	}
		public Rational divide(Rational m)
	{
		Rational temp=new Rational();
		temp.numerator=m.denominator*numerator;
		temp.denominator=denominator*m.numerator;
		return temp;
	}*/
	public void show()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
class MatrixAddMulDiVSub
{
	public static void main(String args[])
	{
		System.out.println("first Matrix");
		Matrix m1=new Matrix();
		m1.Read();
		m1.show();
		System.out.println("sec Matrix ");
		Matrix m2=new Matrix();
		m2.Read();
		m2.show();
		Matrix m3;
		m3=m1.add(m2);
		System.out.print("Sum is:");
		m3.show();
		
		

	}
}