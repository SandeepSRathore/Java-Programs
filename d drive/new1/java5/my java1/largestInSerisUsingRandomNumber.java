class create
{
public static void main(String arg[])
{
	
	int count=0,max=0;
	int temp=0;
	
	for(int i=1;i<=10;i++)
	{
		
		int a=(int)(Math.random()*10);
		System.out.print(a+" ");
		if(a>temp)
			count++;
		else
		{
			if(count>max)
			{
				max=count;
			}
			count=1;
		}
		temp=a;
	
			
		
	}
	if(count>max)
	{
		max=count;
	}
	System.out.println();
	System.out.println(max);
}
}
