class incre
{
  
  public static void main(String args[])
 {
   int count=0,count1=1;
   int a,i,b;
   a=(int)(Math.random()*100);
   System.out.println(a);
   for(i=1;i<10;i++)
   {
     b=(int)(Math.random()*100);
     System.out.println(b);   
     if(a<b)
    {
    count++;
    a=b;
    }
   else
   {
    
 
  a=b;
  	count=1;
   }
   if(count1<count)
	   {
	   count1=count;
	   
	  }

}
System.out.println("count1="+count1);
}
}
 