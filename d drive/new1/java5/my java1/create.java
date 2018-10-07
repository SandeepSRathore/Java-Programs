//import java.io.*;
class UseCalculator
{
	public static void main(String args[])
	{
		Calculator calc=new Calculator();
		int x,y;
		float f1,f2;
		x=calc.sum(3,4);
		System.out.println("3+4="+x);
		y=calc.sum(3,4,5);
		System.out.println("3+45="+y);
		f1=calc.sum(1.2f,2.3f);
		System.out.println("1.2+2.3="+f1);
		f2=calc.sum(1.2f,2.3f,3.4f);
		System.out.println("1.2+2.3+3.4="+f2);
	
	}
	
	
}