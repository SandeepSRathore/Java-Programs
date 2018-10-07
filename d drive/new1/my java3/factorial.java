class create
{
	public static void main(String args[])
	{
		int no=(int)(Math.random()*10);
		int fact=1;
		System.out.println("number for fact is:"+no);
		if(no<0)
			System.out.println("number is negative factorial are not allow");
		else
		{
			for(int i=1;i<=no;i++)
			{
			fact=fact*i;
			}
		}
		System.out.println(" fact is:"+fact);
			
		
		
			
		
	}
}