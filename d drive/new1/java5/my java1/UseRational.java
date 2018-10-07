class UseRational

{
	public static void main(String args[])
{


	Rational r1,r2;

	r1=new Rational();
	r1.Read();
	r1.check();

	r1.show();

	r2= new Rational();

	r2.Read();

	r2.check();
	

	r2.show();


	Rational r4,r5,r6,r7;


	r4=r1.add(r2);

	System.out.println("The sum is=");
	
	r4.show();

	r5=r1.less(r2);

	System.out.println("The difference is");

	r5.show();

	r6=r1.Multiply(r2);

	System.out.println("The multiplication is");

	r6.show();

	r7=r1.divide(r2);

	System.out.println("The result of divide is");

	r7.show();
}

}