import java.io.*;
class Rational
{
private int numerator,denominator;

	public Rational(Rational m)
	{

	numerator=m.numerator;
	denominator=m.denominator;
	}
	public void show()
	{
			System.out.println(numerator+"/"+denominator);
	}
}
class RationalAdd
{
	public static void main(String args[])
	{
		System.out.println("first");
		Rational m1=new Rational();
		m1.show();
		System.out.println("second");
		Rational m2=new Rational(5,4);
		m2.show();
		System.out.println("copy of second");
		Rational m3=new Rational(m2);
		m3.show();
		
		
	}
}