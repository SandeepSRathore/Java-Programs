//import java.util.*;
class create
{
public static void main(String arg[])
{
	int count=0;
	int a=(int)(Math.random()*10);
	int b=(int)(Math.random()*10);
	int c=(int)(Math.random()*10);
	int d=(int)(Math.random()*10);
	System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
	switch(1)
	{
		case 1:
			if(a%2==0)
			{
				count++;
			}
			case 2:
			if(b%2==0)
			{
				count++;
			}
			case 3:
			if(c%2==0)
			{
				count++;
			}
			case 4:
			if(d%2==0)
			{
				count++;
			}
	}
	System.out.println("no even is"+count);
	 


}
}
