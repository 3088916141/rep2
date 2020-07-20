package com.wsj.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class DemoSwing_JTextFiled06 {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	jf.setSize(250,250);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	JLabel jLabe1 = new JLabel("用户名:");
	JTextField text1 = new JTextField(8);
	JLabel jLabe2 = new JLabel("姓名:");
	JTextField text2 = new JTextField(8);
	
	JButton button = new JButton("提交");
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String text = text1.getText();
			System.out.println("提交到服务器" + text);
		}
	});
	panel.add(jLabe1);
	panel.add(text1);
	panel.add(jLabe2);
	panel.add(text2);
	panel.add(button);
	jf.setContentPane(panel);
	jf.setVisible(true);

}
}
