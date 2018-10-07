import java.io.*;
class UseMatrixOopConcept
{
	public static void main(String args[])
	{
		MatrixOopConcept m1=new MatrixOopConcept();
		System.out.println("enter the value");
		m1.read();
		System.out.println("the first matrix is:");
		m1.show();
		MatrixOopConcept m2=new MatrixOopConcept();
		System.out.println("enter the more value");
		m2.read();
		System.out.println("the second matrix is:");
		m2.show();
	}
	
}