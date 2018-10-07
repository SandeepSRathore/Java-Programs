import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Demo extends JPanel implements ActionListener
{
static ProgressMonitor ptr;
static int counter=0;
public Demo()
{
ptr=new ProgressMonitor(this,"Naveen jangir","Process Runnning...",10,50);
Timer t=new Timer(500,this);
t.start();
}
public void actionPerformed(ActionEvent e)
{
SwingUtilities.invokeLater(new Update());
}

class Update implements Runnable
{
public void run()
{
if(ptr.isCanceled())
{ptr.close(); System.exit(1);}
 ptr.setProgress(counter);
ptr.setNote("Operation"+counter+"% complete");
counter +=2;
}
}

}
