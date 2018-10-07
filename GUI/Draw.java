import java.awt.*;
import java.awt.event.*;
class Draw extends WindowAdapter implements MouseMotionListener
{
	Frame f;
	Graphics g;
	int x1,x2,y1,y2,c=0;
	public Draw()
	{
		f=new Frame();
		f.setSize(800,600);
		f.setVisible(true);
		g=f.getGraphics();
		f.addMouseMotionListener(this);
		f.addWindowListener(this);
	}
	public void windowClosing(WindowEvent we)
	{
		Window w=we.getWindow();
		w.setVisible(false);
		w.dispose();
		System.exit(1);
	}
	public void mouseDragged(MouseEvent m2)
	{
		x1=m2.getX();
		y1=m2.getY();
		g.drawLine(x1,y1,x2,y2);
		x2=x1;
		y2=y1;
	}
	public void mouseMoved(MouseEvent m1)
	{
		x2=m1.getX();
		y2=m1.getY();
	}
	public static void main(String args[])
	{
		Draw d=new Draw();
	}
}