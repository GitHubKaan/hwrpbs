package com.hwrps.ui;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Shop extends JPanel {

	static String stbl = "[STABLE] ";

	
	JLabel[] labels = new JLabel[1];

	
	public Shop() {

		System.out.println(stbl + com.hwrps.ui.Shop.class + " startet");

		
		
		// ----------[INITIALISIERUNG]----------
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}

		
		
		setBounds(0, 0, 385, 762);
		setVisible(false);
		setLayout(new BorderLayout(0, 0));
		
		ImageIcon ui_shop_design_icon = new ImageIcon("designs/used/ui_shop_design.png");
		labels[0].setIcon(ui_shop_design_icon);
		add(labels[0]);
	}
}
