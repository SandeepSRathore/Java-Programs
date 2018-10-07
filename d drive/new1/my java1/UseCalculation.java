class calculation
{
	public int sum(int...a)
	{
		int i,total=0;
		for(i=0;i<a.length;i++)
		{
			total+=a[i];
		}
		return total;
	}
	public float sum1(float...b)
	{
		int i;
		float total=0;
		for(i=0;i<b.length;i++)
		{
			total+=b[i];
		}
		return total;
	}
}
class UseCalculation
{
	public static void main(String args[])
	{
		calculation cal=new calculation();
		int x=cal.sum(3,4);
		//calculation cal=new calculation();
		float y=cal.sum1(3.4f,3.5f,2.5f);
		System.out.println(x+","+y);
	}
}