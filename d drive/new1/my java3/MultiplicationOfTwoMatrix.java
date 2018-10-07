import java.io.*;
class MultiplicationOfTwoMatrix
{
public static void main(String arg[])
{
	int s=0;
Console con=System.console();	
int a[][]=new int[2][2];
int b[][]=new int[2][2];
int c[][]=new int[2][2];
System.out.println("Enter the no:");
int j;
for(int i=0;i<a.length;i++)
{
	for(j=0;j<a[i].length;j++)
	{
		a[i][j]=Integer.parseInt(con.readLine());
	}
}
System.out.println("Enter the more no:");
for(int i=0;i<b.length;i++)
{
	for(j=0;j<b[i].length;j++)
	{
		b[i][j]=Integer.parseInt(con.readLine());
		
		
	}
}
System.out.println("Multiplication matrix is");	
for(int i=0;i<c.length;i++)
{
	for(j=0;j<c[i].length;j++)
	{
		for(int k=0;k<c[i].length;k++)
		{
		
		s=s+a[i][k]*b[k][j];
		
		
		}
		c[i][j]=s;
		s=0;
	}
}
for(int i=0;i<c.length;i++)
{
	for(j=0;j<c[i].length;j++)
	{
		System.out.print(c[i][j]+"\t");
	}
	System.out.print("\n");
}
}
}