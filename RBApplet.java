import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//<applet code="RBApplet" width=300 height=300>
//</applet>
public class RBApplet extends Applet implements ItemListener
{
Checkbox r1,r2,r3;
public void init()
{
Label l=new Label("Click Radio Button");
CheckboxGroup cbg=new CheckboxGroup();
r1=new Checkbox("Red",cbg,true);
r2=new Checkbox("Green",cbg,false);
r3=new Checkbox("Blue",cbg,false);
r1.addItemListener(this);
r2.addItemListener(this);
r3.addItemListener(this);
add(l);add(r1);add(r2);add(r3);
}
public void itemStateChanged(ItemEvent ae)
{
if(r1.getState())
setBackground(Color.red);
else if(r2.getState());
setBackground(Color.blue);
repaint();
}
}
