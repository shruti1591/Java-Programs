/*Write a program to create a window with four text fields for the name, street, city and pincode with suitable labels. Also windows contains a button MyInfo. When the user types the name, his street, city and pincode and then clicks the button, the types details must appear in Arial Font with Size 32, Italics*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class TestingSwing1 {
static JTextField name_text;
static JTextField sname_text;
static JTextField cname_text;
static JTextField pincode_text;
static JButton submit_button;
static JTextArea output_text;
public static void main(String[] args)
{
JFrame frame = new JFrame();
frame.setBounds(300, 300, 1000, 700);
frame.setVisible(true);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container c = frame.getContentPane();
c.setLayout(null);
c.setBackground(Color.WHITE);
Font fo = new Font("Arial", Font.ITALIC, 32);
JLabel heading_lb1 = new JLabel();
heading_lb1.setBounds(250,70,400,40);
heading_lb1.setText("My Information");
heading_lb1.setFont(fo);
c.add(heading_lb1);
Font f1 = new Font("Arial", Font.ITALIC, 22);
JLabel name_lb1 = new JLabel("Name : ");
name_lb1.setBounds(50, 150, 200, 30);
name_text = new JTextField();
name_text.setBounds(180, 150, 200, 30);
name_text.setFont(f1);
c.add(name_lb1);
c.add(name_text);
JLabel name_lb2 = new JLabel("Surname : ");
name_lb2.setBounds(50, 200, 200, 30);
sname_text = new JTextField();
sname_text.setBounds(180, 200, 200, 30);
sname_text.setFont(f1);
c.add(name_lb2);
c.add(sname_text);
JLabel name_lb3 = new JLabel("College Name : ");
name_lb3.setBounds(50, 250, 200, 30);
cname_text = new JTextField();
cname_text.setBounds(180, 250, 200, 30);
cname_text.setFont(f1);
c.add(name_lb3);
c.add(cname_text);
JLabel name_lb4 = new JLabel("Pincode : ");
name_lb4.setBounds(50, 300, 200, 30);
pincode_text = new JTextField();
pincode_text.setBounds(180, 300, 200, 30);
pincode_text.setFont(f1);
submit_button = new JButton("My Info");
submit_button.setBounds(300, 550, 160, 40);
submit_button.setFont(f1);
c.add(name_lb4);
c.add(pincode_text);
output_text = new JTextArea();
output_text.setBounds(500, 200, 500, 500);
output_text.setFont(fo);
c.add(output_text);
c.add(submit_button);
submit_button.addActionListener(new ActionListener()
{
@Override
public void actionPerformed(ActionEvent e) {
submit_action(e);
}
});
}
protected static void submit_action(ActionEvent e) {
String name = name_text.getText();
String name1 = sname_text.getText();
String name2 = cname_text.getText();
String name3 = pincode_text.getText();
output_text.setText("name : "+name+"\n"+"surname : "+name1+"\n"+"College name : "+name2+"\n"+"pincode : "+name3);
}
}