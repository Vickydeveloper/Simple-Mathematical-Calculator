//Simple mathematical calculaor using java swing concept

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
public class Calculator implements ActionListener {

	JButton b1,b2,b3,b4,b5;
	JTextField tf1,tf2,tf3;
	JLabel lb1,lb2,lb3;
	JFrame f;
	
	Calculator() {
		
		f = new JFrame("Basic Calculator");
		f.setSize(600,400);
		f.getContentPane().setBackground(Color.yellow);

		lb1 = new JLabel("Enter the first value");
		lb1.setBounds(100,40,150,20);

		tf1 = new JTextField();
		tf1.setBounds(270,40,150,20);

		lb2 = new JLabel("Enter the second value");
		lb2.setBounds(100,80,150,20);

		tf2 = new JTextField();
		tf2.setBounds(270,80,150,20);

		lb3 = new JLabel("Result");
		lb3.setBounds(100,120,150,20);

		tf3 = new JTextField();
		tf3.setBounds(270,120,150,20);

		b1 = new JButton("+");
		b1.setBounds(100,170,50,40);

		b2 = new JButton("-");
		b2.setBounds(170,170,50,40);


		b3 = new JButton("*");
		b3.setBounds(240,170,50,40);

		b4 = new JButton("/");
		b4.setBounds(310,170,50,40);

		b5 = new JButton("%");
		b5.setBounds(380,170,50,40);

		f.add(lb1);
		f.add(lb2);
		f.add(lb3);
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(b5);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);

		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {

	int a = Integer.parseInt(tf1.getText());
	int b = Integer.parseInt(tf2.getText());

	if(e.getSource() == b1) {
		int add = a+b;
		tf3.setText(String.valueOf(add));
	}
	if(e.getSource() == b2) {
		int sub = a-b;
		tf3.setText(String.valueOf(sub));
	}
	if(e.getSource() == b3) {
		int mul= a*b;
		tf3.setText(String.valueOf(mul));
	}
	if(e.getSource() == b4) {
		int div = a/b;
		tf3.setText(String.valueOf(div));
	}
	if(e.getSource() == b5) {
		int mdiv = a%b;
		tf3.setText(String.valueOf(mdiv));
	}
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}



