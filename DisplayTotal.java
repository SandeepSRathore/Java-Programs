import java.io.*;
class DisplayTotal
{
	public static void main(String args[]) throws Exception
	{
		int total=0;
		File f=new File("Threading/"+args[0]);
		File arr[]=f.listFiles();
		int n=arr.length;
		System.out.println(args[0]+" has following "+n+" files");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i].getName());
		}
		for(int i=0;i<n;i++)
		{
			ReadNumber rn=new ReadNumber(arr[i]);
			rn.start();
			rn.join();
			total+=ReadNumber.sum;
		}
		File nf=new File("Threading/GrandTotal.txt");
		nf.createNewFile();
		PrintStream ps=new PrintStream(nf);
		ps.print(total);
		ps.close();		
	}
}