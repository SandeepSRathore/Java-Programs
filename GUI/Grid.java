import java.awt.*;
class Grid
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(600,400);
		f.setVisible(true);
		f.setLayout(new GridLayout(2,2));
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		Button b6=new Button("6");
		Button b7=new Button("7");
		Button b8=new Button("8");
		Button b9=new Button("9");
		Button b10=new Button("10");
		Button b11=new Button("11");
		Button b12=new Button("12");
		Button b13=new Button("13");
		Button b14=new Button("14");
		Button b15=new Button("15");
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		Panel p4=new Panel();
		f.add(p1);
		f.add(p2);
		f.add(p3);
		f.add(p4);
		p1.setLayout(new GridLayout(2,0));
		p1.add(b1);
		p1.add(b2);
		p2.setLayout(new GridLayout(0,3));
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p3.setLayout(new GridLayout(0,2));
		Panel p3_1=new Panel();
		Panel p3_2=new Panel();
		p3.add(p3_1);
		p3.add(p3_2);
		p3_1.setLayout(new GridLayout(2,0));
		p3_2.setLayout(new GridLayout(3,0));
		p3_1.add(b6);
		p3_1.add(b7);
		p3_2.add(b8);
		p3_2.add(b9);
		p3_2.add(b10);
		p4.setLayout(new GridLayout(2,0));
		Panel p4_1=new Panel();
		Panel p4_2=new Panel();
		p4.add(p4_1);
		p4.add(p4_1);
		p4_1.setLayout(new GridLayout(0,2));
		p4_2.setLayout(new GridLayout(0,3));
		p4.add(p4_1);
		p4.add(p4_2);
		p4_1.add(b11);
		p4_1.add(b12);
		p4_2.add(b13);
		p4_2.add(b14);
		p4_2.add(b15);
	}
}