//import java.io.*;
class Gen10Max
{
	public static void main(String args[])
	{
		int max=0;
		for(int i=1;i<=10;i++)
		{
		int n=(int)(Math.random()*10);
		System.out.print(n+",");
		if(n>max)
		{
			max=n;
		}
		}
		System.out.println("");
		System.out.println("max is: "+max);
		
		
		//System.out.println("Sec"+a);
		/*int i,j,fact=1;
		Console con=System.console();
		int n=Integer.parseInt(con.readLine());
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial is"+fact)
		*/
	}
}
