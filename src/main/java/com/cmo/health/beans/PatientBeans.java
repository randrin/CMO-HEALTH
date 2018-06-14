package com.cmo.health.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.cmo.health.model.Patients;
import com.cmo.health.service.PatientService;

@ManagedBean
@SessionScoped
public class PatientBeans {

	@ManagedProperty("#{patientService}")
	private PatientService patientService;
	
	private Patients patient = new Patients();
	
	public String registrationPatient() {
		patientService.registration(patient);
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Patient "+this.patient.getNomPatient()+" enrégistré correctemment"));
		return "";
	}
	
	/**
	 * @return the patientService
	 */
	public PatientService getPatientService() {
		return patientService;
	}

	/**
	 * @param patientService the patientService to set
	 */
	public void setPatientService(PatientService patientService) {
		this.patientService = patientService;
	}

	/**
	 * @return the patient
	 */
	public Patients getPatient() {
		return patient;
	}

	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patients patient) {
		this.patient = patient;
	}
	
}
