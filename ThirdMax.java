import java.io.*;
class ThirdMax
{
	public static void main(String args[])
	{
		int a,b,c,d,max,smax,tmax;
		System.out.println("Enter the four numbers");
		Console input=System.console();
		a=Integer.parseInt(input.readLine());
		b=Integer.parseInt(input.readLine());
		c=Integer.parseInt(input.readLine());
		d=Integer.parseInt(input.readLine());
		if(a>b)
		{
			max=a;
			smax=b;
		}
		else
		{
			max=b;
			smax=a;
		}
		if(c>max)
		{
			tmax=smax;
			smax=max;
			max=c;
		}
		else
		{
			if(c<smax)
			{
				tmax=c;
			}
			else
			{
				tmax=smax;
				smax=c;
			}
		}
		if(d>smax)
		{
			if(d>max)
			{
				tmax=smax;
				smax=max;
				max=d;
			}
			else
			{
				tmax=smax;
				smax=d;
			}
		}
		else
		{
			if(d>tmax)
				tmax=d;
		}
		System.out.println("Third maximum is "+tmax);
	}
}