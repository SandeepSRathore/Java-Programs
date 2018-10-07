import java.io.*;
class Rational
{
	private int numerator;

	private int denominator;


	public Rational()
	{
	numerator=0;
	denominator=1;
	}

	public Rational(int n,int d)

	{
	numerator=n;
	denominator=d;
	

	}
		public void show()
	{
	System.out.println(numerator+"/"+denominator);
	}
	
	public void Read()
	{

	
	Console con=System.console();

	System.out.println("Enter the num and denom");
	

	numerator=Integer.parseInt(con.readLine());
	denominator=Integer.parseInt(con.readLine());
	
	
	}

}
