import java.io.*;
class UseRational
{
	public static void main( String args[])
	{	
		Console con=System.console();
		System.out.println("Enter the numerator of first no");
		int n=Integer.parseInt(con.readLine());
		System.out.println("Enter the denominator of first no");
		int d=Integer.parseInt(con.readLine());
		if(d==0)
		{
			do
			{
				con.printf("Enter denominator other than 0");
				d=Integer.parseInt(con.readLine());
			}while(d==0);
		}
		Rational r1=new Rational(n,d);
		System.out.println("First Rational Number obtained is ");
		r1.show();
		System.out.println("Enter the numerator of second no");
		n=Integer.parseInt(con.readLine());
		System.out.println("Enter the denominator of second no");
		d=Integer.parseInt(con.readLine());
		if(d==0)
		{
			do
			{
				con.printf("Enter denominator other than 0");
				d=Integer.parseInt(con.readLine());
			}while(d==0);
		}
		Rational r2=new Rational(n,d);
		System.out.println("Second Rational Number obtained is ");
		r2.show();
		int ch;
		do
		{
			con.printf("Enter 1 for Addition\nEnter 2 for Subtraction\nEnter 3 for Multiplication\nEnter 4 for Division\n");
			n=Integer.parseInt(con.readLine());
			switch(n)
			{
				case 1:
				Rational r3=new Rational();
				r3=r1.add(r2);
				System.out.println("Addition of two rational number is ");
				r3.show();
				break;
				
				case 2:
				Rational r4=new Rational();
				r4=r1.less(r2);
				System.out.println("Difference of two rational number is ");
				r4.show();
				break;
				
				case 3:
				Rational r5=new Rational();
				r5=r1.multiply(r2);
				System.out.println("Multiplication of two rational number is ");
				r5.show();
				break;

				case 4:
				Rational r6=new Rational();
				r6=r1.divide(r2);
				System.out.println("Division of two rational number is ");
				r6.show();
				break;
				
				default:
				System.out.println("Invalid choice");
			}
			System.out.println("If you want to continue then press 8");
			ch=Integer.parseInt(con.readLine());	
		}while(ch==8);
	}
}