import java.io.*;
class FileSplitter
{
	public static void main(String args[]) throws IOException
	{
		Console con= System.console();
		String path, name1,filepath;
		int size;
		double n;
		int i,j,l;
		System.out.println("enter the path of the file");
		path= con.readLine();
		File f= new File(path);
		if(!(f.exists()))
		{
			System.out.println("file does not exists");
			System.exit(0);
		}
		filepath= f.getParent();
		name1= f.getName();
		System.out.println("size of the file is"+ f.length());
		System.out.println("enter the size ofdestination file");	
		size= Integer.parseInt(con.readLine());
		n=((double)f.length()/size);
		l=((int)Math.ceil(n));
		FileInputStream fis= new FileInputStream(f);
		for(i=0;i<n;i++)
		{
			FileOutputStream fos= new FileOutputStream(filepath+"//"+(i+1)+f.getName());
			System.out.println(filepath+""+(i+1)+f.getName());
                         for(j=0;j<size;j++)
			{
				int ch;
				ch= fis.read();
				if(ch==-1)
				{
					System.out.println("end of file");
					fis.close();
					System.exit(0);
				}
				else
					fos.write(ch);
			}
			fos.close();
		}
	}
}


	
		
		
	