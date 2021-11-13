package com.hwrpbs.ui.menue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hwrpbs.ui.login.Login;

public class Home implements ActionListener { //implementierung vom action listener
	
	static String stbl = "[STABLE] ";
	static String err = "[ERROR] ";
	static String evt = "[EVENT] ";
	static String act = "[ACTION] ";
	static String log = "[LOG] ";
	
	static int total_tokens = 0;
	static int window_status = 0; //0 = frame ist unsichtbar, 1 = frame ist sichtbar
	
	
	Login login_class = new Login(); //klassen importieren
	Help help_class = new Help();
	Transactions transactions_class = new Transactions();
	Settings settings_class = new Settings();
	Shop shop_class = new Shop();
	
	JFrame frame = new JFrame();
	JButton[] buttons = new JButton[100]; //gui arrays
	JPanel[] panels = new JPanel[100];
	JLabel[] labels = new JLabel[100];
	
	
	
	//user window ist die perspektive aus dem der "normale" user das programm sieht (mobile version)
	public Home() {
		
		System.out.println(stbl + com.hwrpbs.ui.menue.Home.class + " startet");
		
		
	
		
		
		//----------[INITIALISIERUNG]----------
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
		}
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
		}
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}
		
		
		/*
		panel 0 / label 0 - hintergrundsebene
		panel 1 / button 0 - einstellungen
		panel 2 / label 1 - token anzeige
		panel 3 / button 1 - transaktionen
		panel 4 / button 2 - token shop
		panel 5 / button 3 - help panel
		*/
		
		//----------[PANEL SETTINGS]----------
		panels[0].setBounds(0, 0, 385, 762); //panel positionierung
		panels[1].setBounds(350, 5, 30, 30);
		panels[2].setBounds(87, 60, 385, 30);
		panels[3].setBounds(0, 134, 385, 79);
		panels[4].setBounds(0, 227, 385, 167);
		panels[5].setBounds(0, 407, 385, 167);
		
		for (int i = 0; i < panels.length; i++) { //borderlayout einstellungen (0-6)
			
			panels[i].setLayout(new BorderLayout(0, 0));
			
			if (i != 0) { //alle panels außer hintergrundsebene
				panels[i].setOpaque(false);
			}
		}
		
		panels[0].add(labels[0]); //adding to panel
		panels[1].add(buttons[0]);
		panels[2].add(labels[1]);
		panels[3].add(buttons[1]);
		panels[4].add(buttons[2]);
		panels[5].add(buttons[3]);
		
		
		
		//----------[BUTTON SETTINGS]----------
		for (int i = 0; i < buttons.length; i++) { //button einstellungen machen
			buttons[i].setOpaque(false);
			buttons[i].setContentAreaFilled(false);
			buttons[i].setBorderPainted(false);
		}
		
		
		
		//----------[DESIGN SETTINGS]----------
		ImageIcon ui_home_design_icon = new ImageIcon("textures/used/ui_home_design.png"); //background image
		labels[0].setIcon(ui_home_design_icon);
		
		
		
		//----------[TOKEN ANZEIGE]----------
		labels[1].setFont(new Font("Calibri", Font.BOLD, 30)); //text einstellungen
		labels[1].setForeground(Color.BLACK);
		
		if (total_tokens > 1) { //für bessere ausgabe vom angezeigten text
			labels[1].setText(total_tokens + " TKNs"); //if more than one token
		} else {
			if (total_tokens == 0) {
				labels[1].setText("Keine Tokens"); //if 0 token or less
			} else {
				labels[1].setText(total_tokens + " TKN"); //if one token
			}
		}
		
		String total_tokens_string = String.valueOf(total_tokens); //int to string
		if (total_tokens_string.length() > 7 || total_tokens < 0 || total_tokens_string.isEmpty()) { //if to much tokens (more than 99.999) or negative tokens or "null" tokens
			System.err.println(err + "zu viele oder zu wenige tokens");
			labels[1].setText("fehler");
		}
		
		
		
		//----------[MAIN FRAME SETTINGS]----------
		ImageIcon ui_icon_icon = new ImageIcon("textures/container/ui_icon.png");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setBackground(Color.BLACK);
		frame.setSize(400, 800);
		frame.setResizable(false);
		frame.setTitle("mobile > ui.interface.a1");
		frame.setLocation(login_class.getLocation()); //importiert die location (point) des login fensters
		frame.setIconImage(ui_icon_icon.getImage());
		
		
		
	    //----------[UI KLASSEN MANAGER]----------
		frame.add(help_class);
		frame.add(shop_class);
		frame.add(transactions_class);
		frame.add(settings_class);
		
	    
	    
		//----------[FRAME STRUCTURE]----------
		for (int i = 0; i < panels.length; i++) { //panel struktur (1-6)
			frame.add(panels[i]);
		}
	    frame.add(panels[0]); //hintergrundsebene panel (0)
	    
	    
	    
	    //----------[BUTTON ACTION LISTENER]----------
	    for (int i = 0; i < buttons.length; i++) { //alle buttons dem actionlistener zuordneen
	    	buttons[i].addActionListener(this);
	    }

	    
	    //----------[ANDERE KLASSEN ACTION LISTENER]----------
		shop_class.buttons[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(stbl + act + "zurück button");
				shop_class.setVisible(false);
				home_open();
			}
		});
		transactions_class.buttons[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(stbl + act + "zurück button");
				transactions_class.setVisible(false);
				home_open();
			}
		});
		settings_class.buttons[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(stbl + act + "zurück button");
				settings_class.setVisible(false);
				home_open();
			}
		});
		
		
		
		frame.setVisible(true);
	}
	
	
	
    public void actionPerformed(ActionEvent e) { //button action listener | else if damit nicht mherere buttons aufeinmal gedrückt werden können
    	if (e.getSource() == buttons[0]) { //settings listener
    		System.out.println(stbl + act + "settings button");
			
			settings_class.setVisible(true);
    	} else if (e.getSource() == buttons[1]) { //transactions listener
    		System.out.println(stbl + act + "transactions button");
			
			transactions_class.setVisible(true);
    	} else if (e.getSource() == buttons[2]) { //shop listener
    		System.out.println(stbl + act + "shop button");
			
			shop_class.setVisible(true);
		} else if (e.getSource() == buttons[3]) { //help listener
			System.out.println(stbl + act + "help button");
			
			help_class.setVisible(true);
		}
    	home_close(); //nach action event alle buttons weg
    }
	
    
	private void home_close() { //um die buttons der homeseite zu deaktivieren bei öffnen einer anderen seite
		for (int i = 0; i < buttons.length; i++) { //geht alle buttons durch
			buttons[i].setEnabled(false);
		}
	}
	
	
	public void home_open() { //um die buttons wieder zu aktiveiren
		for (int i = 0; i < buttons.length; i++) { //geht alle buttons durch
			buttons[i].setEnabled(true);
		}
	}
}
