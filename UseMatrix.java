class UseMatrix
{
	public static void main(String args[])
	{
		Matrix m1=new Matrix();
		System.out.println("Enter values in First matrix");
		m1.read();
		System.out.println("First Matrix created is");
		m1.show();
	
		Matrix m2=new Matrix(5,4);
		System.out.println("Enter values in Second matrix");
		m2.read();
		System.out.println("Second Matrix created is");
		m2.show();
	
		Matrix m3=new Matrix(m2);
		System.out.println("Enter values in Third matrix");
		m3.read();
		System.out.println("Third Matrix created is");
		m3.show();
	}
}