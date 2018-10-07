class calculationFloat
{
	public int sum(int...a)
	{
		int i;
		int total=0;
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
		int x=cal.sum(2,3);
		//int y=cal.sum(3.4,3.5);
		System.out.println(x);
	}
}