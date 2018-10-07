import java.io.*;
class Rational
	{
 		Console con = System.console();
 		private int num,den;
 		public  Rational()
 		{
  			
 		}
 		public Rational(int a , int b)
 		{
  			
			num = a;
  			den = b;
			
				
  		}
 		public Rational(Rational r)
 		{
  			this.num = r.num;
  			this.den= r.den;
 		}
 		public void set(int n , int d)
 		{
			
			num = n;
  			den = d;
			
 		}
 		public int readValue()
 		{
  			System.out.print("enter numerator : ");
  			num = Integer.parseInt(con.readLine());
  			System.out.print("enter denominator : ");
  			den = Integer.parseInt(con.readLine());
			return den;
		}
 		public Rational add(Rational r)
 		{
  			Rational temp=new Rational();
  			if(den==r.den)
  			{
   				temp.num=num+r.num;
   				temp.den=den;
  			}
  			else
  			{
   				temp.num=num*r.den+r.num*den;
   				temp.den=den*r.den;
  			}
  			if(temp.num==0)
  			{
   				temp.num=temp.den=0;
  			}
  			return temp;
 		}
 		public Rational less(Rational r)
 		{
			Rational temp=new Rational();
  			if(den==r.den)
  			{
   				temp.num=num-r.num;
   				temp.den=den;
  			}
  			else
  			{
   				temp.num=num*r.den-r.num*den;
   				temp.den=den*r.den;
  			}
  			if(temp.num==0)
  			{
   				temp.num=temp.den=0;
  			}
  			return temp;
 		}
 		public Rational multiply(Rational r)
 		{
  			Rational temp=new Rational();
  			temp.num = num*r.num;
  			temp.den = den*r.den;
  			if(temp.num==0)
  			{
   				temp.num=temp.den=0;
  			}
  			return temp;
 		}
 		public Rational divide(Rational r)
 		{
  			Rational temp=new Rational();
  			temp.num = num*r.den;
  			temp.den = den*r.num;
  			if(temp.num==0)
  			{
   				temp.num=temp.den=0;
  			}
  			return temp;
 		}
		 public void show()
 		{
  			if(num==0)
   			System.out.println(num);
  			else
   				if(den==1)
    					System.out.println(num);
  				else
   					System.out.println(num+"/"+den);
 		}
	}