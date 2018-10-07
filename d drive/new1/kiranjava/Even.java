class Even
{
 public static void main(String args[])
  	{
	  int a,b,c,d,count=0;
	  a=(int)(Math.random()*100);
	  b=(int)(Math.random()*100);
	  c=(int)(Math.random()*100);
	 d=(int)(Math.random()*100);
	System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
	switch(1)
 	{
	case 1:
		if(a%2==0)
		{
		count++;  
		}
	case 2:
		if(b%2==0)
		{
		count++;
		}
	case 3:
		if(c%2==0)
		{
		count++;
		}
	case 4:   
		if(d%2==0)
		{
		count++;
		}
	}
	System.out.println("number of even number is="+count);
	}
}
	