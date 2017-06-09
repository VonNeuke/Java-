package p5;
//Main.java
import javax.swing.*;
import java.awt.event.*;
public class Main{
	public static void main(String args[]){
		new Menu("B14090515");
	}
}
class Menu extends JFrame {
	JMenuBar menubar;
	JMenu menu;
	JMenuItem item;
	JTextArea ta;
	Menu(String s){
		menubar = new JMenuBar();
		menu = new JMenu("ÎÄ¼þ");
		item = new JMenuItem("ÍË³ö");
		ta = new JTextArea("123");
		menu.add(item);
		menubar.add(menu);
		setJMenuBar(menubar);
		add(ta);
		Act act = new Act();
		item.addActionListener(act);
		setTitle(s);
		setBounds(120,120,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
class Act implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.exit(0);
	}
}