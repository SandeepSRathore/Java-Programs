class TriangleForm
{
public static void main(String arg[])
{
	
	int i,j;
	int n=(int)(Math.random()*10);
	System.out.println("no is"+n);
	for(i=1;i<=n;i++)
	{
		for(j=n-1;j>=i;j--)
		{
			System.out.print(" ");
		}
		for(j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		for(j=i-1;j>=1;j--)
		{
			System.out.print(j);
		}
	System.out.println();
	}		
		
	
	
	
	 


}
}
