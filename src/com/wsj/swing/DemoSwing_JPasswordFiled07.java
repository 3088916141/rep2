package com.wsj.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.WindowConstants;

public class DemoSwing_JPasswordFiled07 {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	jf.setSize(250,250);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	JLabel jLabe1 = new JLabel("密码");
	JPasswordField pass1 = new JPasswordField(10);
	
	panel.add(jLabe1);
	panel.add(pass1);
	jf.setContentPane(panel);
	jf.setVisible(true);
}
}
