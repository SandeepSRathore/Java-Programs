class create
{
public static void main(String arg[])
{
	
	int a[]={2,3,4,7,1,4,5};
	int count=1,max=1;
	for(int i=1;i<a.length;i++)
	{
		if(a[i]>=a[i-1])
		{
			count++;
			
		}
		else
		{
			if(count>max)
			{
				max=count;
			}
			count=1;
		}
	}
	
	System.out.print(max);
	}
}