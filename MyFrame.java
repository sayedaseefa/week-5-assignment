import java.awt.*;
class MyFrame extends Frame
{
MyFrame()
{
super("Simple Frame");
}
public static void main(String a[])
{
MyFrame mf=new MyFrame();
mf.setSize(200,200);
mf.setVisible(true);
}
}