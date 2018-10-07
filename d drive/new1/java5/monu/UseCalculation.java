class calculation
{
	public float sum(float...a)
	{
		int i;
		float total=0;
		for(i=0;i<a.length;i++)
		{
			total+=a[i];
		}
		return total;
	}
	
}
class UseCalculation
{
	public static void main(String args[])
	{
		calculation cal=new calculation();
		float x=cal.sum(2.3f,3.4f);
		//int y=cal.sum(3.4,3.5);
		System.out.println(x);
	}
}