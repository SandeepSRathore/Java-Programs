class calculation
{
private int rs,paisa;
public void set(int r,int p)
{
	rs=r;
	paisa=p;
}
public void show()
{
	System.out.println(rs+"."+paisa);
}
}
class UseCalculationFloatVLA
{
	public static void main(String args[])
	{
		calculation cal=new calculation();
		cal.set(10,20);
		cal.show();
		
		System.out.println(x);
	}
}