class Matrix
{
	private int arr[][];
	public Matrix()
	{
		arr=new int[3][3];
	}
	public Matrix(int a,int b)
	{
		arr=new int[a][b];
	}
	public Matrix(Matrix m)
	{
		int x=0;
		arr=new int[m.arr.length][m.arr[x].length];
		
	
		
	}

	public void show()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");

			}
		System.out.println("");

		}
	}


}