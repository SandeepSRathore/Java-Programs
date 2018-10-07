import java.awt.*;
class Numbers
{
public static void main(String args[])
	{
	Frame f=new Frame();  f.setSize(400,300);
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	Panel p4=new Panel();
	Panel p5=new Panel();
	Panel p6=new Panel();
	Panel p7=new Panel();
	Panel p8=new Panel();
	GridLayout g =new GridLayout(2,2);
	f.setLayout(g);
	GridLayout g1=new GridLayout(2,0);
	p1.setLayout(g1);
	Button b1=new Button("1");
	Button b2=new Button("2");
	p1.add(b1);
	p1.add(b2);
	f.add(p1);

	GridLayout g2=new GridLayout(0,3);
	p2.setLayout(g2);
	Button b3=new Button("3");
	Button b4=new Button("4");
	Button b5=new Button("5");
	p2.add(b3);
	p2.add(b4);
	p2.add(b5);
	f.add(p2);

	GridLayout g3=new GridLayout(0,2);
	p3.setLayout(g3);
	
	GridLayout g4=new GridLayout(2,0);
	p4.setLayout(g4);
	Button b6=new Button("6");
	Button b7=new Button("7");
	p4.add(b6);
	p4.add(b7);
	p3.add(p4);

	GridLayout g5=new GridLayout(3,0);
	p5.setLayout(g5);
	Button b8=new Button("8");
	Button b9=new Button("9");
	Button b10=new Button("10");
	p5.add(b8);
	p5.add(b9);
	p5.add(b10);
	p3.add(p5);
	f.add(p3);

	GridLayout g6=new GridLayout(2,2);
	p6.setLayout(g6);
	
	GridLayout g7=new GridLayout(0,2);
	p7.setLayout(g7);
	Button b11=new Button("11");
	Button b12=new Button("12");
	p7.add(b11);
	p7.add(b12);
	p6.add(p7);

	GridLayout g8=new GridLayout(0,3);
	p8.setLayout(g8);
	Button b13=new Button("13");
	Button b14=new Button("14");
	Button b15=new Button("15");
	p8.add(b13);
	p8.add(b14);
	p8.add(b15);
	p6.add(p8);

	f.add(p6);
		

		f.setVisible(true);
	}
}
	