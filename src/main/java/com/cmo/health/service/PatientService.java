package com.cmo.health.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.cmo.health.model.Patients;

@Component
public class PatientService {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public void registration (Patients patient) {
		
		this.em.persist(patient);
	}

	/**
	 * @return the em
	 */
	public EntityManager getEm() {
		return em;
	}

	/**
	 * @param em the em to set
	 */
	public void setEm(EntityManager em) {
		this.em = em;
	}


}
