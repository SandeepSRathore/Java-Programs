import java.awt.*;
import java.awt.event.*;
class Ques extends WindowAdapter
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(600,400);
		f.setVisible(true);
		f.setLayout(new GridLayout(3,1));
		Panel q=new Panel();
		Panel a=new Panel();
		Panel d=new Panel();
		f.add(q);
		f.add(a);
		f.add(d);
		q.setLayout(new FlowLayout(FlowLayout.LEFT));
		Label ques=new Label("Ques.1  What is the capital of Rajasthan ?");
		ques.setFont(new Font("Arial",Font.BOLD,22));
		q.add(ques);
		a.setLayout(new GridLayout(4,0));
		Panel a1=new Panel();
		Panel a2=new Panel();
		Panel a3=new Panel();
		Panel a4=new Panel();
		a.add(a1);	a1.setLayout(new FlowLayout(FlowLayout.LEFT));
		a.add(a2);	a2.setLayout(new FlowLayout(FlowLayout.LEFT));
		a.add(a3);	a3.setLayout(new FlowLayout(FlowLayout.LEFT));
		a.add(a4);	a4.setLayout(new FlowLayout(FlowLayout.LEFT));
		CheckboxGroup ans=new CheckboxGroup();
		Label l1=new Label("A");
		Checkbox cb1=new Checkbox("Ajmer",ans,false);
		a1.add(l1);
		a1.add(cb1);
		Label l2=new Label("B");
		Checkbox cb2=new Checkbox("Jodhpur",ans,false);
		a2.add(l2);
		a2.add(cb2);
		Label l3=new Label("C");
		Checkbox cb3=new Checkbox("Jaipur",ans,false);
		a3.add(l3);
		a3.add(cb3);
		Label l4=new Label("D");
		Checkbox cb4=new Checkbox("Bikaner",ans,false);
		a4.add(l4);
		a4.add(cb4);
		Button b1=new Button("Prev");
		Button b2=new Button("Next");
		d.add(b1);
		d.add(b2);
		f.addWindowListener(this);
		
		public void windowClosing(WindowEvent we)
		{
			Window w=we.getWindow();
			w.setVisible(false);
			w.dispose();
			System.exit(1);
		}
	}
	
}