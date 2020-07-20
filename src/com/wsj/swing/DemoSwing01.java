package com.wsj.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DemoSwing01 {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	
	jf.setSize(250,250);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	
	JButton button = new JButton("测试按钮");
	panel.add(button);
	
	jf.setContentPane(panel);
	
	jf.setVisible(true);
	
}
}
