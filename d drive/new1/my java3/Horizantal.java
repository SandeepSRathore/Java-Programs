import java.io.*;
class Horizantal
{
public static void main(String args[])
{
	int arr[]=new int[10]; 
	Console con=System.console();
	System.out.println("enter the no");
	for(int i=0;i<arr.length;i++)
	
		arr[i]=Integer.parseInt(con.readLine());
	
		for(int j=0;j<arr[i];j++)
			{
			System.out.print('*');
			}
		System.out.println();
	}
}

