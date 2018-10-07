class UseMatrix
{
	public static void main(String [] args)
	{
		System.out.println("3* 3 Matrix :");
		Matrix m1=new Matrix();
		m1.show();
		System.out.println("5 * 4 Matrix :");
		Matrix m2=new Matrix(5,4);
		m2.show();
		System.out.println("5 * 4 Matrix by copy constructor :");
		Matrix m3=new Matrix(m2);
		m3.show();
	}
}