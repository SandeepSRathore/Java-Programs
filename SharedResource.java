import java.io.*;
class SharedResource
{
	public static void main(String args[]) throws IOException
	{
		Console con=System.console();
		System.out.println("Enter the name of the directory");
		String dir=con.readLine();
		File f=new File("Threading/"+dir);
		File files[]=f.listFiles();
		int n=files.length;
		System.out.println(dir+" has following "+n+" files");
		for(int i=0;i<n;i++)
		{
			System.out.println(files[i].getName());
		}
		Resource resource=new Resource();
		WriteToVector wtv=new WriteToVector(resource,files);
		ReadFromVector rfv=new ReadFromVector(resource,files);
		wtv.start();
		rfv.start();
	}
}