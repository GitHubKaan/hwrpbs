package com.hwrps.ui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Transactions extends JPanel {
	
	static String stbl = "[STABLE] ";
	
	
	JLabel[] labels = new JLabel[1];
	
	
	public Transactions() {
		
		System.out.println(stbl + com.hwrps.ui.Transactions.class + " startet");
		
		
		//----------[INITIALISIERUNG]----------
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}
		
		
		
		setBounds(0, 0, 385, 762);
		setVisible(false);
		setLayout(new BorderLayout(0, 0));
		
		ImageIcon ui_transactions_design_icon = new ImageIcon("designs/used/ui_transactions_design.png");
		labels[0].setIcon(ui_transactions_design_icon);
		add(labels[0]);
	}
}