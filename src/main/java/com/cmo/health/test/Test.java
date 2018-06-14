package com.cmo.health.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cmo.health.model.Patients;

public class Test {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		session.beginTransaction().begin();
		
		Patients patient = new Patients();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		try {
			Date dateNaissance = sdf.parse("17/12/1986");
			patient.setNomPatient("Randrin");
			patient.setPrenomPatient("Nzeukang");
			patient.setDateNaisPatient(dateNaissance);
			patient.setAgePatient(31);
		} catch (Exception e) {
			e.printStackTrace();
		}
		session.save(patient);
		
		session.getTransaction().commit();
	}

}
