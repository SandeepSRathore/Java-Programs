import java.io.*;
class Max4
{
	public static void main(String args[])
	{
		int a,b,c,d,max;
		System.out.println("Enter the four numbers");
		Console input=System.console();
		a=Integer.parseInt(input.readLine());
		b=Integer.parseInt(input.readLine());
		c=Integer.parseInt(input.readLine());
		d=Integer.parseInt(input.readLine());
		if(a>b)
			max=a;
		else
			max=b;
		if(c>max)
			max=c;
		else
			if(d>max)
				max=d;
		System.out.println("Maximum of 4 numbers is "+max);				
	}
}