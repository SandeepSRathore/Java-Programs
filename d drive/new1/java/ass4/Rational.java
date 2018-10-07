import java.io.*;
class Rational
{
private int num,deno;




public Rational()
	{
		num=0;
		deno=0;
	}

	public Rational(int n,int d)
	{
		num=n;
		deno=d;
	}

	public Rational(Rational r)
	{
		num=r.num;
		deno=r.deno;
	}


public void set(int n,int d)
{
num=n;
deno=d;
}

public void show()
{
System.out.println(num+"/"+deno);
}



public Rational add(Rational r)
{
Rational temp=new Rational();
int x,y,z,total,p,count=1;

x=deno*r.deno;
y=r.deno*num;
z=deno*r.num;
total=y+z;
p=total;


if(total>x)

p=x;
count=1;

while(count<=p)
{
if(x%count==0 & total%count==0)
{
x=x/count;
total=total/count;
}
count++;
}
temp.num=total;
temp.deno=x;
return temp;
}




public Rational less(Rational r)
{
Rational temp=new Rational();
int x,y,z,total,p,count,flag=1;

x=deno*r.deno;
y=r.deno*num;
z=deno*r.num;
total=y-z;


if(total<0)
{flag=-1;
total=-total;}

p=total;
if(total>x)
p=x;
count=1;
while(count<=p)
{
if(x%count==0 & total%count==0)
{
x=x/count;
total=total/count;
}
count++;}
total=total*flag;


temp.num=total;
temp.deno=x;
return temp;
}





public Rational multiply(Rational r)
{
Rational temp=new Rational();
int x,y,z,total,p,count;

x=deno*r.deno;
total=num*r.num;
p=total;


if(total>x)
p=x;
count=1;
while(count<=p)
{
if(x%count==0 & total%count==0)
{
x=x/count;
total=total/count;
}
count++;

}

temp.num=total;
temp.deno=x;
return temp;
}





public Rational divide(Rational r)
{
Rational temp=new Rational();
int x,y,z,total,p,count;

x=deno*r.num;
total=num*r.deno;
System.out.print(total);

p=total;


if(total>x)
p=x;
count=1;
while(count<=p)
{
if(x%count==0 & total%count==0)
{
x=x/count;
total=total/count;
}
count++;

}

temp.num=total;
temp.deno=x;
return temp;
}

}

