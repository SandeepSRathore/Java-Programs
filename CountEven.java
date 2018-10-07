import java.io.*;
class CountEven
{
	public static void main(String args[])
	{
		int a,b,c,d,count=0;
		System.out.println("Enter the four numbers");
		Console input=System.console();
		a=Integer.parseInt(input.readLine());
		b=Integer.parseInt(input.readLine());
		c=Integer.parseInt(input.readLine());
		d=Integer.parseInt(input.readLine());
		if(a%2==0)
			count++;
		if(b%2==0)
			count++;
		if(c%2==0)
			count++;
		if(d%2==0)
			count++;
		System.out.println(count+" Numbers are Even");
	}
}