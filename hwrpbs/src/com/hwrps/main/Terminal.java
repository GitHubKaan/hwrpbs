package com.hwrps.main;

import com.hwrps.login.Login;


public class Terminal {

	static String stbl = "[STABLE] ";
	
	static Login login_class; //klasse abrufen (login)
	
	
	public static void main(String[] args) {
		
		//main klasse, hier wird alles verarbeitet
		System.out.println(stbl + com.hwrps.main.Terminal.class + " startet");
		
		login_class = new Login(); //login frame klasse starten
		login_class.getFrame().setVisible(true); //login frame visible machen von login klasse
	}
}
