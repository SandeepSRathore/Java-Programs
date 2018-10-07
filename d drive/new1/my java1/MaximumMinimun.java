class Minimum
{
 public static void main(String args[])
  	{
	  int a,b,c,d,max,min=0;
	  a=(int)(Math.random()*100);
	  b=(int)(Math.random()*100);
	  c=(int)(Math.random()*100);
	 d=(int)(Math.random()*100);
	System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
	if(a>b)
	 {
	max=a;
	 
	}
                else 
               {
	 max=b;
	
	}

	 if(c>max)
	{
    max=c;
	
	}
	if(d>max)
	{
		max=d;
	}
	if(a<b)
	 {
	min=a;
	 
	}
                else 
               {
	 min=b;
	
	}

	 if(c<min)
	{
    min=c;
	
	}
	if(d<min)
	{
		min=d;
	}
	
              System.out.println("Maximum is=" +max);
	 System.out.println("Minimum is=" +min);
	}
}
                
	
	  
   