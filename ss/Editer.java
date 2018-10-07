import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
class Editer extends WindowAdapter implements ActionListener,TextListener,KeyListener
{			/////////////////////////INSTANCE VARIABLES//////////////////////////
	Frame f,ndoyouwant,odoyouwant,edoyouwant,find,replace;
	MenuBar mb;	
	Menu m1,m2;	
	MenuItem nw,opn,sv,svas,ext,fnd,fndrplce;	
		
	TextArea ta;	
	FileDialog fd1,fd2;	
	File fl1,fl2;		
	Panel p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;	
	Label l1,l2,l3,l4,l5,l6;	
	Button nsave,ndontsave,ncancel,osave,odontsave,ocancel,esave,edontsave,ecancel,b1,b2,b3,b4,b5,b6; 	
	int flag;
	boolean typed=false,user;	
	TextField t1,t2,t3;
	String Title="Untitled-Notepad";
	int start=0;
	int end=0;
	
	
	public Editer()
	{		//////////////// MAIN FRAME CREATION////////////////////////////////////////
	
		f=new Frame();
		f.setTitle("Untitled-Notepad");	f.setSize(600,600);
		ta=new TextArea();	
		f.add(ta);
		ta.addTextListener(this);
		mb=new MenuBar();
		m1=new Menu("File");
		m2=new Menu("Edit");
		nw=new MenuItem("New");
		opn=new MenuItem("Open");
		sv=new MenuItem("Save");
		svas=new MenuItem("SaveAS");
		ext=new MenuItem("Exit");
		fnd=new MenuItem("Find");
		fndrplce=new MenuItem("Find&Replace");
		
		fd1=new FileDialog(f,"OPEN",FileDialog.LOAD);
		fd1.setVisible(false);
		fd2=new FileDialog(f,"SAVE",FileDialog.SAVE);
		fd2.setVisible(false);
		
		m1.add(nw);	 
		m1.add(opn);	
		m1.add(sv);
		m1.add(svas);
		m1.addSeparator();	
		m1.add(ext);	
		m2.add(fnd);	
		m2.add(fndrplce);
		mb.add(m1);	
		mb.add(m2);	
		
		f.add(ta); 
		f.setMenuBar(mb);

					
		nw.addActionListener(this);
		opn.addActionListener(this);
		sv.addActionListener(this);
		svas.addActionListener(this);
		//ext.addActionListener(this);
		fnd.addActionListener(this);
		fndrplce.addActionListener(this);
		
				
		///////////////////////////NEW WALI DO U WANT TO SAVE
		ndoyouwant=new Frame();	
		ndoyouwant.setSize(400,200);	
		p1=new Panel();
		ndoyouwant.setLayout(new GridLayout(2,0));
		ndoyouwant.setResizable(false);
		p2=new Panel();
		l1=new Label("Do you want to save Changes?");	
		nsave=new Button("Save.");	
		ndontsave=new Button("DontSave.");	
		ncancel=new Button("Cancel.");
		p1.add(l1);
		p2.add(nsave);	
		p2.add(ndontsave);	
		p2.add(ncancel); 
		nsave.addActionListener(this);
		ndontsave.addActionListener(this);	
		ncancel.addActionListener(this);
		ndoyouwant.add(p1,"NORTH");	
		ndoyouwant.add(p2,"SOUTH");	
		ndoyouwant.setVisible(false);
		
		
		//////////////////////////OPEN WALI DO U WANT TO SAVE
		odoyouwant=new Frame();	
		odoyouwant.setSize(400,200);	
		p7=new Panel();
		odoyouwant.setLayout(new GridLayout(2,0));
		odoyouwant.setResizable(false);
		p8=new Panel();
		l5=new Label("Do you want to save Changes?");	
		osave=new Button("Save..");	
		odontsave=new Button("DontSave..");	
		ocancel=new Button("Cancel..");
		p7.add(l5);
		p8.add(osave);	
		p8.add(odontsave);	
		p8.add(ocancel); 
		osave.addActionListener(this);
		odontsave.addActionListener(this);	
		ocancel.addActionListener(this);
		odoyouwant.add(p7,"NORTH");	
		odoyouwant.add(p8,"SOUTH");	
		odoyouwant.setVisible(false);
		
		
		////////////////////////EXIT WALI DO U WANT TO SAVE
		edoyouwant=new Frame();	
		edoyouwant.setSize(400,200);	
		p9=new Panel();
		edoyouwant.setLayout(new GridLayout(2,0));
		edoyouwant.setResizable(false);
		p10=new Panel();
		l6=new Label("Do you want to save Changes?");	
		esave=new Button("Save...");	
		edontsave=new Button("DontSave...");	
		ecancel=new Button("Cancel...");
		p9.add(l6);
		p10.add(esave);	
		p10.add(edontsave);	
		p10.add(ecancel); 
		esave.addActionListener(this);
		edontsave.addActionListener(this);	
		ecancel.addActionListener(this);
		edoyouwant.add(p9,"NORTH");	
		edoyouwant.add(p10,"SOUTH");	
		edoyouwant.setVisible(false);
		
		////////////////////////FIND WALI FRAME
			find=new Frame();
			find.setSize(200,150);
			Panel p3=new Panel();
			p3.setLayout(new GridLayout(2,0));
			Label l2=new Label("Find");
			p3.add(l2);
			TextField t1=new TextField(20);
			p3.add(t1);
			find.add(p3,"North");
			Panel p4=new Panel();
			p4.setLayout(new FlowLayout());
			b1=new Button("Find Next");
			b2=new Button("Close");
			p4.add(b1);
			p4.add(b2);
			b1.addActionListener(this);
			find.add(p4,"South");
			find.setVisible(false);
		
			
			////////////////////////FIND AND REPLACE WALI FRAME
			replace=new Frame();
			replace.setSize(300,200);
			Panel p5=new Panel();
			p5.setLayout(new GridLayout(4,0));
			Panel p6=new Panel();
			Label l3=new Label("find");
			p5.add(l3);
			TextField t2=new TextField(5);
			p5.add(t2);
			Label l4=new Label("Replace with");
			p5.add(l4);
			TextField t3=new TextField(5);
			p5.add(t3);
			replace.add(p5,"North");
			b3=new Button("Find Next");
			b4=new Button("Replace");
			b5=new Button("ReplaceAll");
			b6=new Button("Close");
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			p6.add(b3);	p6.add(b4);	p6.add(b5);	p6.add(b6);
			replace.add(p6,"South");	
			replace.setResizable(false);
			replace.setVisible(false);
			ta.addKeyListener(this);
			f.setVisible(true);
			
		
												///////////////////////FIND FRAME CLOSE Anynomonous
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				find.setVisible(false);
				find.dispose();
			}
		});	
			
												//////////////////////////REPLACE  frame wala close ANYMONOUS
			b6.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{
				replace.setVisible(false);
				replace.dispose();
			}
		});		
			
									////////////////////////EXIT BUTTON WALA CLOSE ANYMO.(MAIN EXIT)
			ext.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{	if(f.getTitle()==Title&textValue!=false)
					{
					f.setVisible(false);
					f.dispose();
					System.exit(1);
					}
					else
					{
						ndoyouwant.setVisible(true);
					}
				}
			});
			/////////////////////////////////////////NEW WALI DO YOU WANT TO SAVE WALA CLOSE
			ncancel.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					
					ndoyouwant.dispose();
					ndoyouwant.setVisible(false);
				}
			});
			//////////////////////////////OPEN WALI DO U WANT WALA CLOSE
			ocancel.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					
					odoyouwant.dispose();
					odoyouwant.setVisible(false);
				}
			});
			
			
			
			////////EXIT WALI DO U WANT WALA CLOSE
			ecancel.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					
					edoyouwant.dispose();
					edoyouwant.setVisible(false);
				}
			});
			/////////////////////////Anymonous MAIN FRAME CLOSE  
			f.addWindowListener(new WindowAdapter()
			{
			public void windowClosing(WindowEvent e)
			{
				if(ta.getText().equals("")&f.getTitle().equals(Title))
				{
				Window w= e.getWindow();
				w.setVisible(false);
				w.dispose();
				System.exit(1);
				}
				else 
				{
					ndoyouwant.setVisible(true);
				}
			}
		});
	
	}
	public void keyPressed(KeyEvent k){}
	public void keyReleased(KeyEvent kt){}
	public void keyTyped(KeyEvent ke)  
	{
		typed=true;
		System.out.print("key Typed");
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String str="";
		str=e.getActionCommand();
		if(str.equals("New"))
		{	
			
			if(typed==false&f.getTitle().equals(Title))
			{
				ta.setText(null);
			}
			else
			{
				ndoyouwant.setVisible(true);
			}
		}
		else if(str.equals("Save."))
		{	
			String s=ta.getText();
			fd2=new FileDialog(f,"SAVE",FileDialog.SAVE);
			fd2.setVisible(true);
			String name,path;
			name=fd2.getFile();
			path=fd2.getDirectory();
			try
			{
				File file=new File(path+name);
				file.createNewFile();
				PrintStream ps=new PrintStream(file);
				ps.print(s);
				ps.close();
				f.setTitle(name);
				System.out.print(fd2.getFilenameFilter());
				ndoyouwant.setVisible(false);
			}
			catch(IOException ex)
			{}

		}
		else if(str.equals("Open"))
		{
			fd1=new FileDialog(f,"SELECT",FileDialog.LOAD);
			fd1.setVisible(true);
			String name,parent;
			name=fd1.getFile();
			parent=fd1.getDirectory();
			
			try
			{
			
				File fl=new File(parent+name);
				FileInputStream fis=new FileInputStream(fl);
				int ch;
				String s="";
				while((ch=fis.read())!=-1)
				{
					s+=(char)ch+"";
						
				}
				ta.setText(s);
				fis.close();
				f.setTitle(name);
			
			}
			catch(IOException ex)
			{
			System.out.print(ex.getMessage());
			}	
		}
		else if(str.equals("DontSave."))
		{
			System.out.print("Dont Save");
		}
		
		else if(str.equals("Find"))
		{
		find.setVisible(true);
		}
		else if(str.equals("Find Next"))
		{	
			try{
			Pattern p=Pattern.compile(t1.getText());
			Matcher m=p.matcher(ta.getText());
			
			while(m.find())
			{
			start=m.start();
			end=m.end();
			ta.select(start,end);
			f.toFront();
			}}
			catch(Exception ex){}
		}
		else if(str.equals("ReplaceAll"))
		{	try{
		
				Pattern p=Pattern.compile(t2.getText());
			Matcher	m=p.matcher(ta.getText());
					while(m.find())
					{
						ta.setText(m.replaceAll(t3.getText()));
					}
		}
					catch(Exception ex){}

		}
		
		
		
		else if(str.equals("Find&Replace"))
		{	replace.setVisible(true);
		try
		{
		String s1=ta.getText();
		String s2=null;
		Pattern p=Pattern.compile(t2.getText());
		Matcher m=p.matcher(s1);
		if(m.find())
		s2=m.replaceAll(t2.getText());
		System.out.print(s2);
			replace.setVisible(true);
		}
			catch(Exception ex1){}
		}
		
		
		
		
		else if(str.equals("Save"))
		{
			System.out.print("Save wala save");
		}
		
		
		
		
		else if(str.equals("SaveAS"))
		{
			String s=ta.getText();
			fd2=new FileDialog(f,"SAVE",FileDialog.SAVE);
			fd2.setVisible(true);
			String name,path;
			name=fd2.getFile();
			path=fd2.getDirectory();
			try
			{
				File file=new File(path+name);
				file.createNewFile();
				PrintStream ps=new PrintStream(file);
				ps.print(s);
				ps.close();
				f.setTitle(name);
			}
			catch(IOException ex)
			{}
			
		}	
		
	}	
	
	public static void main(String args[])
	{
		Editer ed=new Editer();
	}
}