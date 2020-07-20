package com.wsj.swing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class DemoSwing_JRadioButton04 {
public static void main(String[] args) {
JFrame jf = new JFrame("测试窗口");
	
	jf.setSize(250,250);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	
	JRadioButton radioButton1 = new JRadioButton("男");
	JRadioButton radioButton2 = new JRadioButton("女");
	
	ButtonGroup ButtonGroup = new ButtonGroup();
	ButtonGroup.add(radioButton1);
	ButtonGroup.add(radioButton2);
	
	radioButton1.setSelected(true);
	
	panel.add(radioButton1);
	panel.add(radioButton2);
	
	jf.setContentPane(panel);
	jf.setVisible(true);
}
}
