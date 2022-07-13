
/*Write a java program to demonstrate basic event handling */

import java.awt.*;
import java.awt.event.*;

class MyEvent extends Frame implements ActionListener
{
TextField tf;
MyEvent()
{
tf= new TextField();
tf.setBounds(60,50,170,20);
Button b=new Button("Click here");
b.setBounds(100,120,80,30);
b.addActionListener(this);
setSize(300,300);
add(b);
add(tf);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("Welcome");
}
public static void main(String args[])
{
MyEvent m=new MyEvent();
}
}
