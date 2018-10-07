import java .io.*;
class element
{
 public static void main(String args[])
  {
    int pos,count=0,j,i;
    Console con =System.console();
    System.out.println("enter the elements of array");
    pos=Integer.parseInt(con.readLine());
    int arr[]=new int[pos];
    for(i=0;i<arr.length;i++)
    {
      arr[i]=Integer.parseInt(con.readLine());
    }
      
    int n;
    System.out.println("move from where you want");
    n=Integer.parseInt(con.readLine());
       
      for(i=0;i<pos;i++)
    { 
       
      for(n=0;n<arr.length-1;n--)
      {
        int temp;
            temp=arr[i];
         arr[arr.length-1]=temp;
           
      }
       
       
   
  }
  for(i=0;i<arr.length;i++) 
		System.out.println(arr[i]);
 }
} 