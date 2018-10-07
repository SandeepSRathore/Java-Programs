import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
	Frame f;
	Panel p1,p2;
	TextField t;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	String s1;
	public Calculator()
	{
	f=new Frame();           f.setSize(300,200);
	p1=new Panel();
	p2=new Panel();
	t=new TextField();
	BorderLayout b=new BorderLayout();
	 p1.setLayout(b);
	f.add(t,"North");
	

	GridLayout g=new GridLayout(4,4);
	p2.setLayout(g);
	
	
	
	b1=new Button("1");
	b1.addActionListener(this);
	b2=new Button("2");
	b2.addActionListener(this);
	b3=new Button("3");
	b3.addActionListener(this);
	b4=new Button("4");
	b4.addActionListener(this);
	b5=new Button("5");
	b5.addActionListener(this);
	b6=new Button("6");
	b6.addActionListener(this);
	b7=new Button("7");
	b7.addActionListener(this);
	b8=new Button("8");
	b8.addActionListener(this);
	b9=new Button("9");
	b9.addActionListener(this);
	b10=new Button("0");
	b10.addActionListener(this);
	b11=new Button("+");
	b11.addActionListener(this);
	b12=new Button("-");
	b12.addActionListener(this);
	b13=new Button("*");
	b13.addActionListener(this);
	b14=new Button("/");
	b14.addActionListener(this);
	b15=new Button("=");
	b15.addActionListener(this);
	b16=new Button("c");
	b16.addActionListener(this);

	p2.add(b1);
	p2.add(b2);
	p2.add(b3);
	p2.add(b11);

	p2.add(b4);
	p2.add(b5);
	p2.add(b6);
	p2.add(b12);

	p2.add(b7);
	p2.add(b8);
	p2.add(b9);
	p2.add(b13);

	p2.add(b16);
	p2.add(b10);
	p2.add(b14);
	p2.add(b15);

	f.add(p1);
	f.add(p2);


	f.setVisible(true);

	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("1"))
		{
			t.setText("1");
		}
		else if(str.equals("2"))
		{
			t.setText("2");
		}
		else if(str.equals("3"))
		{
			t.setText("3");
		}
		else if(str.equals("4"))
		{
			t.setText("4");
		}
		else if(str.equals("5"))
		{
			t.setText("5");
		}
		else if(str.equals("6"))
		{
			t.setText("6");
		}
		else if(str.equals("7"))
		{
			t.setText("7");
		}
		else if(str.equals("8"))
		{
			t.setText("8");
		}
		else if(str.equals("9"))
		{
			t.setText("9");
			
		}
		else if(str.equals("0"))
		{
			t.setText("");
		}
		else if(str.equals("+"))
		{
			
		}
		
		else if(str.equals("-"))
		{
			
		}
		
		else if(str.equals("*"))
		{
			
		}
		
		else if(str.equals("/"))
		{
			
		}
	
		else if(str.equals("="))
		{
			
		}
		
		else if(str.equals("c"))
		{
			t.setText(null);
		}
	}
	public static void main(String []args)
	{
		Calculator cl=new Calculator();
	}
	
}
	