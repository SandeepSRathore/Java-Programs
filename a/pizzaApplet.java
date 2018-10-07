
import java.awt.*;
import java.applet.*;
public class pizzaApplet extends Applet
{
public void init()
{
CheckboxGroup pizzaGroup=new CheckboxGroup();
Checkbox cbLarge=new Checkbox("Large pizza",pizzaGroup,false);
Checkbox cbMedium=new Checkbox("Medium pizza",pizzaGroup,false);
Checkbox cbSmall=new Checkbox("Small pizza",pizzaGroup,true);
add(cbLarge);
add(cbMedium);
add(cbSmall);
}
}