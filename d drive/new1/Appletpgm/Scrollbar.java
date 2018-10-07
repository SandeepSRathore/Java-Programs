import java.awt.*;
class Scrollbar
{
public static void main(String args[])
	{
	Frame f=new Frame(); f.setSize(400,400); 
	
	Panel p1=new Panel();
	BorderLayout b=new BorderLayout();
	GridLayout g=new GridLayout(0,3);
	p1.setLayout(g);
	Scrollbar sb=new Scrollbar(Scrollbar.VERTICAL,50,10,0,400);
	Scrollbar sb1=new Scrollbar(Scrollbar.VERTICAL,75,20,0,400);
	Scrollbar sb2=new Scrollbar(Scrollbar.VERTICAL,100,30,0,400);
	p1.add(sb);
	p1.add(sb1);
	p1.add(sb2);
	f.add(p1,BorderLayout.EAST);
	
	
	
	
	f.setVisible(true);
	}
}
	
	
