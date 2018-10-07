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

	public Rational(Rational r)
{
	numerator=r.numerator;
	denominator=r.denominator;
}
 

	public void show()
{
	System.out.println(numerator+"/"+denominator);
}



	public Rational add(Rational r)
{


	Rational temp=new Rational();

	temp.numerator= r.denominator*numerator+denominator*r.numerator;

	temp.denominator=denominator*r.denominator;

	return temp;

	}

	public Rational less(Rational r)

{

	Rational temp=new Rational();
	
	temp.numerator=r.denominator*numerator-denominator*r.numerator;

	temp.denominator=denominator*r.denominator;

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


	


	public Rational Multiply(Rational r)
{

	Rational temp=new Rational();
	
	temp.numerator=numerator*r.numerator;
	temp.denominator=denominator*r.denominator;
	
	return 	temp;

}


	public Rational divide(Rational r)
{

	Rational temp=new Rational();

	
	if(r.numerator==0)
{

	System.out.println("Enter the non zero value else division not possible");
	temp.numerator=0;
	temp.denominator=0;
	return temp;
}


	else
{
	

	int a=r.numerator;

	r.numerator=r.denominator;

	r.denominator=a;

	temp.numerator=numerator*r.numerator;

	temp.denominator=denominator*r.denominator;



	return temp;
}
}




}

