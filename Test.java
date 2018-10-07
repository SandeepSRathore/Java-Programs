class Test
{
	public static void main(String args[])
	{
		Rational r1=new Rational(25,33);
		Rational r2=new Rational(25,33);
		System.out.println("First Rational Number is "+r1);
		System.out.println("Second Rational Number is "+r2);
		System.out.println(r1.equals(r2));
	}
}