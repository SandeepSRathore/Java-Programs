import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.regex.*;
public class Editor implements ActionListener
{
//Instance Variable of a Program
	Pattern p;
	Matcher m;
	MenuBar mb;
	Menu m1,m2,m3;
	MenuItem n,o,s,sa,cl,fn,fr,fo;
	CheckboxMenuItem ww;
	TextArea ta;
	int x,y;
	Button save,dontsave,cancel,ok;
	Frame f1,f2,f3,f4,f5;
	TextField tf,tr;
	String tavalue="",stvalue="",gf="";
	boolean firsttime=true,vis;
	boolean nf,of,upper,Ifind,user,fnext;
	Button findnext,replace,replaceall,close;
	int r1,r2;
	
//main frame created
	public Editor()
	{
		f1=new Frame("Editor");
		f1.setSize(500,400);
		f1.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){
			tavalue=ta.getText();
		if(tavalue.equals(stvalue))
			System.exit(1);
			else
			{
				upper=true;
				nf=false;
				of=false;
				checking();
			}
		}
		});
		ta=new TextArea();
		ta.addMouseListener(new MouseAdapter(){public void mouseClicked(MouseEvent me){
		x=ta.getCaretPosition();
		}
		});
		mb=new MenuBar();
		m1=new Menu("File");
		n=new MenuItem("New");
		o=new MenuItem("Open");
		s=new MenuItem("Save");
		sa=new MenuItem("Save As");
		cl=new MenuItem("Close");
		n.addActionListener(this);
		o.addActionListener(this);
		s.addActionListener(this);
		sa.addActionListener(this);
		cl.addActionListener(this);
		m1.add(n);
		m1.add(o);
		m1.add(s);
		m1.add(sa);
		m1.addSeparator();
		m1.add(cl);
		mb.add(m1);
		m2=new Menu("Edit");
		fn=new MenuItem("Find");
		fr=new MenuItem("Find & Replace");
		fn.addActionListener(this);
		fr.addActionListener(this);
		m2.add(fn);
		m2.add(fr);
		mb.add(m2);
		f1.setMenuBar(mb);
		f1.add(ta);
		f1.setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		tavalue=ta.getText();
//cannot find Symbol ok Action
	if(e.getSource()==ok)
		f5.setVisible(false);
//Edit Menu Find Action
		if(e.getSource()==fn)
			finding();
//Edit Menu Find & Replace Action
			if(e.getSource()==fr)
				replacing();
//Find Next Action
				if(e.getSource()==findnext)
				{
					findingValue();
					fnext=true;
				}
					
//Replace Action
				if(e.getSource()==replace)
				{
					if(fnext)
						fnext=false;
						else
					findingValue();
					if(user)
					{
						ta.replaceRange(tr.getText(),r1,r2);
					ta.select(r1,r1+tr.getText().length());
					user=false;
					}
				}
					
//Replace All Action
				if(e.getSource()==replaceall)
				{
					p=Pattern.compile(tf.getText());
					m=p.matcher(tavalue);
					while(m.find())
					{
						ta.setText(m.replaceAll(tr.getText()));
					}
						
				}
//Close Action
				if(e.getSource()==close)
				{
					if(Ifind)
						f3.setVisible(false);
						else
							f4.setVisible(false);
					
				}
					
//checking save Action
		if(e.getSource()==save)
			{
				if(firsttime)
					saveBox();
					else
						saving();
						if(of)
						{
							openBox();
							of=false;
							nf=false;
							upper=false;
						}
						if(nf)
						{
							ta.setText("");
					nf=false;
					x=0;
					of=false;
					upper=false;
					firsttime=true;
					tavalue=ta.getText();
					stvalue=tavalue;
						}
						if(upper)
							System.exit(1);
						f2.setVisible(false);
				}
//checking dontsave Action
		if(e.getSource()==dontsave)
			{
				if(nf)
				{
					ta.setText("");
					nf=false;
					of=false;
					upper=false;
					firsttime=true;
					x=0;
					tavalue=ta.getText();
					stvalue=tavalue;
				}
					if(of)
					{
						openBox();
						of=false;
						nf=false;
						upper=false;
					}
						if(upper)
							System.exit(0);
				f2.setVisible(false);
				}
//checking cancel Action
		if(e.getSource()==cancel)
			f2.setVisible(false);
//Menu New File Action
		if(e.getSource()==n)
		{
			nf=true;
			if(tavalue.equals(stvalue))
			{
				of=false;
				upper=false;
				firsttime=true;
				x=0;
				ta.setText("");
				stvalue=ta.getText();
			}
			else
				checking();
				
		}
//Menu Open File Action
		if(e.getSource()==o)
		{
			of=true;
			if(tavalue.equals(stvalue))
				openBox();
				else
					checking();
		}
//Menu Save File Action
		if(e.getSource()==s)
		{
			if(firsttime)
				saveBox();
				else
					saving();
					if(vis)
						f2.setVisible(false);
		}
//Menu Save As File Action
		if(e.getSource()==sa)
			saveBox();
			if(e.getSource()==cl)
			{
				if(tavalue.equals(stvalue))
					System.exit(1);
					else
						checking();
			}
	}
//try to open a save dialog box
	public void saveBox()
		{
			FileDialog fd=new FileDialog(f1,"Save File",FileDialog.SAVE);
				fd.setVisible(true);
				gf=fd.getDirectory()+fd.getFile();
				if(gf.length()<=8)
				{
					nf=false;
					of=false;
					upper=false;
				}
				else
				{
					stvalue=tavalue;
					saving();
					firsttime=false;
					
				}
				if(vis)
				f2.setVisible(false);
			}
//Finding Value
			public void findingValue()
			{
				p=Pattern.compile(tf.getText());
				m=p.matcher(tavalue);
				if(m.find(x))
				{
					y=0;
					char ch[]=tavalue.toCharArray();
					for(int i=0;i<m.start();i++)
						if(ch[i]=='\n')
							y++;
							ta.select(m.start()-y,m.end()-y);
							r1=m.start()-y;
							r2=m.end()-y;
								x=m.end();
								user=true;
				}	
					else
						canotFound();
					f1.toFront();
			}
						
//if match not found
	public void canotFound()
	{
		f5=new Frame("Cannot find Symbol");
		f5.setSize(500,400);
		f5.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){Window wi=we.getWindow();
		wi.setVisible(false);
		wi.dispose();
		}
		});
		f5.add(new Label("Cannot find Symbol"));
		ok=new Button("OK");
		ok.addActionListener(this);
		f5.add(ok,"South");
		f5.setVisible(true);
		f5.pack();
		f5.setLocation(500,200);
	}
//try to save a file to the directory
	public void saving()
		{
			try{
			File f=new File(gf);
			FileOutputStream fos=new FileOutputStream(f);
			char ch[]=ta.getText().toCharArray();
			for(int i=0;i<ch.length;i++)
				fos.write((byte)ch[i]);
				fos.close();
				stvalue=tavalue;
			}catch(Exception ex){}
			}
//try to open a fileDialog box
	public void openBox()
	{
		FileDialog fd=new FileDialog(f1,"Open File",FileDialog.LOAD);
		fd.setVisible(true);
		gf=fd.getDirectory()+fd.getFile();
		
		if(gf.length()<=8)
		{
			
					nf=false;
					of=false;
					upper=false;
		}
				else
				{
					firsttime=false;
					openning();
					x=0;
				}
			
			if(vis)
				f2.setVisible(false);
	}
//try to open a file from the directory
	public void openning()
		{
			try{
				File f=new File(gf);
				FileInputStream fis=new FileInputStream(f);
				int ch;
				String svl="";
				while((ch=fis.read())!=-1)
					svl+=(char)ch;
					fis.close();
					ta.setText(svl);
					tavalue=ta.getText();
					stvalue=tavalue;
					fis.close();
			}catch(Exception ex){ex.getMessage();}
			}
//Frame save Changes visible
	public void checking()
	{
		vis=true;
		f2=new Frame("Save Changes");
		f2.setSize(400,400);
		f2.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){
			Window ew=we.getWindow();
			ew.setVisible(false);
			ew.dispose();
		}
		});
		Panel p=new Panel();
		save=new Button("Save");
		save.addActionListener(this);
		dontsave=new Button("Dont Save");
		dontsave.addActionListener(this);
		cancel=new Button("Cancel");
		cancel.addActionListener(this);
		p.setLayout(new FlowLayout());
		p.add(save);
		p.add(dontsave);
		p.add(cancel);
		f2.add(new Label("Do You want to save changes ?"),"North");
		f2.add(p,"South");
		f2.setVisible(true);
		f2.pack();
	}
// Frame finding visible
	public void finding()
	{
		f3=new Frame("Find What:");
		f3.setSize(400,400);
		Panel p=new Panel();
		findnext=new Button("Find Next");
		findnext.addActionListener(this);
		close=new Button("Close");
		close.addActionListener(this);
		Ifind=true;
		p.setLayout(new FlowLayout());
		p.add(findnext);
		p.add(close);
		tf=new TextField(20);
		f3.add(new Label("Find What:"),"North");
		f3.add(tf);
		f3.add(p,"South");
		f3.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){Window dw=we.getWindow();
		dw.setVisible(false);
		dw.dispose();
		}
		});
		f3.setVisible(true);
		f3.pack();
		f3.setLocation(500,150);
	}
// Frame Replacing Visible
	public void replacing()
	{
		f4=new Frame("Find & Replace");
		f4.setSize(500,400);
		Panel p=new Panel();
		p.setLayout(new GridLayout(4,0));
		Panel p1=new Panel();
		p1.setLayout(new FlowLayout());
		p.add(new Label("Find What:"));
		tf=new TextField(20);
		p.add(tf);
		p.add(new Label("Replace with:"));
		tr=new TextField(20);
		p.add(tr);
		findnext=new Button("Find Next");
		findnext.addActionListener(this);
		close=new Button("Close");
		close.addActionListener(this);
		replace=new Button("Replace");
		replace.addActionListener(this);
		replaceall=new Button("Replace All");
		replaceall.addActionListener(this);
		p1.add(findnext);
		p1.add(replace);
		p1.add(replaceall);
		p1.add(close);
		f4.addWindowListener(new WindowAdapter(){public void windowClosing(WindowEvent we){Window wi=we.getWindow();
		wi.setVisible(false);
		wi.dispose();
		}
		});
		f4.add(p);
		f4.add(p1,"South");
		f4.setVisible(true);
		f4.pack();
		Ifind=false;
		f4.setLocation(500,150);
	}
	public static void main(String args[])
	{
		new Editor();
	}
}