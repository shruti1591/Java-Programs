/*Write a Java program to create Student Profile form using AWT controls*/

import java.awt.*;
class AWTExample2 {
AWTExample2() {
Frame f = new Frame();
Label l = new Label("Student name:");
Label l1 = new Label("Student roll no:");
Label l2 = new Label("divison:");
Button b = new Button("Submit");
TextField t = new TextField();
TextField t1 = new TextField();
l.setBounds(20, 80, 80, 30);
t.setBounds(120, 80, 80, 30);
l1.setBounds(20, 140, 80, 30);
t1.setBounds(120, 140, 80, 30);
l2.setBounds(20,250,80,30);
b.setBounds(100, 400, 80, 30);
Choice c = new Choice();
c.setBounds(20, 200, 75, 75);
c.add("1st year");
c.add("2nd year");
c.add("3rd year");
c.add("4th year");
CheckboxGroup cbg = new CheckboxGroup();
Checkbox checkBox1 = new Checkbox("A", cbg, false);
checkBox1.setBounds(80,250, 25,25);
Checkbox checkBox2 = new Checkbox("B", cbg, false);
checkBox2.setBounds(80,300, 25,25);
f.add(checkBox1); f.add(checkBox2);
f.add(c);
f.add(b);
f.add(l);
f.add(t);
f.add(l1);
f.add(t1);
f.setSize(600,600);
f.setTitle("Student info");
f.setLayout(null);
f.setVisible(true);
}
public static void main(String args[]) {
AWTExample2 awt_obj = new AWTExample2();
}
}