import java.awt.*;
class Quiz
{
public static void main(String args[])
	{
	Frame f=new Frame();  f.setSize(400,300);
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	BorderLayout b=new BorderLayout();
	p1.setLayout(b);
	
	Label l1=new Label("Q. Capital of Rajasthan?");
	p1.add(l1);
	f.add(p1,BorderLayout.NORTH);

	GridLayout g=new GridLayout(4,0);
	p2.setLayout(g);
	
	Checkbox c1=new Checkbox("Ajmer");
	Checkbox c2=new Checkbox("Jodhpur");
	Checkbox c3=new Checkbox("Jaipur");
	Checkbox c4=new Checkbox("Bikaner");
	
	p2.add(c1);
	p2.add(c2);
	p2.add(c3);
	p2.add(c4);
	f.add(p2);

	Button b1=new Button("prev");
	Button b2=new Button("Next");
	p3.add(b1);
	p3.add(b2);
	f.add(p3,BorderLayout.SOUTH);

	f.setVisible(true);
	}
}
	