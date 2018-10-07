import java.awt.*;
import java.awt.event.*;
class ColoredLines extends WindowAdapter implements MouseMotionListener
{
	Frame f;
	Panel p;
	Graphics g;
	public ColoredLines()
	{
		f=new Frame();
		f.setSize(800,600);
		f.setVisible(true);
		f.addWindowListener(this);
		g=f.getGraphics();
		f.addMouseMotionListener(this);
	}
	public void windowClosing(WindowEvent we)
	{
		Window w=we.getWindow();
		w.setVisible(false);
		w.dispose();
		System.exit(1);
	}
	public void mouseMoved(MouseEvent m1)
	{
		Dimension d=f.getSize();
		int x,y;
		x=m1.getX();
		y=m1.getY();
		g.setColor(Color.red);
		g.drawLine(x,y,0,0);
		g.setColor(Color.green);
		g.drawLine(x,y,d.width,0);
		g.setColor(Color.yellow);
		g.drawLine(x,y,d.width,d.height);
		g.setColor(Color.blue);
		g.drawLine(x,y,0,d.height);	
	}
	public void mouseDragged(MouseEvent m2){}
	public static void main(String args[])
	{
		ColoredLines cl=new ColoredLines();
	}
}