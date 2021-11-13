package com.hwrpbs.ui.menue;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Settings extends JPanel implements ActionListener {
static String stbl = "[STABLE] ";
	
	
	JLabel[] labels = new JLabel[1];
	
	JPanel[] panels = new JPanel[100];
	JButton[] buttons = new JButton[100];
	
	public Settings() {
		
		System.out.println(stbl + com.hwrpbs.ui.menue.Settings.class + " startet");
		
		setBounds(0, 0, 385, 762);
		setVisible(false);
		setLayout(new BorderLayout(0, 0));
		
		
		//----------[INITIALISIERUNG]----------
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}
		
		
		
		//----------[INITIALISIERUNG]----------
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
		}
		for (int i = 0; i <	buttons.length; i++) {
			buttons[i] = new JButton();
		}
		
		
		
		//----------[BUTTON EINSTELLUNGEN]----------
		//zurück button
		panels[0].setBounds(10, 10, 37, 37);
		panels[0].setLayout(new BorderLayout(0, 0));
		panels[0].setOpaque(false);
		panels[0].add(buttons[0]);
		buttons[0].setOpaque(false);
		buttons[0].setContentAreaFilled(false);
		buttons[0].setBorderPainted(false);
		
		
		//----------[PANEL HIERARCHIE]----------
		for (int i = 0; i < panels.length; i++) {
			add(panels[i]);
		}
		
		
	    //----------[BUTTON ACTION LISTENER]----------
	    for (int i = 0; i < buttons.length; i++) { //alle buttons dem actionlistener zuordneen
	    	buttons[i].addActionListener(this);
	    }

		
		ImageIcon ui_settings_design_icon = new ImageIcon("textures/used/ui_settings_design.png");
		labels[0].setIcon(ui_settings_design_icon);
		add(labels[0]);
	}
	
	public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == buttons[1]) {
    		System.out.println("test");
    	}
    }
}