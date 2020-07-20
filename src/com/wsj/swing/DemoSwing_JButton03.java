package com.wsj.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class DemoSwing_JButton03 {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	
	jf.setSize(250,250);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	JButton button = new JButton("测试按钮");
	
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("一个字符串");
		}
	});
	
	button.addActionListener((e)->System.out.println("另一个字符串"));
	
	panel.add(button);
	
	jf.setContentPane(panel);
	jf.setVisible(true);
	
}
}

