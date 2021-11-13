package com.hwrpbs.ui.menue;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Help extends JPanel { //das ist die hilfe seite
	
	static String stbl = "[STABLE] ";
	
	
	JLabel[] labels = new JLabel[100];
	
	
	public Help() {
		
		System.out.println(stbl + com.hwrpbs.ui.menue.Help.class + " startet");
		
		
		// ----------[INITIALISIERUNG]----------
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}
		
		
		
		setBounds(0, 0, 385, 762);
		setVisible(false);
		setLayout(new BorderLayout(0, 0));
		
		ImageIcon ui_help_design_icon = new ImageIcon("textures/used/ui_help_design.png");
		labels[0].setIcon(ui_help_design_icon);
		add(labels[0]);
	}
}
