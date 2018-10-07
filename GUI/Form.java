import java.awt.*;
import java.awt.event.*;
class Form implements ActionListener
{
	Frame f;
	Panel p0,p1,p2,p3,p4,p5,p6;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
	Button b1,b2;
	CardLayout cl=new CardLayout();
	public Form()
	{
		f=new Frame();
		f.setSize(600,400);
		f.setVisible(true);
	
		p0=new Panel();
		p0.setLayout(new GridBagLayout());
		f.add(p0);
	
		p1=new Panel();
		p1.setLayout(new FlowLayout(FlowLayout.CENTER,50,5));
		Font fnt=new Font("Arial",Font.BOLD,20);
		b1=new Button("Back");
		b1.setFont(fnt);
		b1.addActionListener(this);
		b2=new Button("Next");
		b2.setFont(fnt);
		b2.addActionListener(this);
		p1.add(b1);
		p1.add(b2);
	
		p2=new Panel();
		p2.setLayout(cl);
	
		GridBagConstraints gbc=new GridBagConstraints();
		gbc.gridx=0;		gbc.gridy=0;		
		gbc.gridwidth=1;	gbc.gridheight=4;	
		p0.add(p2,gbc);
	
		gbc.gridx=0;		gbc.gridy=4;
		gbc.gridheight=1;	gbc.gridwidth=1;
		p0.add(p1,gbc);
		
		p3=new Panel();							p4=new Panel();								p5=new Panel();							p6=new Panel();
		p3.setLayout(new GridBagLayout());		p4.setLayout(new GridBagLayout());			p5.setLayout(new GridBagLayout());		p6.setLayout(new GridBagLayout());
	
		Label l1=new Label("Name");				Label l2=new Label("HNO.");					Label l3=new Label("Phone");			Label l4=new Label("Salary");
		l1.setFont(fnt);						l2.setFont(fnt);							l3.setFont(fnt);						l4.setFont(fnt);
		
		gbc.gridx=0;		gbc.gridy=0;		Insets i=new Insets(2,10,2,10);
		gbc.gridheight=1;	gbc.gridwidth=1;	gbc.insets=i;
		
		p3.add(l1,gbc);							p4.add(l2,gbc);								p5.add(l3,gbc);							p6.add(l4,gbc);
		t1=new TextField(30);					t2=new TextField(30);						t3=new TextField(30);					t4=new TextField(30);
		t1.setFont(fnt);						t2.setFont(fnt);							t3.setFont(fnt);						t4.setFont(fnt);
		
		gbc.gridx=1;
		
		p3.add(t1,gbc);							p4.add(t2,gbc);								p5.add(t3,gbc);							p6.add(t4,gbc);
		Label l5=new Label("Surname");			Label l6=new Label("Colony");				Label l7=new Label("Mobile");			Label l8=new Label("T.A.");
		l5.setFont(fnt);						l6.setFont(fnt);							l7.setFont(fnt);						l8.setFont(fnt);
		
		gbc.gridx=0;	gbc.gridy=1;
		
		p3.add(l5,gbc);							p4.add(l6,gbc);								p5.add(l7,gbc);							p6.add(l8,gbc);
		t5=new TextField(30);					t6=new TextField(30);						t7=new TextField(30);					t8=new TextField(30);
		t5.setFont(fnt);						t6.setFont(fnt);							t7.setFont(fnt);						t8.setFont(fnt);
		
		gbc.gridx=1;
			
		p3.add(t5,gbc);							p4.add(t6,gbc);								p5.add(t7,gbc);							p6.add(t8,gbc);
		Label l9=new Label("Age");				Label l10=new Label("City");				Label l11=new Label("Email");			Label l12=new Label("D.A.");
		l9.setFont(fnt);						l10.setFont(fnt);							l11.setFont(fnt);						l12.setFont(fnt);
		
		gbc.gridx=0;	gbc.gridy=2;
		
		p3.add(l9,gbc);							p4.add(l10,gbc);							p5.add(l11,gbc);						p6.add(l12,gbc);
		t9=new TextField(30);					t10=new TextField(30);						t11=new TextField(30);					t12=new TextField(30);
		t9.setFont(fnt);						t10.setFont(fnt);							t11.setFont(fnt);						t12.setFont(fnt);
		
		gbc.gridx=1;
		
		p3.add(t9,gbc);							p4.add(t10,gbc);							p5.add(t11,gbc);						p6.add(t12,gbc);
		Label l13=new Label("Qualification");	Label l14=new Label("State");				Label l15=new Label("Fax");				Label l16=new Label("H.R.A.");
		l13.setFont(fnt);						l14.setFont(fnt);							l15.setFont(fnt);						l16.setFont(fnt);
		
		gbc.gridx=0;	gbc.gridy=3;
		
		p3.add(l13,gbc);						p4.add(l14,gbc);							p5.add(l15,gbc);						p6.add(l16,gbc);
		t13=new TextField(30);					t14=new TextField(30);						t15=new TextField(30);					t16=new TextField(30);
		t13.setFont(fnt);						t14.setFont(fnt);							t15.setFont(fnt);						t16.setFont(fnt);
		
		gbc.gridx=1;
		
		p3.add(t13,gbc);							p4.add(t14,gbc);							p5.add(t15,gbc);						p6.add(t16,gbc);
		
		p2.add(p3,"panel3");					p2.add(p4,"panel4");						p2.add(p5,"panel5");					p2.add(p6,"panel6");
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		if(str.equals("Next"))
			cl.next(p2);
		else
			cl.previous(p2);	
	}
	public static void main(String args[])
	{
		Form form=new Form();
	}
}