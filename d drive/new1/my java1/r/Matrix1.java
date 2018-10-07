import java.io.*;
 
class Matrix1
{
private int arr1[][];
Console con=System.console();
public Matrix1()
{
 arr1=new int[3][3];
//int i=0,j=0;

}
 
public Matrix1(int i,int j)
{
int a,b;
a=i;
b=j;
arr1=new int[a][b];


System.out.println("Enter the values");


for(int i1=0;i1<a;i1++)
 {
	for(int j1=0;j1<b;j1++)
   {
	arr1[i1][j1]=Integer.parseInt(con.readLine());
   }
  }
}

public void read()
{
	int i,j;
//	Console con=System.console();
	System.out.println("Enter the values");

	for(i=0;i<arr1.length;i++)
	{
		for(j=0;j<arr1[i].length;j++)
		{
			arr1[i][j]=Integer.parseInt(con.readLine());
		}

	}
}



public Matrix1(Matrix1 m)
{
int a,b;
a=m.arr1.length;
b=m.arr1[0].length;
arr1=new int[a][b];
}

public void show()
{
//int i,j;
for(int i=0;i<arr1.length;i++)
{
for(int j=0;j<arr1[i].length;j++)
{
System.out.print(arr1[i][j]+" ");
}
System.out.println(" ");
}
}
}
