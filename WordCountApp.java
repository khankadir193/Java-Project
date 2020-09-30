import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class WordCountApp extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JButton btn1,btn2,btn3;
	JTextArea ta;
	WordCountApp()
	{
		super("Char WordCount App:-");
		l1 = new JLabel("Characters:");
		l1.setBounds(50,10,100,20);
		add(l1);
		l2 = new JLabel("Words:");
		l2.setBounds(50,40,100,20);
		add(l2);

		ta = new JTextArea();
		ta.setBounds(50,70,300,200);
		add(ta);
		

		btn1 = new JButton("Words:");
		btn1.setBounds(50,270,100,30);
		add(btn1);
		btn1.addActionListener(this);
		btn2 = new JButton("Pad Color");
		btn2.setBounds(150,270,100,30);
		add(btn2);
		btn2.addActionListener(this);
		btn3 = new JButton("Text Color");
		btn3.setBounds(250,270,100,30);
		add(btn3);
		btn3.addActionListener(this);

		setLayout(null);
		setVisible(true);
		setSize(500,500);
		setLocation(200,100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if (e.getSource()==btn1) 
		{
			String text = ta.getText();
			l1.setText("Characters:"+text.length());
			String word[] = text.split("\\s");
			l2.setText("Words:"+word.length);
		}
		else if (e.getSource()==btn2) {
			Color c = JColorChooser.showDialog(this,"Choose Color",Color.BLACK);
			ta.setBackground(c);
		}
		else if (e.getSource()==btn3) {
			Color c = JColorChooser.showDialog(this,"Choose Color",Color.YELLOW);
			ta.setForeground(c);
			
		}
	}

	public static void main(String[] args) {
		new WordCountApp();
	}
}