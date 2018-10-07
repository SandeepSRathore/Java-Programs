class max
{ 
  public static void main(String args[])
  {
   int max,b,count=0;
   max=(int)(Math.random()*10);
   System.out.println("max="+max);
  for(int i=1;i<=10;i++)
  {
    b=(int)(Math.random()*10);
    System.out.println("b="+b);
    if(max>b)
   {
     max=max;   
    System.out.println("max="+max);
   
   }
   else
  {
   max=b; 
  System.out.println("max="+max); 
  }
 for(i=1;i<=max;max++)
 {
   count++;
  System.out.println("count="+count);
 }
}
}
}


