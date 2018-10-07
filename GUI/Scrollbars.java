import java.awt.*;
class Scrollbars
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(800,600);
		f.setVisible(true);
		Panel p1=new Panel();
		GridLayout gl=new GridLayout(0,3);
		p1.setLayout(gl);
		Scrollbar sb1=new Scrollbar(Scrollbar.VERTICAL,100,10,0,600);
		sb1.setBackground(Color.RED);
		p1.add(sb1);
		Scrollbar sb2=new Scrollbar(Scrollbar.VERTICAL,300,10,0,600);
		sb2.setBackground(Color.ORANGE);
		p1.add(sb2);
		Scrollbar sb3=new Scrollbar(Scrollbar.VERTICAL,500,10,0,600);
		sb3.setBackground(Color.YELLOW);
		p1.add(sb3);
		f.add(p1,BorderLayout.EAST);		
	}
}