import java.awt.*;
class Question
{
	public static void main(String args[])
	{
		Frame f=new Frame();
		f.setSize(800,600);
		f.setVisible(true);
		Panel ques=new Panel();
		Label l=new Label("Ques.1  What is the capital of Rajasthan ?");
		ques.add(l);
		f.add(ques,BorderLayout.NORTH);
		Panel answer=new Panel();
		answer.setLayout(new GridLayout(4,0));
		CheckboxGroup ans=new CheckboxGroup();
		Checkbox cb1=new Checkbox("Ajmer",ans,false);
		Checkbox cb2=new Checkbox("Jodhpur",ans,false);
		Checkbox cb3=new Checkbox("Jaipur",ans,false);
		Checkbox cb4=new Checkbox("Bikaner",ans,false);
		answer.add(cb1);
		answer.add(cb2);
		answer.add(cb3);
		answer.add(cb4);
		f.add(answer,BorderLayout.CENTER);
		Panel dec=new Panel();
		Button b1=new Button("Prev");
		Button b2=new Button("Next");
		dec.add(b1);
		dec.add(b2);
		f.add(dec,BorderLayout.SOUTH);
	}
}