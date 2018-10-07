import javax.swing.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class banksimulator implements ActionListener
{
	JFrame f;
	JMenuBar mb;
	JMenu acc,tra;
	ResultSet rs;
	JDesktopPane desktop;
	JInternalFrame jif1,jif2,jif3,jif4;
	JPanel p1,p2,p3,p4,p5,p6,p7;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
	static int a=0,i,i1,i2,i3,bln,b;
	static String nem;
	JDialog e1;
	Statement stmt;
    public banksimulator() 
    {
    	f=new JFrame();
    	f.setSize(400,400);
    	mb=new JMenuBar();
    	String AccItem[]={"New","Close Acc","Exit"};
    	String TraItem[]={"Deposit","Withdraw"};
    	acc=new JMenu("Account");
    	tra=new JMenu("Transs");
    	for(int i=0;i<AccItem.length;i++)
    	{
    		JMenuItem m1=new JMenuItem(AccItem[i]);
    		m1.addActionListener(this);
    		acc.add(m1);
    	}
    	for(int i=0;i<TraItem.length;i++)
    	{
    		JMenuItem m2=new JMenuItem(TraItem[i]);
    		m2.addActionListener(this);
    		tra.add(m2);
    	}    	    	
    	mb.add(acc);	mb.add(tra);
    	f.setJMenuBar(mb);
    
    	try
    	{
    		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/bank?user=root&password=root";
			Connection con=DriverManager.getConnection(url);	
			stmt=con.createStatement();
    	}
    	catch(Exception ex)
    	{
    	
    	}
    	desktop=new JDesktopPane();
		f.add(desktop);
		jif1=new JInternalFrame("New Account",true,true,true,true);
		jif1.setLocation(0,0);
		jif1.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jif1.setSize(200,200);
		p1=new JPanel();
		p1.setLayout(new GridLayout(3,2));
		l1=new JLabel("Account No.");
		t1=new JTextField(10);
		t1.addActionListener(this);
		l2=new JLabel("Name");
		t2=new JTextField(10);
		t2.addActionListener(this);
		l3=new JLabel("Amount");
		t3=new JTextField(10);
		t3.addActionListener(this);
		p1.add(l1);	p1.add(t1);	p1.add(l2);	p1.add(t2);	p1.add(l3);	p1.add(t3);
		jif1.add(p1);
		p2=new JPanel();
		b1=new JButton("Save");
		b1.addActionListener(this);
		b2=new JButton("Cancel");
		b2.addActionListener(this);
		b3=new JButton("Close");
		b3.addActionListener(this);
		p2.add(b1);	p2.add(b2);	p2.add(b3);
		jif1.add(p1,"North");
		jif1.add(p2,"South");
		desktop.add(jif1);
		
		jif2=new JInternalFrame("Deposit Account",true,true,true,true);
		jif2.setLocation(200,0);
		jif2.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jif2.setSize(200,200);
		p3=new JPanel();
		p3.setLayout(new GridLayout(4,2));
		l4=new JLabel("Account No.");
		t4=new JTextField(10);
		t4.addActionListener(new TextFieldAction1());
		l5=new JLabel("Name");
		t5=new JTextField(10);
		t5.addActionListener(this);
		l6=new JLabel("Balance");
		t6=new JTextField(10);
		t6.addActionListener(new TextFieldAction1());
		l7=new JLabel("Amount");
		t7=new JTextField(10);
		t7.addActionListener(new TextFieldAction1());
		p3.add(l4);	p3.add(t4);	p3.add(l5);	p3.add(t5);	p3.add(l6);	p3.add(t6);	p3.add(l7);	p3.add(t7);	
		jif2.add(p3,"North");
		p4=new JPanel();
		b4=new JButton("Update");
		b4.addActionListener(this);
		b5=new JButton("Cancel");
		b5.addActionListener(this);
		b6=new JButton("Close");
		b6.addActionListener(this);
		p4.add(b4);	p4.add(b5);	p4.add(b6);
		jif2.add(p4,"South");
		desktop.add(jif2);
				
		jif3=new JInternalFrame("Delete Account",true,true,true,true);
		jif3.setLocation(0,200);
		jif3.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jif3.setSize(200,200);
		p5=new JPanel();
		p5.setLayout(new GridLayout(3,2));
		l8=new JLabel("Account No.");
		t8=new JTextField(10);
		t8.addActionListener(new TextFieldAction());
		l9=new JLabel("Name");
		t9=new JTextField(10);
		t9.addActionListener(this);
		l10=new JLabel("Balance");
		t10=new JTextField(10);
		t10.addActionListener(this);
		p5.add(l8);	p5.add(t8);	p5.add(l9);	p5.add(t9);	p5.add(l10);	p5.add(t10);
		jif1.add(p5);
		p6=new JPanel();
		b7=new JButton("Delete");
		b7.addActionListener(this);
		b8=new JButton("Cancel");
		b8.addActionListener(this);
		b9=new JButton("Close");
		b9.addActionListener(this);
		p6.add(b7);	p6.add(b8);	p6.add(b9);
		jif3.add(p5,"North");
		jif3.add(p6,"South");
		desktop.add(jif3);		 
			
			
		jif4=new JInternalFrame("Withdrawl Account",true,true,true,true);
		jif4.setLocation(200,200);
		jif4.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		jif4.setSize(200,200);
		p6=new JPanel();
		p6.setLayout(new GridLayout(4,2));
		l11=new JLabel("Account No.");
		t11=new JTextField(10);
		t11.addActionListener(new TextFieldAction2());
		l12=new JLabel("Name");
		t12=new JTextField(10);
		t12.addActionListener(this);
		l13=new JLabel("Balance");
		t13=new JTextField(10);
		t13.addActionListener(new TextFieldAction2());
		l14=new JLabel("Amount");
		t14=new JTextField(10);
		t14.addActionListener(new TextFieldAction2());
		p6.add(l11);	p6.add(t11);	p6.add(l12);	p6.add(t12);	p6.add(l13);	p6.add(t13);	p6.add(l14);	p6.add(t14);	
		jif4.add(p6,"North");
		p7=new JPanel();
		b10=new JButton("Update");
		b10.addActionListener(this);
		b11=new JButton("Cancel");
		b11.addActionListener(this);
		b12=new JButton("Close");
		b12.addActionListener(this);
		p7.add(b10);	p7.add(b11);	p7.add(b12);
		jif4.add(p7,"South");
		desktop.add(jif4);
		f.setVisible(true);
    }
    class TextFieldAction implements ActionListener
    {
    	public void actionPerformed(ActionEvent e1)
    	{
    		System.out.println("Process here");
    		if(!t8.getText().equals(""))
    		{
    			i1=Integer.parseInt(t8.getText());
    		}
    		try
    		{
    		
    			rs=stmt.executeQuery("select name,balance from account where accno="+i1);
				
				if(rs.next())
				{	
					nem=rs.getString("name");
					bln=rs.getInt("balance");
					t9.setText(nem);
					t10.setText(bln+"");
				}   
				else
				{
					JOptionPane.showMessageDialog(f,"Your entry is invelid account","Error",JOptionPane.ERROR_MESSAGE);
				}
    		}
    		catch(Exception p)
    		{	
    			p.printStackTrace();

    		}

    		
    	}
    }
    class TextFieldAction1 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e2)
    	{
    		System.out.println("Process here for deposit");
    		if(!t4.getText().equals(""))
    		{
    			i2=Integer.parseInt(t4.getText());
    		}
    		try
    		{
    		
    			rs=stmt.executeQuery("select name,balance from account where accno="+i2);
				
				if(rs.next())
				{
					nem=rs.getString("name");
					bln=rs.getInt("balance");
					t5.setText(nem);
					t6.setText(bln+"");
				}   
				else
				{
					JOptionPane.showMessageDialog(f,"Your entry is invelid account","Error",JOptionPane.ERROR_MESSAGE);
				}
    		}
    		catch(Exception p)
    		{	
    			p.printStackTrace();

    		}
    		
       	}
    }
    class TextFieldAction2 implements ActionListener
    {
    	public void actionPerformed(ActionEvent e3)
    	{
    		System.out.println("Process here for withdraw");
    		if(!t11.getText().equals(""))
    		{
    			i3=Integer.parseInt(t11.getText());
    		}
    		try
    		{
    		
    			rs=stmt.executeQuery("select name,balance from account where accno="+i3);
				
				if(rs.next())
				{
					nem=rs.getString("name");
					bln=rs.getInt("balance");
					t12.setText(nem);
					t13.setText(bln+"");
				}   
				else
				{
					JOptionPane.showMessageDialog(f,"Your entry is invelid account","Error",JOptionPane.ERROR_MESSAGE);
				}
    		}
    		catch(Exception p)
    		{	
    			p.printStackTrace();

    		}
    		
       	}
    }
    public void actionPerformed(ActionEvent e)
    {
    	String s1=e.getActionCommand();
    	Object o=e.getSource();
    	if(s1.equals("New"))
    	{
    		jif1.setVisible(true);
    		try
    		{
    		
    			rs=stmt.executeQuery("select * from account");
				
				if(rs.last())
				{	
					a=rs.getInt("accno");
				}   
				t1.setText((++a)+"");
				t1.setEditable(false);
    		}
    		catch(Exception p)
    		{	
    			p.printStackTrace();

    		}
    	}
    	if(s1.equals("Close Acc"))
    	{
    		jif3.setVisible(true);
    		t9.setEditable(false);
			t10.setEditable(false);
    	}
    	if(s1.equals("Exit"))
    	{
    		System.exit(1);
    	}
    	if(s1.equals("Deposit"))
    	{
    		jif2.setVisible(true);
    		t5.setEditable(false);
    		t6.setEditable(false);
    	}
    	if(s1.equals("Withdraw"))
    	{
    		jif4.setVisible(true);
    		t12.setEditable(false);
    		t13.setEditable(false);
    	}
    	if(s1.equals("Save"))
    	{	
    		if(t2.getText().equals(""))
    		{
    			JOptionPane.showMessageDialog(f,"Your entry is invelid","Error",JOptionPane.ERROR_MESSAGE);
    		}
    		if(t3.getText().equals(""))
    		{	
    			JOptionPane.showMessageDialog(f,"Your entry is invelid","Error",JOptionPane.ERROR_MESSAGE);
    		}
    		else
    		if(!t2.getText().equals("")&!t3.getText().equals(""))
    		{
    			nem=t2.getText();
    			try
    			{
    				bln=Integer.parseInt(t3.getText());
    			}
    			catch(NumberFormatException yu)
    			{
    				JOptionPane.showMessageDialog(f,"Your entry is invelid","Error",JOptionPane.ERROR_MESSAGE);
    				t3.setText(null);
    				return;
    			}    			
    			try
    			{
    			String insert_query="insert into account(accno,name,balance)"+
    							"values("+i+",'"+nem+"','"+bln+"')";
    			stmt.execute(insert_query);
    			t1.setText((++a)+"");
    			t2.setText(null);
    			t3.setText(null);
    			}
    			catch(Exception ex)
    			{
    				
    			}
    		}
    	}
    		if(s1.equals("Delete"))
    		{	
    			try
    			{	
    				String del_query="delete from account where accno="+i1;
    				stmt.execute(del_query);
    				t8.setText(null);
    				t9.setText(null);
    				t10.setText(null);
    				if(i1==i2)
    				{
    					t4.setText(null);
    					t5.setText(null);
    					t6.setText(null);
    					t7.setText(null);
    				}
    				if(i1==i3)
    				{
    					t11.setText(null);
    					t12.setText(null);
    					t13.setText(null);
    					t14.setText(null);
    				}
    	  		}
    	  		catch(Exception ex)
    			{
    				
    			}
    		}
    		if(e.getSource()==b4)
    		{
    			if(!t7.getText().equals(""))
    			{
    				try
    				{
    					b=Integer.parseInt(t7.getText());
    					System.out.println(b+"b is");
    				}
    				catch(NumberFormatException yu)
    				{
    					JOptionPane.showMessageDialog(f,"Your entry is invelid","Error",JOptionPane.ERROR_MESSAGE);
    					t14.setText(null);
    					return;
    				}    		
    			}
    			else
    			{
    				JOptionPane.showMessageDialog(f,"Enter ammount","Error",JOptionPane.ERROR_MESSAGE);
    			}

    			try
    			{
    				System.out.println(i+" acc and b="+b);
    				bln+=b;
    				String update_query="update account set balance="+bln+" where accno="+i2;
    				stmt.execute(update_query);
    				System.out.println("again");
    				b=0;
    				t6.setText(bln+"");
    				t7.setText(null);
    				if(i2==i1)
    				{
    					t10.setText(bln+"");
    				}
    				if(i2==i3)
    				{
    					t13.setText(bln+"");
    				}	
    			}
    	  		catch(Exception ex)
    			{
    				ex.printStackTrace();
    				System.out.println(ex);
    			}
    			
    		}
    	if(e.getSource()==b10)
    	{
    		if(!t14.getText().equals(""))
    			{
    				try
    				{
    					b=Integer.parseInt(t14.getText());
    					System.out.println(b+"b is");
    				}
    				catch(NumberFormatException yu)
    				{
    					JOptionPane.showMessageDialog(f,"Your entry is invelid","Error",JOptionPane.ERROR_MESSAGE);
    					t14.setText(null);
    					return;
    				}    		
    			}
    			else
    			{
    				JOptionPane.showMessageDialog(f,"Enter ammount","Error",JOptionPane.ERROR_MESSAGE);
    			}

    			try
    			{
    				if(bln>=b)	
    				{
    					bln-=b;
    					String update_query="update account set balance="+bln+" where accno="+i3;
    					stmt.execute(update_query);
    					System.out.println("again");
    						b=0;
    					t13.setText(bln+"");
    					t14.setText(null);
    				if(i3==i1)
    				{
    					t10.setText(bln+"");
    				}
    				if(i3==i2)
    				{
    					t6.setText(bln+"");
    				}
    				}
    				else
    				{
    					JOptionPane.showMessageDialog(f,"Your ammount is invelid","Error",JOptionPane.ERROR_MESSAGE);
    					t14.setText(null);
    					return;
    				}	
    			}
    	  		catch(Exception ex)
    			{
    				ex.printStackTrace();
    				System.out.println(ex);
    			}
    	}
    	if(e.getSource()==b2)
    	{
    		t2.setText(null);
    		t3.setText(null);
       	}
       	if(e.getSource()==b5)
    	{
    		t4.setText(null);
    		t5.setText(null);
    		t6.setText(null);
    		System.out.println("in cancel");
    		t7.setText(null);
       	}
       	if(e.getSource()==b8)
    	{
    		t8.setText(null);
    		t9.setText(null);
    		t10.setText(null);
       	}
       	if(e.getSource()==b11)
    	{
    		t11.setText(null);
    		t12.setText(null);
    		t13.setText(null);
    		t14.setText(null);
       	}
       	if(e.getSource()==b3)
       	{
       		jif1.setVisible(false);
       	
       	}
       	if(e.getSource()==b6)
       	{
       		jif2.setVisible(false);
       	}
       	if(e.getSource()==b9)
       	{
       		jif3.setVisible(false);
       	}
       	if(e.getSource()==b12)
       	{
       		jif4.setVisible(false);
       	}
    }
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{	
		try
		{
			banksimulator y=new banksimulator();
			//Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		//	DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		//	String url="jdbc:mysql://localhost:3306/bank?user=root&password=root";
		//	Connection con=DriverManager.getConnection(url);	
			//Connection con=DriverManager.getConnection("jdbc:odbc:mydsn");
	//		Statement stmt=con.createStatement();
		///	String insert_query="insert into account(accno,name,balance)"+
		//						"values("+i+",'"+nem+"','"+bal+"')";
		}
		catch(Exception e)	
		{
			e.printStackTrace();
			System.out.println("Error   :" +e.getMessage());
		}
	}   
    
}