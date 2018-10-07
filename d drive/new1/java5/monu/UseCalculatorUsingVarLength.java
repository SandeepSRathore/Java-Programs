class UseCalculatorUsingVarLength
{
	public static void main(String args[])
	{
		CalculatorUsingVarLength calc=new CalculatorUsingVarLength();
		int x,y,z;
		x=calc.sum(3,4);
		y=calc.sum(3,4,5,6);
		int arr[]={10,20,30};
		z=calc.sum(arr);
		System.out.println(x+","+y+","+z);
	
	}
}