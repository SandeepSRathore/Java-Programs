import java.io.*;
import java.util.*;
class MyLife
{
	public static void main(String args[])
	{
		Console con=System.console();
		MyStack ms=new MyStack();
		try
		{
			ms.pop();
		}
		catch(UnderFlowException e1)
		{
			System.out.println(e1.getMessage());
			//System.exit(0);
		}
		System.out.println("The short story of 2 Love Birds");
		System.out.println("You have to enter 10 names");
		System.out.println("Enter the name of the boy");
		String boy=con.readLine();
		ms.push(boy);
		System.out.println("Enter the name of the dreamgirl of "+boy);
		String girl=con.readLine();
		ms.push(girl);
		System.out.println("Now Enter the 8 names which "+boy+" calls for "+girl);
		for(int i=0;i<8;i++)
		{
			ms.push(con.readLine());
		}
		System.out.println("Your Romantic Life contains following Names ");
		ms.show();
		System.out.println("Now Enter the name of  Ek Villain");
		String villain=con.readLine();
		ms.push(villain);
		System.out.println("Now your complicated Life contains following names");
		ms.show();
		System.out.println(villain+" is Spoiling your Life.You have to kick him out");
		System.out.println("War goes on..!!!!");
		System.out.println("Press 1 to kick "+villain);
		int kick;
		do
		{
			
			kick=Integer.parseInt(con.readLine());

			if(kick==1)
			{
				try
				{
					ms.pop();
				}
				catch(UnderFlowException e1)
				{
					System.out.println(e1.getMessage());
				}
				System.out.println("Congrats..!!! "+boy+" You win..!!!");
				System.out.println(villain+" is no more..!!!");
				System.out.println(" Now again your Romantic Life has following names");
				ms.show();
			}
			else
			{
				System.out.println("Abe ghonchu 1 press kar..!!! or "+villain+" ko bahar fenk..!!!");
			}
		}while(kick!=1);
	}
}