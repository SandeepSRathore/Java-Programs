class UseMatrix
{
public static void main(String args[])
{
Matrix m1=new Matrix();
System.out.println("enter digits");
m1.read();


Matrix m2=new Matrix(5,4);
System.out.println("enter digits");
m2.read();

Matrix m3=new Matrix(m2);
System.out.println("enter digits");
m3.read();

System.out.println("first matrix is");
m1.show();
System.out.println("second matrix is");
m2.show();
System.out.println("third matrix is");
m3.show();
}
}