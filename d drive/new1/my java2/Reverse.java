import java.io.*;
class create
{
public static void main(String arg[])
{
	int reverse=0;
	int n=(int)(Math.random()*10000);
	System.out.print("No for reverse is:"+n);
	while(n!=0)
	{
		reverse=reverse*10;
		reverse=reverse+n%10;
		n=n/10;
	}
	System.out.println("reverse is:"+reverse);
	

}
}
