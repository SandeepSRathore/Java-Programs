class CalculatorUsingVarLength
{
	public int sum(int...a)
	{
		int i,total=0;
		for(i=0;i<a.length;i++)
			total+=a[i];
			return total;
	}
}