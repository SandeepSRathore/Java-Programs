import java.io.*;
class FileMerger 
{

 public static void merger(File file1) throws Exception
 {
  String str=new String();
  String str2= file1.getName();
  String str1= file1.getParent();
  String str3=file1.getPath();
  FileInputStream fis;
  FileOutputStream fos=new FileOutputStream(str3);
  for(int i=0; ;i++)
  {
   str= (str1+"/"+i+"."+str2);
   File f=new File(str);
   if(!f.exists())
    break;
   fis=new FileInputStream(str);
   int ch;
   while((ch=fis.read())!=-1)
    fos.write(ch);
   f.delete();
  }
 }


public static void main(String saurav[]) throws Exception
 {
  Console con = System.console();

  System.out.println("enter file to be retrived");
  String str_ret = new String();
  str_ret = con.readLine();
   File file = new File(str_ret);
  FileMerger.merger(file );
 }
}