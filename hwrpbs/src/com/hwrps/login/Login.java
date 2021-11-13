package com.hwrps.login;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.hwrps.main.Terminal;
import com.hwrps.ui.Home;
import com.hwrps.ui.Shop;
import com.sun.jdi.Location;

public class Login {
	
	static String stbl = "[STABLE] ";
	static String err = "[ERROR] ";
	static String evt = "[EVENT] ";
	static String act = "[ACTION] ";
	static String log = "[LOG] ";
	
	static Point loc;
	
	Terminal terminal_methods = new Terminal(); //klassen methoden importieren
	Home user_class; //klassen abrufen
	
	JFrame frame = new JFrame();
	JPanel[] panels = new JPanel[3];
	JLabel[] labels = new JLabel[1];
	JButton[] buttons = new JButton[1];
	
	
	public Login() {
		
		System.out.println(stbl + com.hwrps.login.Login.class + " startet");
		
		//----------[INITIALISIERUNG]----------
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
		}
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
		}
		
		
		
		//----------[MAIN FRAME SETTINGS]----------
		ImageIcon ui_icon_icon = new ImageIcon("designs/container/ui_icon.png");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setBackground(Color.BLACK);
		frame.setSize(400, 800);
		frame.setResizable(false);
		frame.setTitle("mobile > ui.interface.a0");
		frame.setLocationRelativeTo(null);
		frame.setIconImage(ui_icon_icon.getImage());
		
		
		
		//----------[BUTTON SETTINGS]----------
		buttons[0].setOpaque(false);
		buttons[0].setContentAreaFilled(false);
		buttons[0].setBorderPainted(false);
		
		
		
		//----------[PANEL SETTINGS]----------
		panels[0].setBounds(0, 0, 385, 762);
		panels[1].setBounds(135, 440, 115, 30);
		panels[2].setBounds(0, 0, 100, 100);
		
		for (int i = 0; i < panels.length; i++) {
			panels[i].setLayout(new BorderLayout(0, 0));
			
			if (i != 0) {
				panels[i].setOpaque(false);
			}
		}
		
		panels[0].add(labels[0]);
		panels[1].add(buttons[0]);
		
		
		
		//----------[DESIGN SETTINGS]----------
		ImageIcon ui_home_design_icon = new ImageIcon("designs/used/login_login_design.png"); //background image
		labels[0].setIcon(ui_home_design_icon);
		
		
		
		//----------[DESIGN SETTINGS]----------
	    frame.add(panels[0]);
	    frame.add(panels[1]);
	    frame.add(panels[2]);
	    
	    
	  	
	    //----------[ACTION LISTENER]----------
	    buttons[0].addActionListener(new ActionListener() { //settings listener
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(stbl + act + "login button");
				
				loc = frame.getLocationOnScreen();
				
				frame.setVisible(false); //login fenster schließen

				user_class = new Home(); //startet home fenster klasse
			}
		});
	    
	    
	    
	  
	}

	public Point getLocation() { //zeigt die letzte position/location (point) des login fensters an für den ui-home frame
		return loc;
	}
	
	public JFrame getFrame() { //um login frame von dem terminal an zu machen weil sonst öffnet es sich wieder nach dem login button action da die klasse dann nochmal durch geht von anfang an
		return frame;
	}
	
	
	
	
	
	
	
}
