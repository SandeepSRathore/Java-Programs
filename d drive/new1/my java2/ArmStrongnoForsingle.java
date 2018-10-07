import java.util.*;
class create
{
public static void main(String arg[])
{
	
	int n=(int)(Math.random()*1000);
	System.out.println("no is"+n);
	int temp=n,r,sum=0;
	while(temp!=0)
	{
		r=temp%10;
		sum=sum+r*r*r;
		temp=temp/10;
		
	}
	if(sum==n)
	{
		System.out.println("enter no is Armstrong no");
	}
	else
	{
		System.out.println("Not armStrong no");
	}
		
		
	
	
	
	 


}
}
