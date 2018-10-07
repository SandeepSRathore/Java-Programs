import java.awt.*;
import java.awt.event.*;
import java.io.*;
class Editor extends WindowAdapter implements ActionListener
{
	Frame f;
	TextArea ta;
	MenuBar mb;
	Menu m1,m2;
	MenuItem nw,opn,sve,sveas,ext,fnd,fndndrplce;
	public Editor()
	{
		f=new Frame("Unknown");
		f.setSize(800,600);
		f.setVisible(true);
		mb=new MenuBar();
		m1=new Menu("File");
		m2=new Menu("Edit");
		nw=new MenuItem("New");	nw.addActionListener(this);
		opn=new MenuItem("Open");	opn.addActionListener(this);
		sve=new MenuItem("Save");	sve.addActionListener(this);
		sveas=new MenuItem("Save As");	sveas.addActionListener(this);
		ext=new MenuItem("Exit");	ext.addActionListener(this);
		fnd=new MenuItem("Find");	fnd.addActionListener(this);
		fndndrplce=new MenuItem("Find and Replace");	fndndrplce.addActionListener(this);
		m1.add(nw);	m1.add(opn);	m1.add(sve);	m1.add(sveas);	m1.addSeparator();	m1.add(ext);
		m2.add(fnd);	m2.add(fndndrplce);
		mb.add(m1);	mb.add(m2);
		f.setMenuBar(mb);
		ta=new TextArea();
		f.add(ta);
		f.addWindowListener(this);
	}
	public void windowClosing(WindowEvent we)
	{
		Window w=we.getWindow();
		w.setVisible(false);
		w.dispose();
		if(we.getSource()==f)
		System.exit(1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str =ae.getActionCommand();
		if(str.equals("New"))
		{
			ta.setText("");
		}
		if(str.equals("Open"))
		{
			FileDialog fdo=new FileDialog(f,"SELECT",FileDialog.LOAD);
			fdo.setVisible(true);
			String name,parent;
			name=fdo.getFile();
			parent=fdo.getDirectory();
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
			catch(IOException e)
			{
				ta.setText(e.getMessage());
			}
		}
		if(str.equals("Save"))
		{
		
		}
		if(str.equals("Save As"))
		{
			String s=ta.getText();
			FileDialog fds=new FileDialog(f,"SAVE",FileDialog.SAVE);
			fds.setVisible(true);
			String name,path;
			name=fds.getFile();
			path=fds.getDirectory();
			try
			{
				File file=new File(path+name);
				file.createNewFile();
				PrintStream ps=new PrintStream(file);
				ps.print(s);
				ps.close();
				f.setTitle(name);
				System.out.print(fds.getFilenameFilter());
			}
			catch(IOException e)
			{
				Frame frm=new Frame("Error");
				Dimension d=f.getSize();
				frm.setBounds(d.width/2,d.height/2,200,50);
				TextArea t=new TextArea();
				t.setText(e.getMessage());
				frm.add(t);
				frm.setVisible(true);
			}
		}
		if(str.equals("Exit"))
		{
			
		}
		if(str.equals("Find"))
		{
			
		}
		if(str.equals("Find and Replace"))
		{
			
		}
	}
	public static void main(String args[])
	{
		Editor ed=new Editor();
	}
}