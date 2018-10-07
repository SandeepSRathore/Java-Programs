import java.io.*;
class UseRational
{
 	public static void main(String args[])
 	{

			
		int num1,deno1;
		int num2,deno2;
  		Console con=System.console();
  		Rational r1=new Rational();
  		int q1=r1.readValue();
		Rational r2 = new Rational();

  		int q2=r2.readValue();
		if(q1!=0 && q2!=0){
  		r1.show();                 
  		
  		r2.show();
  		Rational r3 = new Rational();
  		r3=r1.add(r2);
  		System.out.print("addition is : ");
  		r3.show();
  		r3=r1.less(r2);
  		System.out.print("subtraction is : ");
  		r3.show();
  		r3=r1.multiply(r2);
  		System.out.print("multiply is : ");
  		r3.show();
  		r3=r1.divide(r2);
  		System.out.print("divide is : ");
  		r3.show();}
		else {System.out.print("give non zero deno ");
		}
	}
}