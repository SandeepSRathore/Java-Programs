import java.util.*;
class create
{
public static void main(String arg[])
{
	int n,reverse=0;
	Scanner in=new Scanner(System.in);
		System.out.println("enter the no for reverse:");
		n=in.nextInt();
	while(n!=0)
	{
		reverse=reverse*10;
		reverse=reverse+n%10;
		n=n/10;
	}
	System.out.println("reverse is:"+reverse);
	

}
}
