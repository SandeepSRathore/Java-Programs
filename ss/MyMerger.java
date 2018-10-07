import java.io.*;
class MyMerger
{
	public static void main(String args[])
	{
		Console con=System.console();
		String str="";
		System.out.println("Enter the file name in which u want to merge spllited files");
		str=con.readLine();
		File f=new File(str);
		if(f.exists())
		{
			f.delete();
		}
		
		File f1=new File('1'+f.getName());
		if(!f.exists())
		{
			System.out.println("file not exists");
		}
		
		FileOutputStream fos=new FileOutputStream(f1);
		
		for(int i=0;i<)
		
	}
}