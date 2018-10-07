import java.io.*;
class Rational
{
	private int numerator,denominator;
	public Rational()
	{
		
		numerator=0;
		denominator=1;
	}

	public Rational add(Rational m)
	{
		Rational temp=new Rational();
		temp.numerator=m.denominator*numerator+m.numerator*denominator;
		temp.denominator=denominator*m.denominator;
		return temp;
	}
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
	}
	public void Read()
	{

	
	Console con=System.console();

	System.out.println("Enter the num and denom");
	

	numerator=Integer.parseInt(con.readLine());
	denominator=Integer.parseInt(con.readLine());
	
	check();
	}



	public void check()
	{

		if(denominator==0)

		{

		System.out.println("Enter the correct values please");

		Read();

		}
	}
	public void show()
	{
		System.out.println(numerator+"/"+denominator);
	}
}
class RationalAddMulDiVSub
{
	public static void main(String args[])
	{
	//	System.out.println("first ");
		Rational m1=new Rational();
		m1.Read();
		m1.check();
		m1.show();
	//	System.out.println("sec ");
		Rational m2=new Rational();
		m2.Read();
		m2.check();
		m2.show();
		Rational m3,m4,m5,m6;
		m3=m1.add(m2);
		System.out.println("sum is");
		m3.show();
		m4=m1.less(m2);
		System.out.println("substract is is");
		m4.show();
		m5=m1.Multiply(m2);
		System.out.println("Multiply is");
		m5.show();
		
		m6=m1.divide(m2);
		System.out.println("Divide is");
		m6.show();
		


	}
}