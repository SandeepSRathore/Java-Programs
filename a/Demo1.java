import java.io.*;
import java.awt.*;
class Demo1
{
	public static void main(String args[])
{
Frame f=new Frame();
f.setSize(400,300);
f.setLayout(new FlowLayout());
Label l=new Label("Enter Name");
f.add(l);
TextField t=new TextField(20);
f.add(t);
Button b1=new Button("ok");
f.add(b1);
Button b2=new Button("cancel");
f.add(b2);
f.setVisible(true);
}
}