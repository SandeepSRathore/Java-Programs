import java.io.*;
class MySplitter
{
	public static void main(String args[])throws IOException
	{
		Console con=System.console();
		String str="";
		int size;
		System.out.println("Enter the file name which u want to split");
		str=con.readLine();
		File f=new File(str);
		System.out.println("Length of file="+f.length());
		System.out.println("Enter the size of each splitted files");
		size=Integer.parseInt(con.readLine());
		FileInputStream fis=new FileInputStream(f);
		BufferedInputStream bis=new BufferedInputStream(fis,size);
		int ch=0;
		int count=1;
		byte arr[]=new byte[size];
		while((ch=bis.read(arr,0,size))!=-1)
		{
			File f1=new File(count+".mp3");
			FileOutputStream fos=new FileOutputStream(f1);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			count++;
			bos.write(arr,0,size);
			System.out.println("Length of each splitted File is"+f1.length());
			bos.close();
			
		}
		fis.close();
		bis.close();
	
	
		
		
	}
}