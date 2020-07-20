package com.wsj.swing;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DemoSwing_JComboBox09 {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	jf.setSize(500,500);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	JPanel panel = new JPanel();
	
	String[] list = {"海贼王","一拳超人","火影忍者"};
	JComboBox<String> comboBox = new JComboBox<>(list);
    comboBox.addItemListener(new ItemListener() {
		
		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			System.out.println(comboBox.getSelectedIndex());
			System.out.println(comboBox.getSelectedItem());
		}
	});
    
    comboBox.setSelectedIndex(2);
    
    panel.add(comboBox);
    jf.setContentPane(panel);
	jf.setVisible(true);
}
}
