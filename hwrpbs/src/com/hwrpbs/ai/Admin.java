package com.hwrpbs.ai;

import java.awt.Color;

import javax.swing.JFrame;

public class Admin {
	public Admin() {

		//main admin
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 300);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setLocation(0, 0);
		
		
		frame.setVisible(true);
	}
}
