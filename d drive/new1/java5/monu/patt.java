class patt
{
 public static void main(String args[])
 {
   int i,j,k,n;
   n=(int)(Math.random()*10);
   System.out.println("n="+n);
   
   for(i=1;i<=n;i++) 
   {
    for(int h=1;h<n-i;h++)
    {
    	 System.out.println(" ");
    }
         
   for(j=1;j<=i;j++)
   {
    System.out.print(j);
   }
    if(i>1)
   for(k=j-2;k>=1;k--)
    System.out.print(k);
  }
   System.out.println(); 
}

  }
}