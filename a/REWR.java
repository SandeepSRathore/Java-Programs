import java.io.*;
import static java.io.StreamTokenizer.*;
public class REWR implements Runnable
{
static int total;
static File f;
private boolean flag=true;
synchronized public void setData(int i)
{
while(flag)
{
flag=false;
total=i;
notify();
}
try
{
wait();
}
catch(Exception e)
{}
}
synchronized public int getData()
{
while(flag)
{
try
{
wait();
}
catch(Exception e)
{}
}
notify();
flag=false;
return total;
}
public static void main()throws Exception
{
System.out.print("Enter the directory");
f=new File("F:\\java programs\\a\\Demo1.java");
File f1[]=f.listFiles();
Thread t[]=new Thread[f1.length];
System.out.print(t.length);
REWR r=new REWR();
int sum=0;
for(int i=0;i<f1.length;i++)
{
t[i]=new Thread(r,f1[i].getName());
t[i].start();
sum+=r.getData();
}
FileOutputStream fos=new FileOutputStream("input.txt");
char ch[]=(String.valueOf(sum).toCharArray());
for(int i=0;i<ch.length;i++)
fos.write((byte)ch[i]);
fos.close();
}
public void run()
{
Thread th=Thread.currentThread();
try
{
StreamTokenizer st=new StreamTokenizer(new FileInputStream(f+"//"+th.getName()));
int s4=0;
while(st.nextToken()!=TT_EOF)
{
switch(st.ttype)
{
case TT_NUMBER:
s4+=st.nval;
}
}
setData(s4);
}
catch(Exception e)
{}
}
}