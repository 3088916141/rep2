package com.wsj.swing;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class DemoSwing_JCheckBox05 {
public static void main(String[] args) {
	JFrame jf = new JFrame("测试窗口");
	jf.setSize(250,250);
	jf.setLocationRelativeTo(null);
	jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	JPanel panel = new JPanel();
	
	JCheckBox c1 = new JCheckBox("lol");
	JCheckBox c2 = new JCheckBox("cf");
	JCheckBox c3 = new JCheckBox("dnf");
	
	c1.addChangeListener(new ChangeListener() {
		
		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			JCheckBox j1 = (JCheckBox) e.getSource();
			System.out.println("状态:" + j1.isSelected());
		}
	});
	
	panel.add(c1);
	panel.add(c2);
	panel.add(c3);
	jf.setContentPane(panel);
	jf.setVisible(true);
}
}
