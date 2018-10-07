import java.io.*;
class SumArrayValue
{
public static void main(String arg[])
{
	
	int arr[]=new int[10];
	int avg,sum=0,i;
	Console con=System.console();
	System.out.print("enter the value");
	for(i=0;i<arr.length;i++)
	{
		arr[i]=Integer.parseInt(con.readLine());
		sum+=arr[i];
		
	}
	System.out.print("The sum is:"+sum);
	avg=sum/arr.length;
	System.out.println("Average is:"+avg);
		System.out.print("value above Average are:");
	for(i=0;i<arr.length;i++)
		if(arr[i]>avg)
			System.out.println(arr[i]+" ");
	
}
}