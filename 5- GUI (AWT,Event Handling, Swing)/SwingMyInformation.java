import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * Write a program to create a window with four text fields for the name, 
 * street, city and pincode with suitable labels. Also windows contains a button MyInfo. 
 * When the user types the name, his street, city and pincode and then clicks the button, 
 * the types details must appear in Arial Font with Size 32, Italics.
 */
public class SwingMyInformation {
	static JTextField name_txt;
	static JTextField sname_txt;
	static JTextField cname_txt;
	static JTextField pincode_txt;
	static JButton submit_btn;
	static JTextArea output_txtArea;
	
	
	public static void main(String[] args) {
		//Step1: Create a Frame
		JFrame frame=new JFrame("MY INFORMATION");
		frame.setBounds(700,700,1000,700);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Step2: Change Background
		Container c=frame.getContentPane();
		c.setLayout(null);
		c.setBackground(Color.WHITE);
		
		//Step 3: Heading
		Font f= new Font("Arial",Font.ITALIC,32);
		JLabel heading_lbl=new JLabel();
		heading_lbl.setBounds(250, 70, 400, 40);
		heading_lbl.setText("MY INFORMATION");
		heading_lbl.setFont(f);
		c.add(heading_lbl);
		
		
		Font f1= new Font("Arial",Font.ITALIC,20);
		JLabel name_lbl=new JLabel("Name  : ");
		name_lbl.setBounds(50, 150, 200, 30);
		name_txt =new JTextField();
		name_txt.setBounds(180, 150, 200, 30);
		name_txt.setFont(f1);
		
		JLabel sname_lbl=new JLabel("Street  : ");
		sname_lbl.setBounds(50, 230, 200, 30);
		sname_txt =new JTextField();
		sname_txt.setBounds(180, 230, 200, 30);
		sname_txt.setFont(f1);
		
		JLabel cname_lbl=new JLabel("City  : ");
		cname_lbl.setBounds(50, 310, 200, 30);
		cname_txt =new JTextField();
		cname_txt.setBounds(180, 310, 200, 30);
		cname_txt.setFont(f1);
		
		JLabel pincode_lbl=new JLabel("Pincode  : ");
		pincode_lbl.setBounds(50, 390, 200, 30);
		pincode_txt =new JTextField();
		pincode_txt.setBounds(180, 390, 200, 30);
		pincode_txt.setFont(f1);
		
		submit_btn=new JButton("MyInfo");
		submit_btn.setBounds(300, 450, 160, 40);
		submit_btn.setFont(f1);
		
		output_txtArea = new JTextArea();
		output_txtArea.setBounds(500, 200, 500, 500);
		output_txtArea.setFont(f);
		
		c.add(name_lbl);
		c.add(sname_lbl);
		c.add(cname_lbl);
		c.add(pincode_lbl);
		
		c.add(name_txt);
		c.add(sname_txt);
		c.add(cname_txt);
		c.add(pincode_txt);
		
		c.add(output_txtArea);
		c.add(submit_btn);
		
		submit_btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				submit_action(e);
			}
		});
		
	}


	protected static void submit_action(ActionEvent e) {
		// TODO Auto-generated method stub
		String name=name_txt.getText();
		String sname=sname_txt.getText();
		String cname=cname_txt.getText();
		String pincode=pincode_txt.getText();
		
		output_txtArea.setText("Name : "+name+"\n\n Street : "+sname+"\n\n City : "+cname+"\n\n Pincode : "+pincode);
		
	}

}
