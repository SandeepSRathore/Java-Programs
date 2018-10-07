//import java.util.*;
class create
{
public static void main(String arg[])
{
	
	int a=(int)(Math.random()*10);
	int b=(int)(Math.random()*10);
	
	System.out.println("a="+a+"b="+b);
	try{
	int result=a/b;
	
	System.out.println("division"+result);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Exception caught division by zero");
	}
	 


}
}
