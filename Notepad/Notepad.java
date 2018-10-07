import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.regex.*;
class Notepad implements ActionListener,KeyListener
{
	Frame f;
	
	MenuBar mb;
	Menu file,edit,others;
	MenuItem nw,opn,save,saveas,exit,find,findrep;
	File fdsave, fdopen, fdsaveas;
	
	TextArea ta;
	
	Dialog dfind;
	Label lblfnd1;
	TextField txtfnd1;
	Button bfnd1,bcls1;
	Panel p1,p2;
	
	Dialog dreplace;
	Label lblfnd2,lblrep;
	TextField txtfnd2,txtrep;
	Button bfnd2,brep, brepall, bcls2;
	Panel p3,p4;
	
	Dialog dsave;
	Label lblmsg;
	Button ys,no,dcancel;
	Panel p5,p6;
	
	int flag=0;
	boolean saved=true;
	
	String s;
	long size;
	int strt=0;
	int end=0;
	
	
	String title="Untitled -Notepad",name,path;
	
	Dialog dfinish;
	Label lblfinish;
	
	public Notepad()
	{
		f=new Frame();
		f.setSize(400,400);
		f.setTitle(title);
		
		ta= new TextArea();
		
		ta.addKeyListener(this);
		f.add(ta);
		mb= new MenuBar();
		
		file= new Menu("File");
		edit= new Menu("Edit");
				
		nw= new MenuItem("New");
		opn=new MenuItem("Open");
		save= new MenuItem("Save");
		saveas= new MenuItem("SaveAs");
		exit= new MenuItem("Exit");
		find= new MenuItem("Find");
		findrep= new MenuItem("Find & Replace");
		
		find.setEnabled(false);
		findrep.setEnabled(false);
		
		// **********Design of Find
		
		dfind= new Dialog(f,"Find");
		dfind.setSize(350,100);
		dfind.setResizable(false);
		dfind.setLocation(350,250);
		dfind.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				Window w= e.getWindow();
				w.setVisible(false);
				w.dispose();
			}
		});
		
		p1=new Panel();
		p2=new Panel(new GridLayout(2,1));
		
		lblfnd1= new Label("Find");
		txtfnd1= new TextField(20);
		p1.add(lblfnd1);
		p1.add(txtfnd1);
		
		bfnd1= new Button("Find Next");
		bcls1= new Button("Cancel");
		p2.add(bfnd1);
		p2.add(bcls1);
		
		dfind.add(p1,"Center");
		dfind.add(p2,"East");
		
		bfnd1.addActionListener(this);
		bcls1.addActionListener(this);
		
		// **********Design of Find & Replace
		
		dreplace= new Dialog(f,"Replace");
		dreplace.setSize(350,150);
		dreplace.setResizable(false);
		dreplace.setLocation(350,250);
		dreplace.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				Window w= e.getWindow();
				w.setVisible(false);
				w.dispose();
			}
		});
		 
		p3=new Panel();
		p4=new Panel(new GridLayout(4,1));
		
		lblfnd2= new Label("Find What");
		txtfnd2= new TextField(20);
		txtfnd2.addKeyListener(this);
		p3.add(lblfnd2);
		p3.add(txtfnd2);
		
		lblrep= new Label("Replace With");
		txtrep= new TextField(20);
		p3.add(lblrep);
		p3.add(txtrep);
		
		bfnd2= new Button("Find Next.");
		brep= new Button("Replace");
		brepall= new Button("Replace All");
		bcls2= new Button("Cancel.");
		p4.add(bfnd2);
		p4.add(brep);
		p4.add(brepall);
		p4.add(bcls2);
		
		bfnd2.setEnabled(false);
		brep.setEnabled(false);
		brepall.setEnabled(false);
		
		txtfnd2.addKeyListener(this);
		
		dreplace.add(p3,"Center");
		dreplace.add(p4,"East");
		
		bfnd2.addActionListener(this);
		brep.addActionListener(this);
		brepall.addActionListener(this);
		bcls2.addActionListener(this);
		
		// **********Design of YES, No & CANCEL Dialog
		
		Panel p5= new Panel(new GridLayout(1,3));
		ys=new Button("Yes");
		no=new Button("No");
		dcancel= new Button("Cancel..");
		p5.add(ys);
		p5.add(no);
		p5.add(dcancel);
		
		ys.addActionListener(this);
		no.addActionListener(this);
		dcancel.addActionListener(this);
		
		
		dsave= new Dialog(f,"save");
		dsave.setSize(350,150);
		dsave.setResizable(false);
		dsave.setLocation(350,250);
		dsave.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				Window w= e.getWindow();
				w.setVisible(false);
				w.dispose();
			}
		});

		
		
		lblmsg= new Label("Do you want to save your changes?",Label.CENTER);
		dsave.add(lblmsg,"Center");
		dsave.add(p5,"South");
		
		
		dfinish=new Dialog(f,"Finish");
		dfinish.setSize(350,150);
		dfinish.setResizable(false);
		dfinish.setLocation(350,250);
		dfinish.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				Window w= e.getWindow();
				w.setVisible(false);
				w.dispose();
			}
		});
		
		lblfinish= new Label("String Finished",Label.CENTER);
		dfinish.add(lblfinish,"Center");
		
		
		
		
		
		// **********Menus Design
		
					
		nw.addActionListener(this);
		opn.addActionListener(this);
		save.addActionListener(this);
		saveas.addActionListener(this);
		exit.addActionListener(this);
		find.addActionListener(this);
		findrep.addActionListener(this);
		
	//	find.setEnabled(false);
	//	findrep.setEnabled(false);
		
		edit.add(find);
		edit.add(findrep);
		
		file.add(nw);
		file.add(opn);
		file.add(save);
		file.add(saveas);
		file.addSeparator();
		file.add(exit);
		
		mb.add(file);
		mb.add(edit);
		
		f.setMenuBar(mb);
		
		// **********Annonomus Class 
		
		f.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				if(ta.getText().equals("")&f.getTitle().equals(title))
				{
				Window w= e.getWindow();
				w.setVisible(false);
				w.dispose();
				System.exit(1);
					
				}
				else
				{
					flag=2;
					dsave.setVisible(true);
				}
			}
		});
		
		f.setVisible(true);
	}
	
	public void keyPressed(KeyEvent k1)
	{
		
	}
	
	public void keyReleased(KeyEvent k2)
	{
		
	}
	public void keyTyped(KeyEvent k3)
	{
		char ch=k3.getKeyChar();
			if(ch=='\u0000')
			{
				save.setEnabled(false);
				
			}
			else
			{
				save.setEnabled(true);
				find.setEnabled(true);
				findrep.setEnabled(true);
				saved=false;
			}
			
			if(txtfnd2.getText()=="")
			{
				bfnd2.setEnabled(false);
				brep.setEnabled(false);
				brepall.setEnabled(false);
		
			}
			else
			{
				bfnd2.setEnabled(true);
				brep.setEnabled(true);
				brepall.setEnabled(true);
		
				
			}	
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{
		String str=e.getActionCommand();
		
		if(str.equals("Exit"))
		{
			flag=4;
			if(f.getTitle().equals(title)&!ta.getText().equals(""))
			{
				dsave.setVisible(true);
			}
			else
			{
				if(saved==false)
				{
					dsave.setVisible(true);
				}
				else
				{
					System.exit(1);
				}
			}
			
		}
		
		
		if(str.equals("New"))
		{
			flag=1;
			if(ta.getText().equals(""))
			{
			    if(title=="Untitled -Notepad")
			    {
			         f.setTitle(title);
				     ta.setText("");
			    }
			}
			else 
			{
			     dsave.setVisible(true);
			}
		}
			

		if(str.equals("Save"))
		{
			if(f.getTitle().equals("Untitled -Notepad"))
			{
		
			FileDialog fdsave= new FileDialog(f,"Save",FileDialog.SAVE);
			fdsave.setVisible(true);
			name=fdsave.getFile();
			path=fdsave.getDirectory();
			
			if(name==null)
			{
				fdsave.dispose();
				f.setVisible(true);
				f.setEnabled(true);
			}
			else
			{
				try
				{
				File f1=new File(path+name);
				FileOutputStream fos= new FileOutputStream(f1);
				s=ta.getText();
				for(int i=0;i<s.length();i++)
				{
					fos.write((byte)s.charAt(i));
				}
				fos.close();
				saved=true;
				save.setEnabled(false);
				try
					{
					if(name.startsWith("."))
					{
						f.setTitle(name+"-Notepad");
					}
					else
					{
					f.setTitle(name.substring(0, name.lastIndexOf(".")) + " - Notepad");
					}
					}
					catch(StringIndexOutOfBoundsException e1)
					{f.setTitle(name.substring(0) + " - Notepad");}
				}
				catch(IOException e1)
				{
				}
			}
			}
			
			else
			{
				try
				{
				File f1=new File(path+name);
				FileOutputStream fos= new FileOutputStream(f1);
				s=ta.getText();
				for(int i=0;i<s.length();i++)
				{
					fos.write((byte)s.charAt(i));
				}
				fos.close();
				saved=true;
				save.setEnabled(false);
				}
				catch(IOException e1)
				{
				}
			}
		}
	
		if(str.equals("SaveAs"))
		{
			
			
			FileDialog fdsaveas= new FileDialog(f,"Save As",FileDialog.SAVE);
			fdsaveas.setVisible(true);
			name=fdsaveas.getFile();
			path=fdsaveas.getDirectory();
			
			if(name==null)
			{
				fdsaveas.dispose();
				f.setVisible(true);
				f.setEnabled(true);
			}
			else
			{
				try
				{
				File f1=new File(path+name);
				FileOutputStream fos= new FileOutputStream(f1);
				s=ta.getText();
				for(int i=0;i<s.length();i++)
				{
					fos.write((byte)s.charAt(i));
				}
				fos.close();
				saved=true;
				save.setEnabled(false);
				try
					{
					if(name.startsWith("."))
					{
						f.setTitle(name+"-Notepad");
					}
					else
					{
					f.setTitle(name.substring(0, name.lastIndexOf(".")) + " - Notepad");
					}
					}
					catch(StringIndexOutOfBoundsException e1)
					{f.setTitle(name.substring(0) + " - Notepad");}
				}
				catch(IOException e1)
				{
				}
			}
		}
		
TWO:		if(str.equals("Open"))
			{
			flag=3;
			
				if(f.getTitle().equals(title)&!ta.getText().equals(""))
				{
					dsave.setVisible(true);				
					System.out.println("saved =true");
				}
				else
				{
					if(saved==false)
					{
						System.out.println("saved =false");
						dsave.setVisible(true);
						break TWO;
					}
					FileDialog fdopen= new FileDialog(f,"Open",FileDialog.LOAD);
			fdopen.setVisible(true);
			name=fdopen.getFile();
			path=fdopen.getDirectory();
			saved=true;
			
						
			if(name==null)
			{
				fdopen.dispose();
				f.setVisible(true);
				f.setEnabled(true);
					
			}
			else
			{
				try
				{
				File f1=new File(path+name);
				FileInputStream fis= new FileInputStream(f1);
				int ch;
				String s="";
				while((ch=fis.read())!=-1)
				s+=(char)ch;
				ta.setText(s);
				saved=true;
				fis.close();
				try
					{
					if(name.startsWith("."))
					{
						f.setTitle(name+"-Notepad");
					}
					else
					{
					f.setTitle(name.substring(0, name.lastIndexOf(".")) + " - Notepad");
					}
					}
					catch(StringIndexOutOfBoundsException e1)
					{f.setTitle(name.substring(0) + " - Notepad");}
				}
				catch(IOException e1)
				{
				}
			}
				
					
				}
		}
		
		if(str.equals("Find"))
		{
			dfind.setVisible(true);
		}	
		
		if(str.equals("Find & Replace"))
		{
			dreplace.setVisible(true);
		}
		
			
		if(str.equals("Find Next"))		//Find only
		{
			
			String s1;
		    int temp;
			temp = ta.getCaretPosition()+(ta.getSelectedText()).length();
			s1=(ta.getText()).replaceAll("\r","");			
			ta.setText(s1);// it sets Zero the value of CretPosition
			ta.setCaretPosition(temp);
			System.out.println(temp);	
			Pattern p=Pattern.compile(txtfnd1.getText());
			Matcher m=p.matcher(ta.getText());
			temp=(ta.getCaretPosition());
			 //System.out.println(ta.getCaretPosition());
			 //int temp;
			//temp = ta.getCaretPosition()+(ta.getSelectedText()).length();
			//System.out.println("caretPosition="+ta.getCaretPosition());
			//System.out.println("total="+temp);
			try
			{
			  while(m.find(temp))
			 
	         	{
	         	 
                    strt = m.start();
                    end = m.end();				
					ta.select(strt,end);
                    ta.requestFocus();    
                    if((byte)ta.getCaretPosition()==-1)
                    {
                    	System.out.println("Findddd");
                    	ta.setCaretPosition(0);
                    }            
                    break;
               }
			}
			catch(IndexOutOfBoundsException e2)
			{
				while(m.find(temp))
			 
	         	{
	         	 
                    strt = m.start();
                    end = m.end();				
					ta.select(strt,end);
                    ta.requestFocus();    
                    if((byte)ta.getCaretPosition()==-1)
                    {
                    	System.out.println("Findddd");
                    	ta.setCaretPosition(0);
                    }     
                    	       
               }
				
				
			}
               
              
               
              
         }
		
		
		if(str.equals("Replace All"))
		{
			Pattern p=Pattern.compile(txtfnd2.getText());
			Matcher m=p.matcher(ta.getText());
			if(m.find())
			ta.setText(m.replaceAll(txtrep.getText()));
		}
		
		if(str.equals("Replace"))
		{
			if(ta.getSelectedText()=="")
			{			
			Pattern p=Pattern.compile(txtfnd2.getText());
			Matcher m=p.matcher(ta.getText());
			if(m.find())
			ta.setText(m.replaceFirst(txtrep.getText()));
			}
			else
			{
				int x;
				int y;
				String str1;
				
				str1=ta.getSelectedText();
				x=ta.getSelectionStart();
				y=ta.getSelectionEnd();
				ta.replaceText(txtrep.getText(),x,y);
				
			}
			str="Find Next.";
			
		}
		
		
			
		if(str.equals("Find Next."))  //Find & Replace Both
		{
			String s1;
			int temp;
			temp = ta.getCaretPosition()+(ta.getSelectedText().length());
			s1=(ta.getText()).replaceAll("\r","");			
			ta.setText(s1);// it sets Zero the value of CretPosition
			ta.setCaretPosition(temp);
				
			Pattern p=Pattern.compile(txtfnd2.getText());
			Matcher m=p.matcher(s1);
			 
			 //System.out.println(ta.getCaretPosition());
			 //int temp;
			//temp = ta.getCaretPosition()+(ta.getSelectedText()).length();
			System.out.println("caretPosition="+ta.getCaretPosition());
			System.out.println("total="+(temp=ta.getCaretPosition()));
			  if(m.find(temp))
			 
	         	{
	         	 
                    strt = m.start();
                    end = m.end();				
					ta.select(strt,end);
                    ta.requestFocus();    
                                
               } 
               	else
               	{
					dfinish.setVisible(true);               		
               	} 
         }	
			

		
		
		
		if(str.equals("Cancel"))
		{
			dfind.dispose();
			f.setVisible(true);
			
			
		}
		
		if(str.equals("Cancel.."))
		{
			dsave.dispose();
			f.setVisible(true);
		}
				
		
		//***********YES Button Code Start
		
		if(str.equals("Yes"))
		{
			dsave.dispose();
			f.setVisible(true);
			f.setEnabled(true);
			
			//****************NEW Button  Dialog
			if(flag==1)
			{
				
				if(f.getTitle().equals(title))
				{
					FileDialog fdsave= new FileDialog(f,"Save",FileDialog.SAVE);
					fdsave.setVisible(true);
					name=fdsave.getFile();
					path=fdsave.getDirectory();
					
									
					if(name==null)
					{
						System.out.println(ta.getText());
						System.out.println("flag name=null");
						System.out.println(ta.getText());
						fdsave.dispose();
						//f.setVisible(true);
						//f.setEnabled(true);
					}
					else
					{
						try 
							{
								System.out.println("flag=try 1");
								File f1=new File(path+name);
								FileOutputStream fos= new FileOutputStream(f1);
								s=ta.getText();
								for(int i=0;i<s.length();i++)
								{
									fos.write((byte)s.charAt(i));
								}
								fos.close();
								
							}
							catch(IOException e1)
							{
							}
					}
					
							
				}
				else
				{
						try 
							{
								System.out.println("flag=try 1");
								File f1=new File(path+name);
								FileOutputStream fos= new FileOutputStream(f1);
								s=ta.getText();
								for(int i=0;i<s.length();i++)
								{
									fos.write((byte)s.charAt(i));
								}
								fos.close();
								
								f.setTitle(title);
								ta.setText("");	
								saved=true;
								
								
								
							}
							catch(IOException e1)
							{
							}
							
				}
				
						
			}
		
		
		//****************CLOSE Button Dialog
		
		if(flag==2)
		{
			
			if(f.getTitle().equals(title)&ta.getText().equals(""))
			{
				System.exit(1);
			}
			else
			{
							
				FileDialog fdsave= new FileDialog(f,"Save",FileDialog.SAVE);
				fdsave.setVisible(true);
				name=fdsave.getFile();
				path=fdsave.getDirectory();
						
				if(name==null)
				{
					fdsave.dispose();
					f.setVisible(true);
					f.setEnabled(true);
				}
				else
				{
					try 
					{
					File f1=new File(path+name);
					FileOutputStream fos= new FileOutputStream(f1);
					s=ta.getText();
					for(int i=0;i<s.length();i++)
					{
						fos.write((byte)s.charAt(i));
					}
					fos.close();
					System.exit(1);
					}
					catch(IOException e1)
					{
					}
				}		
			}
		}
		
		 //****************OPEN Button Dialog
		 
	ONE: if(flag==3)
			{
				if(saved==false)
				{
					if(f.getTitle().equals(title))
						
					{
						FileDialog fdsave= new FileDialog(f,"SaveAs",FileDialog.SAVE);
				fdsave.setVisible(true);
				name=fdsave.getFile();
				path=fdsave.getDirectory();
						
				if(name==null)
				{
					fdsave.dispose();
					f.setVisible(true);
					f.setEnabled(true);
				}
				else
				{
					try 
					{
					File f1=new File(path+name);
					FileOutputStream fos= new FileOutputStream(f1);
					s=ta.getText();
					for(int i=0;i<s.length();i++)
					{
						fos.write((byte)s.charAt(i));
					}
					fos.close();
					
					}
					catch(IOException e1)
					{
					}
				}
						
					}
					
					
					try
				{
				File f1=new File(path+name);
				FileOutputStream fos= new FileOutputStream(f1);
				s=ta.getText();
				for(int i=0;i<s.length();i++)
				{
					fos.write((byte)s.charAt(i));
				}
				fos.close();
				saved=true;
				save.setEnabled(false);
				saved=true;
				}
				catch(IOException e1)
				{
				}
				FileDialog fdopen= new FileDialog(f,"Open",FileDialog.LOAD);
						fdopen.setVisible(true);
						name=fdopen.getFile();
						path=fdopen.getDirectory();
			
			if(name==null)
			{
				fdopen.dispose();
				f.setVisible(true);
				f.setEnabled(true);
					
			}
			else
			{
				try
				{
				File f1=new File(path+name);
				FileInputStream fis= new FileInputStream(f1);
				int ch;
				String s="";
				while((ch=fis.read())!=-1)
				s+=(char)ch;
				ta.setText(s);
				saved=true;
				fis.close();
				try
					{
					if(name.startsWith("."))
					{
						f.setTitle(name+"-Notepad");
					}
					else
					{
					f.setTitle(name.substring(0, name.lastIndexOf(".")) + " - Notepad");
					}
					}
					catch(StringIndexOutOfBoundsException e1)
					{f.setTitle(name.substring(0) + " - Notepad");}
				}
				catch(IOException e1)
				{
				}
			}
				
				
				}
				else
				{
				
				System.out.println("Floag 3");
				FileDialog fdsave= new FileDialog(f,"SaveAs",FileDialog.SAVE);
				fdsave.setVisible(true);
				name=fdsave.getFile();
				path=fdsave.getDirectory();
						
				if(name==null)
				{
					fdsave.dispose();
					f.setVisible(true);
					f.setEnabled(true);
					break ONE;
				}
				else
				{
					try 
					{
					System.out.println("Floag 3 try");
					File f1=new File(path+name);
					FileOutputStream fos= new FileOutputStream(f1);
					s=ta.getText();
					for(int i=0;i<s.length();i++)
					{
						fos.write((byte)s.charAt(i));
					}
					fos.close();
					try
					{
					if(name.startsWith("."))
					{
						f.setTitle(name+"-Notepad");
					}
					else
					{
					f.setTitle(name.substring(0, name.lastIndexOf(".")) + " - Notepad");
					}
					}
					catch(StringIndexOutOfBoundsException e1)
					{f.setTitle(name.substring(0) + " - Notepad");}
					}
					catch(IOException e1)
					{
					}
				}
				System.out.println("Floag 3 dispose");
				dsave.dispose();
				
						FileDialog fdopen= new FileDialog(f,"Open",FileDialog.LOAD);
						fdopen.setVisible(true);
						name=fdopen.getFile();
						path=fdopen.getDirectory();
			
			if(name==null)
			{
				fdopen.dispose();
				f.setVisible(true);
				f.setEnabled(true);
					
			}
			else
			{
				try
				{
				File f1=new File(path+name);
				FileInputStream fis= new FileInputStream(f1);
				int ch;
				String s="";
				while((ch=fis.read())!=-1)
				s+=(char)ch;
				ta.setText(s);
				saved=true;
				fis.close();
				try
					{
					if(name.startsWith("."))
					{
						f.setTitle(name+"-Notepad");
					}
					else
					{
					f.setTitle(name.substring(0, name.lastIndexOf(".")) + " - Notepad");
					}
					}
					catch(StringIndexOutOfBoundsException e1)
					{f.setTitle(name.substring(0) + " - Notepad");}
				}
				catch(IOException e1)
				{
				}
			}
				
			}
			}
			
			
			if(flag==4)
			{
				System.out.println("Floag 3");
				FileDialog fdsave= new FileDialog(f,"SaveAs",FileDialog.SAVE);
				fdsave.setVisible(true);
				name=fdsave.getFile();
				path=fdsave.getDirectory();
						
				if(name==null)
				{
					fdsave.dispose();
					f.setVisible(true);
					f.setEnabled(true);
					
				}
				else
				{
					try 
					{
					System.out.println("Floag 3 try");
					File f1=new File(path+name);
					FileOutputStream fos= new FileOutputStream(f1);
					s=ta.getText();
					for(int i=0;i<s.length();i++)
					{
						fos.write((byte)s.charAt(i));
					}
					fos.close();
					try
					{
					if(name.startsWith("."))
					{
						f.setTitle(name+"-Notepad");
					}
					else
					{
					f.setTitle(name.substring(0, name.lastIndexOf(".")) + " - Notepad");
					}
					}
					catch(StringIndexOutOfBoundsException e1)
					{f.setTitle(name.substring(0) + " - Notepad");}
					}
					catch(IOException e1)
					{
					}
					System.exit(1);
				}
				
			}
				
				
			}	
		 
		
		
		//***********YES Button Code End
			 
		
		
		
		if(str.equals("No"))
		{
			System.out.println("Flag in NO");
			if(flag==1)
			{
				System.out.println("flg=1");
			f.setTitle(title);
			ta.setText("");
			dsave.dispose();
			}
			
			if(flag==2)
			{
				System.out.println("flg=2");
				System.exit(1);
			}
			
			if(flag==3)
			{
				dsave.dispose();
				FileDialog fdopen= new FileDialog(f,"Open",FileDialog.LOAD);
				fdopen.setVisible(true);
				name=fdopen.getFile();
				path=fdopen.getDirectory();
			
				if(name==null)
				{
				fdopen.dispose();
				f.setVisible(true);
				f.setEnabled(true);
					
				}
				else
				{
				try
				{
				File f1=new File(path+name);
				FileInputStream fis= new FileInputStream(f1);
				int ch;
				String s="";
				while((ch=fis.read())!=-1)
				s+=(char)ch;
				ta.setText(s);
				fis.close();
				try
					{
					if(name.startsWith("."))
					{
						f.setTitle(name+"-Notepad");
					}
					else
					{
					f.setTitle(name.substring(0, name.lastIndexOf(".")) + " - Notepad");
					}
					}
					catch(StringIndexOutOfBoundsException e1)
					{f.setTitle(name.substring(0) + " - Notepad");}
				}
				catch(IOException e1)
				{
				}
			}
			}
			
			if(flag==4)
			{
				System.exit(0);
			}
				
				
			
				
			}
		
		
		
		
		
		
		if(str.equals("Cancel."))
		{
			dreplace.dispose();
			f.setVisible(true);
			
			
		}
	}
	
	
	
	
	public static void main(String args[])
	{
		Notepad d= new Notepad();
			
	}
	
	
}