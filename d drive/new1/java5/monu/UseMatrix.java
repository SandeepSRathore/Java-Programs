class UseMatrix
{
	public static void main(String [] args)
	{
		Matrix m1=new Matrix();
		System.out.println("3*3 Matrix by default constructor");
		m1.show();
		
		System.out.println("5*4 Matrix by Parameterized constructor");
		Matrix m2=new Matrix(5,4);
		m2.show();
		
		Matrix m3=new Matrix(m2);
		System.out.println("5*4 Matrix by copy constructor");
		m3.show();
	}
}