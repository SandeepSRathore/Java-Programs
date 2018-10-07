import java.io.*;
class FileSplit
{

	public static void main(String args[])throws IOException
	{
		String str;
		int total=0,size,n,i,rem,count;
		Console con=System.console();
		System.out.print("Enter file name with path:- ");
		str=con.readLine();
	
		File f=new File(str);
		
		if(f.exists())
		{
			System.out.println("Size of file="+f.length());
		
			total=(int)(f.length());
		}
		else
		{
			System.out.print("Source file does not exist");
			System.exit(0);
		}
		
		System.out.print("Enter destination file size:-");
		size=Integer.parseInt(con.readLine());
		n=total/size;
		rem=total%size;	
			
		if(rem>0)
			n+=1;
		FileInputStream fis=new FileInputStream(f.getPath());

		File file;
		int ch;
	
		
			for(i=0;i<n;i++)
                          { 

                           try{   
                               	file=new File(f.getParent()+"//"+i+f.getName());
				      			file.createNewFile();
                              }
                              catch(IOException e)
                              {
                                   file=new File(i+f.getName());
                                   file.createNewFile();
                              }
                                
				FileOutputStream fos=new FileOutputStream(file);
				count=1;
				while((ch=fis.read())!=-1)
				{
					fos.write(ch);
					count++;
					if(count>size)
					{
						fos.close();
						break;
					}
				}
                                  
			}
		
		fis.close();
		f.delete();
            



	}



}