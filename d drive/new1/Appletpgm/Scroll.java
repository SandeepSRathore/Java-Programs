import java.awt.*;
class Scroll
{
public static void main(String args[])
	{
	Frame f=new Frame(); f.setSize(400,300); 
	
	Panel p1=new Panel();
	BorderLayout b=new BorderLayout();
	GridLayout g=new GridLayout(0,3);
	p1.setLayout(g);
	Scrollbar sb=new Scrollbar(Scrollbar.VERTICAL,50,10,0,300);
	Scrollbar sb1=new Scrollbar(Scrollbar.VERTICAL,75,20,0,300);
	Scrollbar sb2=new Scrollbar(Scrollbar.VERTICAL,100,30,0,300);
	p1.add(sb);
	p1.add(sb1);
	p1.add(sb2);
	f.add(p1,BorderLayout.EAST);
	
	
	
	
	f.setVisible(true);
	}
}
	
	
