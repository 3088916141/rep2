package com.wsj.swing;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Demoday01_zuoye {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	jf.setSize(500,500);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	JLabel TextFiled = new JLabel("用户名:");
	JTextField text1 = new JTextField(8);
	
	JLabel PasswordFile = new JLabel("密码:");
	JPasswordField pass1 = new JPasswordField(10);
	
	
	JLabel label01 = new JLabel();
	label01.setText("性别");
	label01.setFont(new Font(null, Font.PLAIN,12));
	JRadioButton radioButton1 = new JRadioButton("男");
	JRadioButton radioButton2 = new JRadioButton("女");
	ButtonGroup ButtonGroup = new ButtonGroup();
	ButtonGroup.add(radioButton1);
	ButtonGroup.add(radioButton2);
	radioButton1.setSelected(true);
	
	JLabel label02 = new JLabel();
	label02.setText("爱好:");
	label02.setFont(new Font(null, Font.PLAIN,12));
	JCheckBox checkBox1 = new JCheckBox("看书");
	JCheckBox checkBox2 = new JCheckBox("运动");
	JCheckBox checkBox3 = new JCheckBox("打游戏");
	
	JLabel label03 = new JLabel();
	label03.setText("自我介绍:");
	label03.setFont(new Font(null, Font.PLAIN,12));
	JTextArea textArea = new JTextArea();
	textArea.setLineWrap(true);
	
	JButton button = new JButton("提交");
	
	panel.add(TextFiled);
	panel.add(text1);
	panel.add(PasswordFile);
	panel.add(pass1);
	panel.add(label01);
	panel.add(radioButton1);
	panel.add(radioButton2);
	panel.add(label02);
	panel.add(checkBox1);
	panel.add(checkBox2);
	panel.add(checkBox3);
	panel.add(label03);
	panel.add(textArea);
	panel.add(button);
	jf.setContentPane(panel);
	jf.setVisible(true);
}
}
