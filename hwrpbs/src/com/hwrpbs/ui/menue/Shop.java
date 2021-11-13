package com.hwrpbs.ui.menue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Shop extends JPanel implements ActionListener {

	static String stbl = "[STABLE] ";
	static String act = "[ACTION] ";
	static String log = "[LOG] ";
	
	static String msg = "<mobile_message> ";
	
	static int missing_tokens = 0;
	
	static int total_tokens = 5;
	
	JLabel[] labels = new JLabel[100];
	JPanel[] panels = new JPanel[100];
	JButton[] buttons = new JButton[100];
	
	Transactions transactions_class = new Transactions();
	
	public Shop() { //home klasse in public implementieren

		System.out.println(stbl + com.hwrpbs.ui.menue.Shop.class + " startet");
		
		
		//----------[MAIN PANEL EINSTELLUNGEN]----------
		setBounds(0, 0, 385, 762);
		setVisible(false);
		setLayout(new BorderLayout(0, 0));
		

		
		//----------[INITIALISIERUNG]----------
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
		}
		for (int i = 0; i <	buttons.length; i++) {
			buttons[i] = new JButton();
		}

		
		
		//----------[PANEL SETTINGS]----------
		//aktuelle angebote
		panels[1].setBounds(30, 115, 70, 70);
		panels[2].setBounds(30, 200, 70, 70);
		panels[3].setBounds(117, 115, 70, 70);
		panels[4].setBounds(117, 200, 70, 70);
		panels[5].setBounds(204, 115, 70, 70);
		panels[6].setBounds(204, 200, 70, 70);
		panels[7].setBounds(289, 115, 70, 70);
		panels[8].setBounds(289, 200, 70, 70);
		
		//zeitlich begrenzte angebote
		panels[9].setBounds(29, 320, 330, 110);
		panels[10].setBounds(29, 446, 160, 105);
		panels[11].setBounds(199, 446, 160, 105);
		
		panels[12].setBounds(29, 565, 330, 170);
		
		for (int i = 1; i < buttons.length; i++) {
			panels[i].setLayout(new BorderLayout(0, 0));
			panels[i].setOpaque(false);
			panels[i].add(buttons[i]);
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
		
		//shop item buttons
		for (int i = 1; i < buttons.length; i++) {
			buttons[i].setOpaque(false);
			buttons[i].setContentAreaFilled(false);
			buttons[i].setBorderPainted(false);
		}
		
		
		
		//----------[PANEL HIERARCHIE]----------
		for (int i = 0; i < panels.length; i++) {
			add(panels[i]);
		}

		
		
	    //----------[BUTTON ACTION LISTENER]----------
	    for (int i = 0; i < buttons.length; i++) { //alle buttons dem actionlistener zuordneen
	    	buttons[i].addActionListener(this);
	    }
		
		
		
		ImageIcon ui_shop_design = new ImageIcon("textures/used/ui_shop_design.png");
		labels[0].setIcon(ui_shop_design);
		add(labels[0]);
		
		token_label(); //um die aktuellen tokens oben anzuzeigen
	}
	
	
	public void actionPerformed(ActionEvent e) { //kauf actions
    	if (e.getSource() == buttons[1]) { //kaffee
    		if (total_tokens >= 5) {
    			total_tokens -= 5;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Kaffee");
    			purchase_successfully();
    		} else {
    			missing_tokens = 5 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[2]) { //stift
    		if (total_tokens >= 10) {
    			total_tokens -= 10;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Stift");
    			purchase_successfully();
    		} else {
    			missing_tokens = 10 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[3]) { //crossong
    		if (total_tokens >= 15) {
    			total_tokens -= 15;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Croissant");
    			purchase_successfully();
    		} else {
    			missing_tokens = 15 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[4]) { //bräzel
    		if (total_tokens >= 20) {
    			total_tokens -= 20;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Brezel");
    			purchase_successfully();
    		} else {
    			missing_tokens = 20 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[5]) { //karierter schreibblock
    		if (total_tokens >= 50) {
    			total_tokens -= 50;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Schreibblock");
    			purchase_successfully();
    		} else {
    			missing_tokens = 50 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[6]) { //rolex
    		if (total_tokens >= 80) {
    			total_tokens -= 80;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Rolex");
    			purchase_successfully();
    		} else {
    			missing_tokens = 80 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[7]) { //flugzeug
    		if (total_tokens >= 100) {
    			total_tokens -= 100;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Flugzeug");
    			purchase_successfully();
    		} else {
    			missing_tokens = 100 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[8]) { //bagger
    		if (total_tokens >= 200) {
    			total_tokens -= 200;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Bagger");
    			purchase_successfully();
    		} else {
    			missing_tokens = 200 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[9]) { //lamborghini
    		if (total_tokens >= 50) {
    			total_tokens -= 50;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Aventador");
    			purchase_successfully();
    		} else {
    			missing_tokens = 50 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[10]) { //snickers
    		if (total_tokens >= 15) {
    			total_tokens -= 15;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Snickers");
    			purchase_successfully();
    		} else {
    			missing_tokens = 15 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[11]) { //tiktak + salzstangen
    		if (total_tokens >= 10) {
    			total_tokens -= 10;
    			//KAUF ERFOLGT
    			transactions_class.items.add("TikTak");
    			purchase_successfully();
    		} else {
    			missing_tokens = 10 - total_tokens;
    			to_less_tokens();
    		}
    	} else if (e.getSource() == buttons[12]) { //megayacht
    		if (total_tokens >= 800) {
    			total_tokens -= 800;
    			//KAUF ERFOLGT
    			transactions_class.items.add("Megayacht");
    			purchase_successfully();
    		} else {
    			missing_tokens = 800 - total_tokens;
    			to_less_tokens();
    		}
    	}
    	System.out.println(stbl + act + "shop action event");
    	
    	token_label(); //aktuallisiere token counter
	}
	
	
	public void to_less_tokens() { //wenn zu wenig tokens
		System.out.println(log + "kauf fehlgeschlagen");
		JOptionPane.showMessageDialog(panels[0], msg + "Zu wenig Tokens. Dir fehlen " + missing_tokens + " Token(s).");
	}
	
	public void purchase_successfully() { //wenn kauf erfolgreich
		JOptionPane.showMessageDialog(panels[0], msg + "Kauf erfolgreich.");
		System.out.print(log + "kauf erfolgreich: ");
		for (int i = 0; i < transactions_class.items.size(); i++) {
			System.out.print(transactions_class.items.get(i) + ", ");
		}
		System.out.println();
	}
	
	public void token_label() {
		//----------[TOKEN TEXTFIELD]----------
		panels[13].setBounds(220, 18, 130, 30);
		panels[13].setLayout(new BorderLayout(0, 0));
		panels[13].setVisible(true);
		labels[1].setText(String.valueOf(total_tokens) + " TKNs"); //int to string
		labels[1].setFont(new Font("Calibri", Font.BOLD, 19));
		labels[1].setForeground(Color.WHITE);
		
		panels[13].setOpaque(false); //schrift hintergrund transparent
				
		panels[13].add(labels[1]);
	}
}
