class UseMoney
{
public static void main(String arg[])
{
	Money m1;
	m1=new Money();
	m1.set(100,20);
	System.out.println("first amount is:");
	m1.show();
	Money m2=new Money();
	m2.set(200,40);
	System.out.println("Second matrix is:");
	m2.show();
}
}
