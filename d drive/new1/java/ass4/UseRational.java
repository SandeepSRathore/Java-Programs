class UseRational
{
	public static void main(String args[])
	{
	Rational r1=new Rational(1,2);
	Rational r2=new Rational(2,3);
	System.out.println("first value");
	r1.show();
	System.out.println("second value");
	r2.show();

	Rational r3,r4,r5;
	r3=r1.add(r2);
	System.out.println("sum no. is");
	r3.show();
	
	r3=r1.less(r2);
	System.out.println("sum no. is");
	r3.show();
	
	r3=r1.multiply(r2);
	System.out.println("sum no. is");
	r3.show();
	
	r3=r1.divide(r2);
	System.out.println("sum no. is");
	r3.show();
	
	}
}