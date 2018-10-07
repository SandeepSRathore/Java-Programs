import java.io.*;
class FileSplitter 
	{
 		static public void splitter(File file ,int size ,int length) throws Exception
 		{
  			FileInputStream fis = new FileInputStream(file);
		        int ch,count=0,n=0;
  			for(int i=0;i<length;i+=size)
   			n++;
   			System.out.println(n);
   			String str1=file.getParent();
   			String str2=file.getName();
   			String str3=new String();
  			FileOutputStream fos[]=new FileOutputStream[n];
  			for(int i=0;i<n;i++)
  				{
   					str3= (str1+"/"+i+"."+str2);
   					fos[i]=new FileOutputStream(str3);
  				}
		        int i=0;
  			while(i<n)
  			{
  				while((ch=fis.read())!=-1)
  				{
   					fos[i].write(ch);
   					count++;
   					if(count>size-1)
   					{
    						count=0;
   						break;
   					}
  				}
  			i++;
  			}
  		fis.close();
  		file.delete();
                                             //System.out.println(file.getParent() + "     "+file.getPath()+" "+file.getName());
		 }
 public static void main(String sandy[]) throws Exception
 	{
  		Console con = System.console();
  		System.out.println("enter file name");
  		String str=new String();
  		str=con.readLine();
  		File file=new File(str);
  		int length = (int)file.length();
 		System.out.println(length);
  		System.out.println("enter size of destination file");
  		int size;
		size=Integer.parseInt(con.readLine());
		FileSplitter.splitter(file, size , length);
 	}
}