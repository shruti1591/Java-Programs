import java.awt.*;
class myawt1
{
myawt1()
{
Frame f=new Frame();
Label l=new Label("Employee ID");
TextField t=new TextField();
Button b= new Button("Submit");

f.setSize(400,300);
l.setBounds(20,80,80,30);
t.setBounds(60,110,80,30);
b.setBounds(100,100,80,30);

f.add(l);
f.add(t);
f.add(b);

f.setTitle("Employee registration form");
f.setVisible(true);
f.setLayout(null);
}
public static void main(String args[])
{
myawt1 m=new myawt1();
}}