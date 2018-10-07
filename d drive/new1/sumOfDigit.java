//import java.io.*;
class sumOfDigit
{
	public static void main(String args[])
	{
		int n=(int)(Math.random()*100000);
		int sum=0;
	
		System.out.println(n);
		for(int i=1;i<=n;i++)
		{
			sum=sum+(n%10);
			n=n/10;
		}
		System.out.println(sum+n);
		
	}
}
