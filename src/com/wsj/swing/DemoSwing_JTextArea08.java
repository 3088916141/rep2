package com.wsj.swing;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class DemoSwing_JTextArea08 {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	jf.setSize(500,500);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	
	JTextArea textArea = new JTextArea();
	textArea.setLineWrap(true);
	
	panel.add(textArea);
	jf.setContentPane(panel);
	jf.setVisible(true);
}
}
