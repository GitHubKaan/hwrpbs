package com.hwrpbs.main;

import com.hwrpbs.ui.login.Login;


public class Main {

	static String stbl = "[STABLE] ";
	
	static Login login_class; //klasse abrufen (login)
	
	
	public static void main(String[] args) {
		
		//main klasse, hier wird alles verarbeitet
		System.out.println(stbl + com.hwrpbs.main.Main.class + " startet");
		
		login_class = new Login(); //login frame klasse starten
		login_class.getFrame().setVisible(true); //login frame visible machen von login klasse
	}
}
