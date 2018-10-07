class Matrix
{
	private int arr[][];
	public Matrix()
	{
		arr=new int[3][3];		
	}
	public void Read()
	{
		java.io.Console con=System.console();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=Integer.parseInt(con.readLine());
			}
			//System.out.println();
		}		
	}
		public void show()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}		
	}
	
}
class Test1
{
	public static void main(String args[])
	{
		Matrix m1=new Matrix();
		m1.Read();
		m1.show();
	}
}