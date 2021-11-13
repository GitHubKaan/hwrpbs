package com.hwrpbs.ui.menue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Transactions extends JPanel {
	
	static String stbl = "[STABLE] ";
	static String act = "[ACTION] ";
	static String log = "[LOG] ";
	
	JLabel[] labels = new JLabel[100];
	JPanel[] panels = new JPanel[100];
	JButton[] buttons = new JButton[100];
	Integer[] integers = new Integer[100];
	
	ArrayList<String> items = new ArrayList<String>();
	
	static int total_tokens = 0;
	
	public Transactions() {
		
		System.out.println(stbl + com.hwrpbs.ui.menue.Transactions.class + " startet");
		
		
		//----------[INITIALISIERUNG]----------
		for (int i = 0; i < labels.length; i++) {
			labels[i] = new JLabel();
		}
		for (int i = 0; i < panels.length; i++) {
			panels[i] = new JPanel();
		}
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
		}
		
		

		
		
		//----------[Zurück button SETTINGS]----------
		panels[0].setBounds(10, 10, 37, 37);
		panels[0].setLayout(new BorderLayout(0, 0));
		panels[0].setBackground(Color.RED);
		panels[0].setOpaque(false);
		panels[0].add(buttons[0]);
		buttons[0].setOpaque(false);
		buttons[0].setContentAreaFilled(false);
		buttons[0].setBorderPainted(false);
		
		
		
		//----------[Transaction labels]----------
		panels[1].setBounds(50, 95, 400, 20);
		panels[2].setBounds(50, 180, 400, 20);
		panels[3].setBounds(50, 265, 400, 20);
		panels[4].setBounds(50, 350, 400, 20);
		panels[5].setBounds(50, 435, 400, 20);
		panels[6].setBounds(50, 520, 400, 20);
		panels[7].setBounds(50, 605, 400, 20);
		panels[8].setBounds(50, 690, 400, 20);
		
		for (int i = 1; i < labels.length; i++) {
			labels[i].setFont(new Font("Calibri", Font.PLAIN, 20));
			labels[i].setForeground(Color.BLACK);
			
			panels[i].setLayout(new BorderLayout(0, 0));
			panels[i].setOpaque(false); //schrift hintergrund transparent
			
			panels[i].add(labels[i]);
		}

		
		

		/*
		 * Der scheiß hier funktioniert nicht weil wenn man "new Shop" macht dann wird die array liste auf 0 gesetzt
		 */
		
		panels[9].setBounds(0, 0, 100, 100);
		panels[9].add(buttons[1]);
		//----------[SHUFFLER]----------
		buttons[1].addActionListener(new ActionListener() { //hier wird quasi aus shop alles gelesen was man bekommen hat
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("tsaet" + items.get(0));
					
				String item_call = null;
				//item_call = shop_class.getItemList().get(0);
					
				labels[8].setText(labels[7].getText());
				labels[7].setText(labels[6].getText());
				labels[6].setText(labels[5].getText());
				labels[5].setText(labels[4].getText());
				labels[4].setText(labels[3].getText());
				labels[3].setText(labels[2].getText());
				labels[2].setText(labels[1].getText());
				labels[1].setText(item_call);
			}
		});
		
		
		
		
		
		//----------[PANEL HIERARCHIE]----------
		for (int i = 0; i < panels.length; i++) {
			add(panels[i]);
		}
		
		
		setBounds(0, 0, 385, 762);
		setVisible(false);
		setLayout(new BorderLayout(0, 0));
		
		ImageIcon ui_transactions_design_icon = new ImageIcon("textures/used/ui_transactions_design.png");
		labels[0].setIcon(ui_transactions_design_icon);
		add(labels[0]);

		
		
		
		
		
		
		
		
		
	}
}