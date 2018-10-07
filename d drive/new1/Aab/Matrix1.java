class Matrix1
{

private int arr[][];
  public Matrix1()
  {
     arr=new int[3][3];
       System.out.println("Default Constructor :");
    System.out.println(" Row Size: "+arr.length);
  }

  public Matrix1(int p, int q)
  {
        arr=new int[p][q];
     System.out.println("Parameterized Constructor :");
     System.out.println(" Row Size : "+arr.length);
  }
  public Matrix1(Matrix1 M)
  {
     arr=new int [M.arr.length][M.arr[0].length];
   System.out.println("Copy Constructor :");
   System.out.println(" Size : "+arr.length);
  }


}