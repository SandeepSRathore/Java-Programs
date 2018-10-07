import java.io.*;
class verticalhistogram
{
public static void main(String arg[])
{
int max=0,i,j;
int arr[]=new int[4];
Console con=System.console();
System.out.println("enter values");
for(i=0;i<=3;i++)
{
arr[i]=Integer.parseInt(con.readLine());
if(arr[i]>max)
{
 max=arr[i];
}
}
System.out.println("max is"+max);
while(max!=0)
{
for(j=0;j<arr.length;j++)
{
if(arr[j]<max)
{
System.out.print(" ");
}
else
System.out.print("*");
}
System.out.println("");
max--;
}

}
}