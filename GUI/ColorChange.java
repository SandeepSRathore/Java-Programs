import java.awt.*;
import java.awt.event.*;
class ColorChange implements AdjustmentListener
{
	Frame f;
	Panel p1,p2;
	Scrollbar rsb,gsb,bsb;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	public ColorChange()
	{
		f=new Frame();
		f.setSize(600,400);
		f.setVisible(true);
		p1=new Panel();
		p1.setLayout(new GridLayout(0,3));
		f.add(p1,BorderLayout.EAST);
		rsb=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		rsb.setBackground(Color.red);
		rsb.addAdjustmentListener(this);
		p1.add(rsb);
		gsb=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		gsb.setBackground(Color.green);
		gsb.addAdjustmentListener(this);
		p1.add(gsb);
		bsb=new Scrollbar(Scrollbar.VERTICAL,0,5,0,260);
		bsb.setBackground(Color.blue);
		bsb.addAdjustmentListener(this);
		p1.add(bsb);
		p2=new Panel();
		p2.setBackground(Color.lightGray);
		l1=new Label("Red");
		t1=new TextField(5);
		p2.add(l1);	p2.add(t1);
		l2=new Label("Green");
		t2=new TextField(5);
		p2.add(l2);	p2.add(t2);
		l3=new Label("Blue");
		t3=new TextField(5);
		p2.add(l3);	p2.add(t3);
		f.add(p2,BorderLayout.SOUTH);
	}
	public void adjustmentValueChanged(AdjustmentEvent e)
	{
		int r=rsb.getValue();
		int g=gsb.getValue();
		int b=bsb.getValue();
		t1.setText(r+"");
		t2.setText(g+"");
		t3.setText(b+"");
		Color c=new Color(r,g,b);
		f.setBackground(c);
	}
	public static void main(String args[])
	{
		ColorChange cc=new ColorChange();
	}
}