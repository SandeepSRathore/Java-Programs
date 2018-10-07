import java.awt.*;
import java.awt.event.*;
class Calculator extends WindowAdapter implements ActionListener
{
	Frame f;
	Panel p1,p2;
	Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bm,bs,bd,be,bc;
	TextField t;
	float a,b,res;
	int l=1,c=0,e=0;
	String io="",fo="";
	public Calculator()
	{
		f=new Frame();
		f.setSize(300,380);
		f.setVisible(true);
		f.addWindowListener(this);
		p1=new Panel();
		p1.setLayout(new GridLayout(1,1));
		t=new TextField("0",300);
		p1.add(t);
		f.add(p1,BorderLayout.NORTH);
		p2=new Panel();
		f.add(p2);
		p2.setLayout(new GridLayout(4,4));
		b0=new Button("0");	b0.addActionListener(this);
		b1=new Button("1");	b1.addActionListener(this);
		b2=new Button("2");	b2.addActionListener(this);
		b3=new Button("3");	b3.addActionListener(this);
		b4=new Button("4");	b4.addActionListener(this);
		b5=new Button("5");	b5.addActionListener(this);
		b6=new Button("6");	b6.addActionListener(this);
		b7=new Button("7");	b7.addActionListener(this);
		b8=new Button("8");	b8.addActionListener(this);
		b9=new Button("9");	b9.addActionListener(this);
		ba=new Button("+");	ba.addActionListener(this);
		bs=new Button("-");	bs.addActionListener(this);
		bm=new Button("*");	bm.addActionListener(this);
		bd=new Button("/");	bd.addActionListener(this);
		be=new Button("=");	be.addActionListener(this);
		bc=new Button("C");	bc.addActionListener(this);
		p2.add(b1);	
		p2.add(b2);
		p2.add(b3);
		p2.add(ba);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(bs);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(bm);
		p2.add(bc);
		p2.add(b0);
		p2.add(be);
		p2.add(bd);
	}
	public void windowClosing(WindowEvent we)
	{
		Window w=we.getWindow();
		w.setVisible(false);
		w.dispose();
		System.exit(1);
	}
	public void actionPerformed(ActionEvent ev)
	{
		if(ev.getSource()==b0)
		{
			if(l==1)
			{
				t.setText("0");
				l=0;
			}
			else
			t.setText(t.getText()+"0");
		}
		else if(ev.getSource()==b1)
		{
			if(l==1)
			{
				t.setText("1");
				l=0;
			}
			else
			t.setText(t.getText()+"1");
		}
		else if(ev.getSource()==b2)
		{
			if(l==1)
			{
				t.setText("2");
				l=0;
			}
			else
			t.setText(t.getText()+"2");
		}
		else if(ev.getSource()==b3)
		{
			if(l==1)
			{
				t.setText("3");
				l=0;
			}
			else
			t.setText(t.getText()+"3");
		}
		else if(ev.getSource()==b4)
		{
			if(l==1)
			{
				t.setText("4");
				l=0;
			}
			else
			t.setText(t.getText()+"4");
		}
		else if(ev.getSource()==b5)
		{
			if(l==1)
			{
				t.setText("5");
				l=0;
			}
			else
			t.setText(t.getText()+"5");
		}
		else if(ev.getSource()==b6)
		{
			if(l==1)
			{
				t.setText("6");
				l=0;
			}
			else
			t.setText(t.getText()+"6");
		}
		else if(ev.getSource()==b7)
		{
			if(l==1)
			{
				t.setText("7");
				l=0;
			}
			else
			t.setText(t.getText()+"7");
		}
		else if(ev.getSource()==b8)
		{
			if(l==1)
			{
				t.setText("8");
				l=0;
			}
			else
			t.setText(t.getText()+"8");
		}
		else if(ev.getSource()==b9)
		{
			if(l==1)
			{
				t.setText("9");
				l=0;
			}
			else
			t.setText(t.getText()+"9");
		}
		else if(ev.getSource()==ba)
		{
			if(c==0)
			{
				a=Integer.parseInt(t.getText());
				io="+";
				l=1;
				c++;
			}
			else
			{
				if(e==1)
				{
					io="+";
				}
				else
				{
					fo="+";
					b=Integer.parseInt(t.getText());
					equal();
				}
				
			}
		}
		else if(ev.getSource()==bs)
		{
			if(c==0)
			{
				a=Integer.parseInt(t.getText());
				io="-";
				l=1;
				c++;
			}
			else
			{
				if(e==1)
				{
					io="-";
				}
				else
				{
					fo="-";
					b=Integer.parseInt(t.getText());
					equal();
				}
				
			}
		}
		else if(ev.getSource()==bm)
		{
			if(c==0)
			{
				a=Integer.parseInt(t.getText());
				io="*";
				l=1;
				c++;
			}
			else
			{
				if(e==1)
				{
					io="*";
				}
				else
				{
					fo="*";
					b=Integer.parseInt(t.getText());
					equal();
				}
			}
		}
		else if(ev.getSource()==bd)
		{
			if(c==0)
			{
				a=Integer.parseInt(t.getText());
				io="/";
				l=1;
				c++;
			}
			else
			{
				if(e==1)
				{
					io="/";
				}
				else
				{
					fo="/";
					b=Integer.parseInt(t.getText());
					equal();
				}
			}
		}
		else if(ev.getSource()==be)
		{
			b=Integer.parseInt(t.getText());
			equal();
			e=1;
		}
		else if(ev.getSource()==bc)
		{
			a=0;
			b=0;
			res=0;
			io="";
			fo="";
			c=0;
			l=1;
			e=0;
			t.setText("0");
		}
	}
	public void equal()
	{
		if(io.equals("+"))
			{
				res=a+b;
				a=res;
				io=fo;
				t.setText(res+"");
				l=1;
				e=0;
			} 
		else if(io.equals("-"))
			{
				res=a-b;
				a=res;
				io=fo;
				t.setText(res+"");
				l=1;
				e=0;
			}
		 else if(io.equals("*"))		
			{
				res=a*b;
				a=res;
				io=fo;
				t.setText(res+"");
				l=1;
				e=0;
			}
		else if(io.equals("/"))
			{
				if(b==0)
				{
					t.setText("Infinity");
					a=0;
					b=0;
					c=0;
					l=0;
					e=0;
					res=0;
					io="";
					fo="";
				}
				else
				{
					res=a/b;
					a=res;
					io=fo;
					t.setText(res+"");
					l=1;
					e=0;
				}
			}
	}					
	public static void main(String args[])
	{
		Calculator calci=new Calculator();
	}
}