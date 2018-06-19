package com.cmo.health.utils;

import com.cmo.health.model.Administrateurs;

public class CmoHealth {

	public static String calculIdentifiantAdmin(Administrateurs admin) {
		
		String identifiant = "";
		String nom = admin.getNomAdmin().substring(0, 3).toUpperCase();
		String prenom = admin.getPrenomAdmin().substring(0, 3).toUpperCase();
		String[] array = admin.getDateNaisAdmin().split("-");
		String anneeNais = array[2];
		String jourNais = array[0];
		String role = admin.getRoleAdmin();
		
		identifiant = nom+prenom+anneeNais+role+jourNais;
		
		return identifiant.trim();
	}
}
