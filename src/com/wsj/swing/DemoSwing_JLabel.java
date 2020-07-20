package com.wsj.swing;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class DemoSwing_JLabel {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	
	JLabel label01 = new JLabel();
	label01.setText("测试类label01");
	label01.setFont(new Font(null, Font.PLAIN,25));
	
	JLabel label02 = new JLabel();
	label01.setIcon(new ImageIcon("aaa.jpg") );
	
	JLabel label03 = new JLabel();
	label03.setText("测试类label03");
	label03.setFont(new Font(null, Font.PLAIN,25));
	label03.setIcon(new ImageIcon("aaa.jpg") );
	label03.setHorizontalTextPosition(SwingConstants.CENTER);
	
	panel.add(label01);
	//panel.add(label02);
	//panel.add(label03);
	
	jf.setContentPane(panel);
	jf.pack();
	jf.setVisible(true);
}
}
