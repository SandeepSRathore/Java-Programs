import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.regex.*;
import javax.swing.*;
import java.util.*;



class Compiler extends WindowAdapter implements ActionListener,TextListener,KeyListener
{
	JFrame frame1,frame2,frame3;	JPanel p1,p2;	JLabel l1,l2,l3,l4,l5,l6,l7;	JTextField t1,t2,t3;	JButton b1,b2,b3,b4,b5;	
	JMenuBar menubar;	JMenu menu1,menu2,menu3,menu4;		JMenuItem nw,open,save,saveas,exit,find,findreplace,cut,copy,paste,compile,run,closeme,closeall;
	JTabbedPane jtp;
	JTextArea jta1,jta2;     JScrollPane scrollpane;
	JPanel panel;
	JSplitPane splitpane;	

	
	Vector v,v2,v3;
	int initpos=0,lastpos=0;


	String changed=null;
	
	
	int tabcounter=1;
	JFileChooser filechooser;



public Compiler()
{
	frame1=new JFrame();

	frame1.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  	
	frame1.setSize(screenSize.width, screenSize.height);   
	

	frame1.setTitle("");
		
	menubar=new JMenuBar();
	
	menu1=new JMenu("File");	menu2=new JMenu("Edit"); 	menu3=new JMenu("Build");	menu4=new JMenu("Close Tabs");

	nw=new JMenuItem("New");	save=new JMenuItem("Save");	saveas=new JMenuItem("Save As");	open=new JMenuItem("Open");	exit=new JMenuItem("Exit");
	find=new JMenuItem("Find");	findreplace=new JMenuItem("Find & Replace"); cut=new JMenuItem("Cut"); copy=new JMenuItem("Copy"); paste=new JMenuItem("Paste");
 	compile=new JMenuItem("Compile");  run=new JMenuItem("Run");	closeme=new JMenuItem("Close Me");	closeall=new JMenuItem("Close All");

		
	nw.addActionListener(this);	open.addActionListener(this);	save.addActionListener(this);	saveas.addActionListener(this);
	exit.addActionListener(this);	find.addActionListener(this);	findreplace.addActionListener(this);	cut.addActionListener(this);	
	copy.addActionListener(this);	 paste.addActionListener(this); compile.addActionListener(this);     run.addActionListener(this);
	closeme.addActionListener(this);	closeall.addActionListener(this);

	menu1.add(nw);	menu1.add(open);	menu1.add(save);	menu1.add(saveas);	menu1.addSeparator();	menu1.add(exit);
	menu2.add(cut);	menu2.add(copy);		menu2.add(paste);	menu2.add(find);	menu2.add(findreplace);
	menu3.add(compile);	menu3.add(run);	menu4.add(closeme);	menu4.add(closeall);	

	menubar.add(menu1);	menubar.add(menu2);	menubar.add(menu3);	menubar.add(menu4);

	frame1.setJMenuBar(menubar);

	jta2=new JTextArea(); 	jta2.setEditable(false);
	
	
	jtp=new JTabbedPane();
	

	splitpane=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jtp,jta2);  	splitpane.setDividerLocation(450);
	
	
	
	frame1.add(splitpane);






		frame2=new JFrame();	frame2.setSize(700,200);
		
		p1=new JPanel();	p1.setLayout(new GridLayout(2,3));
	
		l1=new JLabel("Find");	l2=new JLabel();

		t1=new JTextField();

		p1.add(l1);	p1.add(l2);	p1.add(t1);
	
		b1=new JButton("Find Next");	b2=new JButton("Close");	b1.addActionListener(this);	b2.addActionListener(this);
	
		l3=new JLabel();

		p1.add(b1);	p1.add(l3);	p1.add(b2);

		frame2.add(p1);	
		frame2.addWindowListener(this);	frame2.setVisible(false);






		frame3=new JFrame();	frame3.setSize(700,300);
		
		p2=new JPanel();	p2.setLayout(new GridLayout(3,3));
	
		l4=new JLabel("Find");	l5=new JLabel();

		t2=new JTextField();	

		p2.add(l4);	p2.add(l5);	p2.add(t2);

		l6=new JLabel("Replace With");	l7=new JLabel();		t3=new JTextField();
		
		p2.add(l6);	p2.add(l7);	p2.add(t3);
	
		b3=new JButton("Find Next");	b4=new JButton("Replace");	b5=new JButton("Replace All");	
		b3.addActionListener(this);	b4.addActionListener(this);	b5.addActionListener(this);
	
		p2.add(b3);	p2.add(b4);	p2.add(b5);

		frame3.add(p2);	
		frame3.addWindowListener(this);	frame3.setVisible(false);







	frame1.addWindowListener(this);
	frame1.setVisible(true);

	v=new Vector();
	v2=new Vector();
	v3=new Vector();

}




	public void textValueChanged(TextEvent te)
	{
			if(jtp.getTabCount()!=0)
			{	v3.remove(jtp.getSelectedIndex());
				v3.add(jtp.getSelectedIndex(),true);

			}
					
	}


public void keyReleased(KeyEvent ke)
	{}
	
	public void keyTyped(KeyEvent ke)
	{}
	
	
	
	public void keyPressed(KeyEvent ke)
	{
		if(jtp.getTabCount()!=0)
			{	
				v3.remove(jtp.getSelectedIndex());
				v3.add(jtp.getSelectedIndex(),true);
			}
	
	}








public void windowClosing(WindowEvent we)
{
	Window w=we.getWindow();

	if(w==frame1)
	{	int popp=0;
			
			   if(jtp.getTabCount()!=0)
		       {  	 popp=0;
						while(jtp.getTabCount()!=0)
						{ 	
							if((boolean)v3.get(0)==true)
							{  
								popp=0;			
		       					int q=JOptionPane.showConfirmDialog(frame1,"Do you want to save "+jtp.getTitleAt(0)+" ?","Save",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);	

        	       				if(q==JOptionPane.CANCEL_OPTION)
								{popp=1;	break;}	
								else if(q==JOptionPane.YES_OPTION)
		     		 			 {	 
									jtp.setSelectedIndex(0);
									
									
										String title=jtp.getTitleAt(jtp.getSelectedIndex());
										int check;
										if(title.length()==8)
										{title=title.substring(0,7);	check=0;	}
										else{check=1;}
						
						
									if(check==1)
									{
										//Means file already exists just SAVE.....
						
										JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
									
										File file=new File((String)v2.get(jtp.getSelectedIndex()));
									
										//System.out.println(file.getAbsolutePath());
										try
										{
											if(!file.exists())	
											{	file.createNewFile();	}
					
											FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
											fw.write(d);    fw.flush();			//pw3.print(d);	
											fw.close();					//pw3.close();			
							

						

										}
										catch(IOException e)
										{	jta2.setText(e.getMessage());	       }
			

										v3.remove(jtp.getSelectedIndex());
										v3.add(jtp.getSelectedIndex(),false);

									}
									else
									{		
										if(!title.equals("New Tab"))
										{	//Save
								
											JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
								
											File file=new File((String)v2.get(jtp.getSelectedIndex()));
								
											//System.out.println(file.getAbsolutePath());
											try
											{
												if(!file.exists())	
												{	file.createNewFile();	}
					
												FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
												fw.write(d);    fw.flush();			//pw3.print(d);	
												fw.close();					//pw3.close();			
							

						

											}
											catch(IOException e)
											{	jta2.setText(e.getMessage());	       }
			

											v3.remove(jtp.getSelectedIndex());
											v3.add(jtp.getSelectedIndex(),false);
										
										}
										else
										{
											//SAVE AS........

											filechooser = new JFileChooser();
											int result = filechooser.showSaveDialog(null);
											//filechooser.setDialogTitle("Save As");    -----------------------------------------------------------
								
											if(result == JFileChooser.APPROVE_OPTION) 
											{
												File file = filechooser.getSelectedFile();
												JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
												File file1=new File(file.getAbsolutePath()+".java");
														
												v2.remove(jtp.getSelectedIndex());			v2.add(jtp.getSelectedIndex(),file1.getAbsolutePath());				
														
													try
													{
														if(!file1.exists())	
														{	file1.createNewFile();	}
					
					
															PrintWriter pw=new PrintWriter(file1); 		//FileWriter fw=new FileWriter(file1);	
															pw.print(d);						//fw.write(d);     fw.flush();	
															pw.close();						//fw.close();				
							
															jtp.setTitleAt(jtp.getSelectedIndex(),file1.getName());

						

													}
													catch(IOException e)
													{	jta2.setText(e.getMessage());
													}
								
													v3.remove(jtp.getSelectedIndex());
													v3.add(jtp.getSelectedIndex(),false);
				
											}
											else
											{	popp=1; break;
												
											}



										}

									}	
			
								
								
								
								
								
								 }		
								else
								{//Do nothing on NO option being selected in Save/Save As Dialog
								}
							
				
	
						
	
					}
				jtp.removeTabAt(0);		//Remove Tab at 0 index	
				v.remove(0);			
				v3.remove(0);		//Remove boolean value in v3 Vector at 0 index		
				v2.remove(0);			//Remove File Path from v2 Vector at 0 index
					

			}
			
			

		  }
		  else
		  {	System.exit(1);}		

	
	
	}
	else if(w==frame2)
		{
			
			w.setVisible(false);
			w.dispose();
			initpos=0;	lastpos=0;	
		}
		else
		{	
			
			w.setVisible(false);
			w.dispose();
			initpos=0;	lastpos=0;	
		}
		
	
}





public void actionPerformed(ActionEvent ae)
{

	String str=ae.getActionCommand();




		switch(str)
		{


	case "Cut": 	if(jtp.getTabCount()!=0){JTextArea ta1=(JTextArea)v.get(jtp.getSelectedIndex());	ta1.cut(); 	v3.remove(jtp.getSelectedIndex());
											v3.add(jtp.getSelectedIndex(),true);}
					break;
	
	case "Copy":	if(jtp.getTabCount()!=0){JTextArea ta2=(JTextArea)v.get(jtp.getSelectedIndex());  ta2.copy(); }
					break;

	case "Paste":	if(jtp.getTabCount()!=0){JTextArea ta3=(JTextArea)v.get(jtp.getSelectedIndex());   ta3.paste(); v3.remove(jtp.getSelectedIndex());
											v3.add(jtp.getSelectedIndex(),true);}
					break;  

	
	case "New":        jta1=new JTextArea();  jta1.addKeyListener(this);    v.add(jta1);
					   scrollpane=new JScrollPane(jta1);
							if(jtp.getTabCount()==0){tabcounter=1;} 
					   jtp.addTab("New Tab"+tabcounter,scrollpane); 	v2.add("null");
					   v3.add(false);   jtp.setSelectedIndex(jtp.getTabCount()-1); tabcounter++;
					 
					
						break;	

	case "Find":		if(jtp.getTabCount()!=0){frame2.setVisible(true); }
						break;

			
	case "Find & Replace": 	if(jtp.getTabCount()!=0){frame3.setVisible(true);	}
							break;	


	case "Find Next":	if(ae.getSource()==b1)
				{
					JTextArea ta4=(JTextArea)v.get(jtp.getSelectedIndex());		
					String a=t1.getText();		String b=ta4.getText();	
								

					Pattern p=Pattern.compile(a);	
					Matcher m=p.matcher(b);
							
						if(a.equals(""))
						{
						}
						else
						{
								if(m.find(ta4.getCaretPosition()))
								{	
								initpos=m.start();	lastpos=m.end();	//System.out.println(" "+initpos+" "+" "+lastpos);
									
								ta4.select(initpos,lastpos);
								}
								else
								{
									JOptionPane.showMessageDialog(frame1,"Cannot find the pattern!","OOPS",JOptionPane.PLAIN_MESSAGE);						
								}

							
						}

			 	}
				else
				{
					JTextArea ta4=(JTextArea)v.get(jtp.getSelectedIndex());		
					String a=t2.getText();		String b=ta4.getText();	
								

					Pattern p=Pattern.compile(a);	
					Matcher m=p.matcher(b);
							
						if(a.equals(""))
						{
						}
						else
						{
							if(m.find(ta4.getCaretPosition()))
							{	
							initpos=m.start();	lastpos=m.end();	//System.out.println(" "+initpos+" "+" "+lastpos);
									
							ta4.select(initpos,lastpos);
							}
							else
							{
							JOptionPane.showMessageDialog(frame1,"Cannot find the pattern!","OOPS",JOptionPane.PLAIN_MESSAGE);						
							}

									
						}

				
				}		

				break;

	case "Close":	frame2.setVisible(false);	frame2.dispose();	lastpos=0;	initpos=0;
					break;

	case "Replace": 	String a=t2.getText();
						JTextArea ta4=(JTextArea)v.get(jtp.getSelectedIndex());
						String b=ta4.getText();	
						String c=t3.getText();
								
								Pattern p=Pattern.compile(a);	Matcher m=p.matcher(b);
							
								if(a.equals(""))
								{v3.add(jtp.getSelectedIndex(),true);}
								else
								{
									
									if(m.find(ta4.getCaretPosition()))
									{	
									initpos=m.start();	lastpos=m.end();  //System.out.println(" "+initpos+" "+" "+lastpos);
									
									ta4.select(initpos,lastpos);
									
									ta4.replaceRange(c,initpos,lastpos);	lastpos=initpos;
								
									v3.remove(jtp.getSelectedIndex());
									v3.add(jtp.getSelectedIndex(),true);
									}
									else
									{
									JOptionPane.showMessageDialog(frame1,"Cannot find the pattern!","OOPS",JOptionPane.PLAIN_MESSAGE);						
									}

									
								}		

							break;




	case "Replace All": 	String aa=t2.getText();		JTextArea ta5=(JTextArea)v.get(jtp.getSelectedIndex());	String bb=ta5.getText();	
				String cc=t3.getText();
				String ss="";	bb=bb.replaceAll("\r","");
								
						
						Pattern p1=Pattern.compile(aa);	Matcher m1=p1.matcher(bb);
							

							if(aa.equals(""))
							{}
							else 
							{	if(m1.find())
								{
								ss=m1.replaceAll(cc);
								ta5.setText(ss);
								
								v3.remove(jtp.getSelectedIndex());
								v3.add(jtp.getSelectedIndex(),true);
								}
								else
								{
									JOptionPane.showMessageDialog(frame1,"Cannot find the pattern!","OOPS",JOptionPane.PLAIN_MESSAGE);						
								}

							
						
						
							}


				break;
	

	case "Save":		if(jtp.getTabCount()!=0)
				{
								String title=jtp.getTitleAt(jtp.getSelectedIndex());
								int check;
								if(title.length()==8)
								{title=title.substring(0,7);	check=0;	}
								else{check=1;}
						if(check==1)
						{
								//Means file already exists just SAVE.....
						
								JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
								
								File file=new File((String)v2.get(jtp.getSelectedIndex()));
								
								//System.out.println(file.getAbsolutePath());
								try
								{
										if(!file.exists())	
										{
											file.createNewFile();	
										}
					
											FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
											fw.write(d);    fw.flush();			//pw3.print(d);	
											fw.close();					//pw3.close();			
							

						

								}
								catch(IOException e)
								{	jta2.setText(e.getMessage());	       }
			

							v3.remove(jtp.getSelectedIndex());
							v3.add(jtp.getSelectedIndex(),false);

						}
						else
						{		
							if(!title.equals("New Tab"))
							{	//Save
								
								JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
								
								File file=new File((String)v2.get(jtp.getSelectedIndex()));
								
								//System.out.println(file.getAbsolutePath());
								try
								{
										if(!file.exists())	
										{	file.createNewFile();	}
					
											FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
											fw.write(d);    fw.flush();			//pw3.print(d);	
											fw.close();					//pw3.close();			
							

						

								}
								catch(IOException e)
								{	jta2.setText(e.getMessage());	       }
			

								v3.remove(jtp.getSelectedIndex());
								v3.add(jtp.getSelectedIndex(),false);
										
							}
							else
							{
								//SAVE AS........

								filechooser = new JFileChooser();
								int result = filechooser.showSaveDialog(null);
								//filechooser.setDialogTitle("Save As");    -----------------------------------------------------------
								
								if(result == JFileChooser.APPROVE_OPTION) 
								{
										File file = filechooser.getSelectedFile();
										JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
										File file1=new File(file.getAbsolutePath()+".java");
														
										v2.remove(jtp.getSelectedIndex());			v2.add(jtp.getSelectedIndex(),file1.getAbsolutePath());				
														
											try
											{
													if(!file1.exists())	
													{	file1.createNewFile();	}
					
					
													PrintWriter pw=new PrintWriter(file1); 		//FileWriter fw=new FileWriter(file1);	
													pw.print(d);						//fw.write(d);     fw.flush();	
													pw.close();						//fw.close();				
							
													jtp.setTitleAt(jtp.getSelectedIndex(),file1.getName());

						

											}
											catch(IOException e)
											{	jta2.setText(e.getMessage());
											}
								
								v3.remove(jtp.getSelectedIndex());
								v3.add(jtp.getSelectedIndex(),false);
				
								}
								else
								{	v3.remove(jtp.getSelectedIndex());
									v3.add(jtp.getSelectedIndex(),true);
								}



							}

						}	
			
				}	
					
						break;





	case "Save As": 	
	
	if(jtp.getTabCount()!=0)
	{	
				filechooser = new JFileChooser();
				int result = filechooser.showSaveDialog(null);
				//filechooser.setDialogTitle("Save As");    -------------------------------------------------------------------------------------------------------
							
				if(result == JFileChooser.APPROVE_OPTION) 
				{
    			File file = filechooser.getSelectedFile();		
				JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
				File file1=new File(file.getAbsolutePath()+".java");
				System.out.println(file1.getAbsolutePath());
					v2.remove(jtp.getSelectedIndex());			v2.add(jtp.getSelectedIndex(),file1.getAbsolutePath());
				
					try
					{
							if(!file1.exists())	
							{	file1.createNewFile();	}
					
					
							PrintWriter pw=new PrintWriter(file1); 		//FileWriter fw=new FileWriter(file1);	
							pw.print(d);						//fw.write(d);     fw.flush();	
							pw.close();						//fw.close();				
							
							jtp.setTitleAt(jtp.getSelectedIndex(),file1.getName());

						

					}
					catch(IOException e)
					{	jta2.setText(e.getMessage());
					}
				
				

				v3.remove(jtp.getSelectedIndex());
				v3.add(jtp.getSelectedIndex(),false);

				}
				else
				{	v3.remove(jtp.getSelectedIndex());
					v3.add(jtp.getSelectedIndex(),true);
				}
				
	}	
			break;	





	case "Open": 
	
		
				filechooser=new JFileChooser();	
	     		int result1 = filechooser.showOpenDialog(null);
		
	      		if (result1 == JFileChooser.APPROVE_OPTION) 
				{		
    				File file = filechooser.getSelectedFile();
					//JTextArea ta=(JTextArea)v.get(jtp.getSelectedIndex()); 

					File file1=new File(file.getAbsolutePath());   v2.add(file1.getAbsolutePath());
					System.out.println(file.getAbsolutePath());
					
							try
							{	FileInputStream fis=new FileInputStream(file1);
								int ch; String str1="";
								
								while((ch=fis.read())!=-1)
								{	str1+=(char)ch;
								}

								fis.close();
					
								 JTextArea ta1=new JTextArea();  ta1.addKeyListener(this);    v.add(ta1);
								 scrollpane=new JScrollPane(ta1);
							 	if(jtp.getTabCount()==0){tabcounter=1;}
								jtp.addTab("New Tab"+tabcounter,scrollpane);  
								v3.add(false);

								ta1.setText(str1);
								if(jtp.getTabCount()!=0)
								{jtp.setSelectedIndex(jtp.getTabCount()-1);}
								
								jtp.setTitleAt(jtp.getSelectedIndex(),file1.getName());
							}
							catch(IOException e)
							{	jta2.setText(e.getMessage());
							}
				
						
				}
				
			
				

		break;





	 case "Exit": 	
						int popp=0;
			
		    if(jtp.getTabCount()!=0)
		    {  		while(jtp.getTabCount()!=0)
					{	 	
							if((boolean)v3.get(0)==true)
							{  
								popp=0;			
		       					int q=JOptionPane.showConfirmDialog(frame1,"Do you want to save "+jtp.getTitleAt(0)+" ?","Save",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);	

        	       				if(q==JOptionPane.CANCEL_OPTION)
								{popp=1;	break;}	
								else if(q==JOptionPane.YES_OPTION)
		     		 			 {	 
									jtp.setSelectedIndex(0);
									
									
										String title=jtp.getTitleAt(jtp.getSelectedIndex());
										int check;
										if(title.length()==8)
										{title=title.substring(0,7);	check=0;	}
										else{check=1;}
						
						
									if(check==1)
									{
										//Means file already exists just SAVE.....
						
										JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
									
										File file=new File((String)v2.get(jtp.getSelectedIndex()));
									
										//System.out.println(file.getAbsolutePath());
										try
										{
											if(!file.exists())	
											{	file.createNewFile();	}
					
											FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
											fw.write(d);    fw.flush();			//pw3.print(d);	
											fw.close();					//pw3.close();			
							

						

										}
										catch(IOException e)
										{	jta2.setText(e.getMessage());	       }
			

										v3.remove(jtp.getSelectedIndex());
										v3.add(jtp.getSelectedIndex(),false);

									}
									else
									{		
										if(!title.equals("New Tab"))
										{	//Save
								
											JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
								
											File file=new File((String)v2.get(jtp.getSelectedIndex()));
								
											//System.out.println(file.getAbsolutePath());
											try
											{
												if(!file.exists())	
												{	file.createNewFile();	}
					
												FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
												fw.write(d);    fw.flush();			//pw3.print(d);	
												fw.close();					//pw3.close();			
							

						

											}
											catch(IOException e)
											{	jta2.setText(e.getMessage());	       }
			

											v3.remove(jtp.getSelectedIndex());
											v3.add(jtp.getSelectedIndex(),false);
										
										}
										else
										{
											//SAVE AS........

											filechooser = new JFileChooser();
											int result = filechooser.showSaveDialog(null);
											//filechooser.setDialogTitle("Save As");    -----------------------------------------------------------
								
											if(result == JFileChooser.APPROVE_OPTION) 
											{
												File file = filechooser.getSelectedFile();
												JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
												File file1=new File(file.getAbsolutePath()+".java");
														
												v2.remove(jtp.getSelectedIndex());			v2.add(jtp.getSelectedIndex(),file1.getAbsolutePath());				
														
													try
													{
														if(!file1.exists())	
														{	file1.createNewFile();	}
					
					
															PrintWriter pw=new PrintWriter(file1); 		//FileWriter fw=new FileWriter(file1);	
															pw.print(d);						//fw.write(d);     fw.flush();	
															pw.close();						//fw.close();				
							
															jtp.setTitleAt(jtp.getSelectedIndex(),file1.getName());

						

													}
													catch(IOException e)
													{	jta2.setText(e.getMessage());
													}
								
													v3.remove(jtp.getSelectedIndex());
													v3.add(jtp.getSelectedIndex(),false);
				
											}
											else
											{	popp=1; break;
												
											}



										}

									}	
			
								
								
								
								
								
								 }		
								else
								{//Do nothing on NO option being selected in Save/Save As Dialog
								}
							
				
	
						
	
							}
						jtp.removeTabAt(0);		//Remove Tab at 0 index	
						v.remove(0);			
						v3.remove(0);		//Remove boolean value in v3 Vector at 0 index		
						v2.remove(0);			//Remove File Path from v2 Vector at 0 index
					

					}
			
			if(popp==0)
			{System.exit(1);}

		  }
		  else
		  {System.exit(1);}		

		  
		  
			break;









case "Close Me":  		int popps=0;
			 if(jtp.getTabCount()!=0)
			{
						
					if((boolean)v3.get(jtp.getSelectedIndex())==true)
					{  
					
							int q=JOptionPane.showConfirmDialog(frame1,"Do you want to save "+jtp.getTitleAt(jtp.getSelectedIndex())+" ?","Save",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);	

							if(q==JOptionPane.CANCEL_OPTION)
							{popps=1;	}	
							else if(q==JOptionPane.YES_OPTION)
		     		 			 {	 
										String title=jtp.getTitleAt(jtp.getSelectedIndex());
										int check;
										if(title.length()==8)
										{title=title.substring(0,7);	check=0;	}
										else{check=1;}
						
						
									if(check==1)
									{
										//Means file already exists just SAVE.....
						
										JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
									
										File file=new File((String)v2.get(jtp.getSelectedIndex()));
									
										//System.out.println(file.getAbsolutePath());
										try
										{
											if(!file.exists())	
											{	file.createNewFile();	}
					
											FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
											fw.write(d);    fw.flush();			//pw3.print(d);	
											fw.close();					//pw3.close();			
							

						

										}
										catch(IOException e)
										{	jta2.setText(e.getMessage());	       }
			

										v3.remove(jtp.getSelectedIndex());
										v3.add(jtp.getSelectedIndex(),false);

									}
									else
									{		
										if(!title.equals("New Tab"))
										{	//Save
								
											JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
								
											File file=new File((String)v2.get(jtp.getSelectedIndex()));
								
											//System.out.println(file.getAbsolutePath());
											try
											{
												if(!file.exists())	
												{	file.createNewFile();	}
					
												FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
												fw.write(d);    fw.flush();			//pw3.print(d);	
												fw.close();					//pw3.close();			
							

						

											}
											catch(IOException e)
											{	jta2.setText(e.getMessage());	       }
			

											v3.remove(jtp.getSelectedIndex());
											v3.add(jtp.getSelectedIndex(),false);
										
										}
										else
										{
											//SAVE AS........

											filechooser = new JFileChooser();
											int result = filechooser.showSaveDialog(null);
											//filechooser.setDialogTitle("Save As");    -----------------------------------------------------------
								
											if(result == JFileChooser.APPROVE_OPTION) 
											{
												File file = filechooser.getSelectedFile();
												JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
												File file1=new File(file.getAbsolutePath()+".java");
														
												v2.remove(jtp.getSelectedIndex());			v2.add(jtp.getSelectedIndex(),file1.getAbsolutePath());				
														
													try
													{
														if(!file1.exists())	
														{	file1.createNewFile();	}
					
					
															PrintWriter pw=new PrintWriter(file1); 		//FileWriter fw=new FileWriter(file1);	
															pw.print(d);						//fw.write(d);     fw.flush();	
															pw.close();						//fw.close();				
							
															jtp.setTitleAt(jtp.getSelectedIndex(),file1.getName());

						

													}
													catch(IOException e)
													{	jta2.setText(e.getMessage());
													}
								
													v3.remove(jtp.getSelectedIndex());
													v3.add(jtp.getSelectedIndex(),false);
				
											}
											else
											{	popp=1; break;
												
											}



										}

									}	
			
								
								}		
								else
								{//Do nothing on NO option being selected in Save/Save As Dialog
								}
							
				
	
						
	
					}

					if(popps==0)
					{		
							v.remove(0);			
							v3.remove(jtp.getSelectedIndex());		//Remove boolean value in v3 Vector at 0 index		
							v2.remove(jtp.getSelectedIndex());			//Remove File Path from v2 Vector at 0 index
							jtp.removeTabAt(jtp.getSelectedIndex());		//Remove Tab at 0 index	
					}


			}




			break;




case "Close All":		
			
		        if(jtp.getTabCount()!=0)
		       {  	int opps=0;
						while(jtp.getTabCount()!=0)
						{ 	
							if((boolean)v3.get(0)==true)
							{  
								opps=0;			
		       					int q=JOptionPane.showConfirmDialog(frame1,"Do you want to save "+jtp.getTitleAt(0)+" ?","Save",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);	

        	       				if(q==JOptionPane.CANCEL_OPTION)
								{opps=1;	break;}	
								else if(q==JOptionPane.YES_OPTION)
		     		 			 {	 
									jtp.setSelectedIndex(0);
									
									
										String title=jtp.getTitleAt(jtp.getSelectedIndex());
										int check;
										if(title.length()==8)
										{title=title.substring(0,7);	check=0;	}
										else{check=1;}
						
						
									if(check==1)
									{
										//Means file already exists just SAVE.....
						
										JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
									
										File file=new File((String)v2.get(jtp.getSelectedIndex()));
									
										//System.out.println(file.getAbsolutePath());
										try
										{
											if(!file.exists())	
											{	file.createNewFile();	}
					
											FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
											fw.write(d);    fw.flush();			//pw3.print(d);	
											fw.close();					//pw3.close();			
							

						
 
										}
										catch(IOException e)
										{	jta2.setText(e.getMessage());	       }
			

										v3.remove(jtp.getSelectedIndex());
										v3.add(jtp.getSelectedIndex(),false);

									}
									else
									{		
										if(!title.equals("New Tab"))
										{	//Save
								
											JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
								
											File file=new File((String)v2.get(jtp.getSelectedIndex()));
								
											//System.out.println(file.getAbsolutePath());
											try
											{
												if(!file.exists())	
												{	file.createNewFile();	}
					
												FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
												fw.write(d);    fw.flush();			//pw3.print(d);	
												fw.close();					//pw3.close();			
							

						

											}
											catch(IOException e)
											{	jta2.setText(e.getMessage());	       }
			

											v3.remove(jtp.getSelectedIndex());
											v3.add(jtp.getSelectedIndex(),false);
										
										}
										else
										{
											//SAVE AS........

											filechooser = new JFileChooser();
											int result = filechooser.showSaveDialog(null);
											//filechooser.setDialogTitle("Save As");    -----------------------------------------------------------
								
											if(result == JFileChooser.APPROVE_OPTION) 
											{
												File file = filechooser.getSelectedFile();
												JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
												File file1=new File(file.getAbsolutePath()+".java");
														
												v2.remove(jtp.getSelectedIndex());			v2.add(jtp.getSelectedIndex(),file1.getAbsolutePath());				
														
													try
													{
														if(!file1.exists())	
														{	file1.createNewFile();	}
					
					
															PrintWriter pw=new PrintWriter(file1); 		//FileWriter fw=new FileWriter(file1);	
															pw.print(d);						//fw.write(d);     fw.flush();	
															pw.close();						//fw.close();				
							
															jtp.setTitleAt(jtp.getSelectedIndex(),file1.getName());

						

													}
													catch(IOException e)
													{	jta2.setText(e.getMessage());
													}
								
													v3.remove(jtp.getSelectedIndex());
													v3.add(jtp.getSelectedIndex(),false);
				
											}
											else
											{	opps=1; break;
												
											}



										}

									}	
			
								
								
								
								
								
								 }		
								else
								{//Do nothing on NO option being selected in Save/Save As Dialog
								}
							
				
	
						
	
					}
				jtp.removeTabAt(0);		//Remove Tab at 0 index	
				v.remove(0);			
				v3.remove(0);		//Remove boolean value in v3 Vector at 0 index		
				v2.remove(0);			//Remove File Path from v2 Vector at 0 index
					

			}
			
			

		  }
		 	

		  
		  
			break;      	










case "Compile":		String n=(String)v2.get(jtp.getSelectedIndex());	File ff=new File(n);	n=ff.getAbsolutePath();
								int poppy=0;	jta2.setText("");	

			if(jtp.getTabCount()==0)
			{
				JOptionPane.showMessageDialog(frame1,"Please select a file!","File not found",JOptionPane.PLAIN_MESSAGE);


			}
			else if((boolean)v3.get(jtp.getSelectedIndex())==true)
			{
					String title11=jtp.getTitleAt(jtp.getSelectedIndex());
								int check=0;
								if(title11.length()==8)
								{title11=title11.substring(0,7);	}
								else{check=1;}
		
						if(check==1)
									{
										//Means file already exists just SAVE.....
						
										JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
									
										File file=new File((String)v2.get(jtp.getSelectedIndex()));
									
										//System.out.println(file.getAbsolutePath());
										try
										{
											if(!file.exists())	
											{	file.createNewFile();	}
					
											FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
											fw.write(d);    fw.flush();			//pw3.print(d);	
											fw.close();					//pw3.close();			
							

						

										}
										catch(IOException e)
										{	jta2.setText(e.getMessage());	       }
			

										v3.remove(jtp.getSelectedIndex());
										v3.add(jtp.getSelectedIndex(),false);

									}
									else
									{		
										if(!title11.equals("New Tab"))
										{	//Save
								
											JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
								
											File file=new File((String)v2.get(jtp.getSelectedIndex()));
								
											//System.out.println(file.getAbsolutePath());
											try
											{
												if(!file.exists())	
												{	file.createNewFile();	}
					
												FileWriter fw=new FileWriter(file);		//PrintWriter pw3=new PrintWriter(file1); 
												fw.write(d);    fw.flush();			//pw3.print(d);	
												fw.close();					//pw3.close();			
							

						

											}
											catch(IOException e)
											{	jta2.setText(e.getMessage());	       }
			

											v3.remove(jtp.getSelectedIndex());
											v3.add(jtp.getSelectedIndex(),false);
										
										}
										else
										{
											//SAVE AS........

											filechooser = new JFileChooser();
											int result = filechooser.showSaveDialog(null);
											//filechooser.setDialogTitle("Save As");    -----------------------------------------------------------
								
											if(result == JFileChooser.APPROVE_OPTION) 
											{
												File file = filechooser.getSelectedFile();
												JTextArea ta6= (JTextArea)v.get(jtp.getSelectedIndex());	String  d=ta6.getText();
												File file1=new File(file.getAbsolutePath()+".java");
														
												v2.remove(jtp.getSelectedIndex());			v2.add(jtp.getSelectedIndex(),file1.getAbsolutePath());				
														
													try
													{
														if(!file1.exists())	
														{	file1.createNewFile();	}
					
					
															PrintWriter pw=new PrintWriter(file1); 		//FileWriter fw=new FileWriter(file1);	
															pw.print(d);						//fw.write(d);     fw.flush();	
															pw.close();						//fw.close();				
							
															jtp.setTitleAt(jtp.getSelectedIndex(),file1.getName());

						

													}
													catch(IOException e)
													{	jta2.setText(e.getMessage());
													}
								
													v3.remove(jtp.getSelectedIndex());
													v3.add(jtp.getSelectedIndex(),false);
				
											}
											else
											{	poppy=1; 
												
											}



										}

									}	
			
								
								
								
								
								
								 }	
								 		
					if(poppy==0)
					{
					
					
						try
						{	
						Process pro=Runtime.getRuntime().exec("javac \""+n+"\"");
						pro.waitFor();
						String err="";
						int ch;
						BufferedReader br=new BufferedReader(new InputStreamReader(pro.getErrorStream()));	
							while((ch=br.read())!=-1)
							{
							err+=(char)ch;
							//System.out.println(ch);
							}
							if(err.equals(""))
							{//Program Compiled Success

							JOptionPane.showMessageDialog(frame1,"Program Compiled Successfully!","Success",JOptionPane.PLAIN_MESSAGE);


							}
							else
							{jta2.setText(err);
							}
							
						}
						catch(Exception e)
						{jta2.setText(e.getMessage());}
			
				}
		
			else
			{
					try
					{	
					Process pro=Runtime.getRuntime().exec("javac \""+n+"\"");
					pro.waitFor();
					String err="";
					int ch;
					BufferedReader br=new BufferedReader(new InputStreamReader(pro.getErrorStream()));				//BufferedInputStream
						while((ch=br.read())!=-1)
						{
						err+=(char)ch;
						//System.out.println(ch);
						}
						if(err.equals(""))
						{//Program Compiled Success
						JOptionPane.showMessageDialog(frame1,"Program Compiled Successfully!","Success",JOptionPane.PLAIN_MESSAGE);
						
						}
						else
						{jta2.setText(err);
						}
					
					
					}
					catch(Exception e)
					{jta2.setText(e.getMessage());}

			
			}				
		
		 break;

 
 
 case "Run":		


			if(jtp.getTabCount()==0)
			{
				JOptionPane.showMessageDialog(frame1,"Please select a file!","File not found",JOptionPane.PLAIN_MESSAGE);


			}
			else
			{		
				
				String n1=(String)v2.get(jtp.getSelectedIndex());	File ff1=new File(n1); 

				n1=ff1.getParent();
				String n2=jtp.getTitleAt(jtp.getSelectedIndex());
				int ku=n2.indexOf(".java");			
				n2=n2.substring(0,ku);		System.out.println(n2);	
						
			
		
		
					try
					{	Runtime.getRuntime().exec("cmd.exe /k start cmd.exe /k java -cp "+n1+" "+ n2 );
				
					}
					catch(Exception e)
					{jta2.setText(e.getMessage());}

			}

					break; 
default: break;
		}

}

public static void main(String args[])throws Exception
{
	
	Compiler cmp=new Compiler();	
}

}




	
