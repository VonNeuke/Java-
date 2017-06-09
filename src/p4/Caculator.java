package p4;
//Caculator.java
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Caculator {

	public static void main(String[] args) {
		new MyWin();
	}

}
class MyWin extends JFrame implements ActionListener{
	JTextField tf1,tf2,tf3;
	JButton bt1,bt2,bt3,bt4;
	JLabel lb1,lb2;
	JPanel p1,p2,p3,p4,p5,p6;
	MyWin(){
		FlowLayout flow = new FlowLayout();
		flow.setAlignment(FlowLayout.CENTER);
		GridLayout grid = new GridLayout(2,2);
		grid.setHgap(30);
		grid.setVgap(10);
		GridLayout grid1 = new GridLayout(1,2);
		grid1.setHgap(10);
		bt1 = new JButton("+");
		bt2 = new JButton("-");
		bt3 = new JButton("*");
		bt4 = new JButton("/");
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		p6 = new JPanel();
		p1.setLayout(flow);
		p1.add(bt1);
		p1.add(bt2);
		p1.add(bt3);
		p1.add(bt4);
		add(p1,BorderLayout.SOUTH);
		lb1 = new JLabel("请输入两个数：");
		lb1.setHorizontalAlignment(JLabel.RIGHT);
//		lb1.setVerticalAlignment(JLabel.NORTH);
		lb2 = new JLabel("计算结果：");
		lb2.setHorizontalAlignment(JLabel.RIGHT);
		tf3 = new JTextField(10);
		p2.setLayout(grid);
		p2.add(lb1);
		p2.add(p3);
		p2.add(lb2);
		p2.add(tf3);
		add(p2,BorderLayout.CENTER);
		tf1 = new JTextField(5);
		tf2 = new JTextField(5);
//		
		p3.setLayout(grid1);
		p3.add(tf1);
		p3.add(tf2);

		add(p4,BorderLayout.EAST);
		add(p5,BorderLayout.WEST);
		add(p6,BorderLayout.NORTH);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		setBounds(400,200,320,130);
		setTitle("计算器");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e){
		double num1,num2,result;
		result = 0;
		if(!(tf1.getText().equals(""))&&!(tf2.getText().equals(""))){
			num1 = Double.parseDouble(tf1.getText());
			num2 = Double.parseDouble(tf2.getText());
			if(e.getSource()==bt1)
				result = num1+num2;
			else if(e.getSource()==bt2)
				result = num1-num2;
			else if(e.getSource()==bt3)
				result = num1*num2;
			else if(e.getSource()==bt4)
				result = num1/num2;
			tf3.setText(String.valueOf(result));
		}
	}
}

