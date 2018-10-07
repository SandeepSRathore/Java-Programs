import java.awt.*;
import java.applet.*;
public class Demo extends Applet
{
	public void init()
	{
	Label l=new Label("enter the name");
	add(l);
	TextField tf=new TextField();
	add(tf);
	Button b=new Button("click");
	add(b);
	}
}