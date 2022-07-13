import java.awt.*;
public class myawt extends Frame
{

myawt()
{
Button b=new Button("Submit");
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setTitle("My Frame");
setLayout(null);
setVisible(true);
}
public static void main(String ar[])
{
myawt m=new myawt();
}}