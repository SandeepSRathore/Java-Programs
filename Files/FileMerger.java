import java.io.*;
class FileMerger
{
	public static void main(String args[]) throws IOException
	{
		String fname;
		Console con=System.console();
		System.out.println("Enter the name of the file you want to merge ");
		fname=con.readLine();
		FileOutputStream fos=new FileOutputStream("C:/Users/HP/Documents/java programs/Files/Splitted/"+fname);
		int i=1;
			while(true)
			{
				File f=new File("C:/Users/HP/Documents/java programs/Files/Splitted/"+i+"."+fname);
					if(f.exists())
					{
						FileInputStream fis=new FileInputStream(f);
						int ch;
						while((ch=fis.read())!=-1)
							fos.write(ch);
						i++;
						fis.close();
						f.delete();
					}
					else
						break;
				fos.close();
			}
	}
}