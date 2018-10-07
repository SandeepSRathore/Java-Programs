class calculation1VAR
{
	public int sum(String m,double b,int...marks)
	{
		int total=0;
		System.out.println(marks.length);
		for(int mark:marks)
		{
			total+=mark;
		}
	
		System.out.println(total+","+m);
			return total+=b;
		
	}
	
}
class UseCalculation
{
	public static void main(String args[])
	{
		calculation cal=new calculation();
		int x=cal.sum("ram",2.4,2,3);
		//int y=cal.sum(3.4,3.5);
		int arr[]={2,3};
		int z=cal.sum("sita",1.23,arr);
		System.out.println(x+","+z);
	}
}