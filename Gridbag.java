import  java.awt.*;
class Gridbag
{
	public static void main(String args[])
	{
	Frame f=new Frame();
	f.setSize(600,400);
	f.setVisible(true);
	f.setBackground(Color.orange);
	Panel p=new Panel();
	p.setLayout(new GridBagLayout());
	Insets i=new Insets(5,10,5,10);
	GridBagConstraints gbc=new GridBagConstraints();
	Font fnt=new Font("Times New Roman",Font.ITALIC+Font.BOLD,30);
	Label l1=new Label("NAME");
	l1.setForeground(Color.red);
	l1.setFont(fnt);
	gbc.gridx=0;		gbc.gridy=0;
	gbc.gridwidth=1;	gbc.gridheight=1;
//	gbc.ipadx=5;		gbc.ipady=2;
//	gbc.weightx=1;		gbc.weighty=1;
	gbc.insets=i;	//	gbc.anchor=GridBagConstraints.EAST;
	p.add(l1,gbc);
	TextField t1=new TextField(30);
	t1.setBackground(Color.lightGray);
	t1.setForeground(Color.red);
	gbc.gridx=1;		gbc.gridy=0;
	gbc.gridwidth=1;	gbc.gridheight=1;
	gbc.ipadx=5;		gbc.ipady=10;
//	gbc.weightx=1;		gbc.weighty=1;
	gbc.insets=i;	//	gbc.anchor=GridBagConstraints.EAST;
	p.add(t1,gbc);
	Label l2=new Label("PASSWORD");
	l2.setFont(fnt);
	l2.setForeground(Color.red);
	gbc.gridx=0;		gbc.gridy=1;
	gbc.gridwidth=1;	gbc.gridheight=1;
//	gbc.ipadx=70;		gbc.ipady=35;
//	gbc.weightx=1;		gbc.weighty=1;
	gbc.insets=i;		//gbc.anchor=GridBagConstraints.EAST;
	p.add(l2,gbc);
	TextField t2=new TextField(30);
	t2.setBackground(Color.lightGray);
	t2.setForeground(Color.red);
	t2.setEchoChar('*');
	gbc.gridx=1;		gbc.gridy=1;
	gbc.gridwidth=1;	gbc.gridheight=1;
	gbc.ipadx=5;		gbc.ipady=10;
//	gbc.weightx=1;		gbc.weighty=1;
	gbc.insets=i;		//gbc.anchor=GridBagConstraints.WEST;
	p.add(t2,gbc);
	Button b1=new Button("OK");
	b1.setFont(new Font("Arial",Font.BOLD,20));
	gbc.gridx=0;		gbc.gridy=2;
	gbc.gridwidth=2;	gbc.gridheight=1;
	gbc.ipadx=300;		gbc.ipady=30;
//	gbc.weightx=1;		gbc.weighty=1;
	p.add(b1,gbc);
	f.add(p);
	}
}