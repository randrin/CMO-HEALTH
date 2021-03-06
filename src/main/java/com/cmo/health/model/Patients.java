package com.cmo.health.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Patients")
public class Patients implements Serializable {

	private static final long serialVersionUID = 8423348031306532733L;
	
	@Id
	@Column(name="id_patient")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idPatient;
	
	@Column(name="nom_patient")
	private String nomPatient;
	
	@Column(name="prenom_patient")
	private String prenomPatient;
	
	@Column(name="date_nais_patient")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateNaisPatient;
	
	@Column(name="age_patient")
	private int agePatient;
	
	@Column(name="sexe_patient")
	private String sexePatient;
	
	@Column(name="addresse_patient")
	private String addressePatient;
	
	@Column(name="codPost_patient")
	private Integer codePostPatient;
	
	@Column(name="domicile_patient")
	private String domicilePatient;
	
	@Column(name="infoSuppl_patient")
	private String infoSupplPatient;
	
	@Column(name="email_patient")
	private String emailPatient;
	
	@Column(name="numTel_patient")
	private Integer numTelPatient;
	
	@Column(name="numFixe_patient")
	private Integer numFixePatient;
	
	/**
	 * @return the idPatient
	 */
	public long getIdPatient() {
		return idPatient;
	}
	/**
	 * @param idPatient the idPatient to set
	 */
	public void setIdPatient(long idPatient) {
		this.idPatient = idPatient;
	}
	/**
	 * @return the nomPatient
	 */
	public String getNomPatient() {
		return nomPatient;
	}
	/**
	 * @param nomPatient the nomPatient to set
	 */
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	/**
	 * @return the prenomPatient
	 */
	public String getPrenomPatient() {
		return prenomPatient;
	}
	/**
	 * @param prenomPatient the prenomPatient to set
	 */
	public void setPrenomPatient(String prenomPatient) {
		this.prenomPatient = prenomPatient;
	}
	/**
	 * @return the dateNaisPatient
	 */
	public Date getDateNaisPatient() {
		return dateNaisPatient;
	}
	/**
	 * @param dateNaisPatient the dateNaisPatient to set
	 */
	public void setDateNaisPatient(Date dateNaisPatient) {
		this.dateNaisPatient = dateNaisPatient;
	}
	/**
	 * @return the agePatient
	 */
	public int getAgePatient() {
		return agePatient;
	}
	/**
	 * @param agePatient the agePatient to set
	 */
	public void setAgePatient(int agePatient) {
		this.agePatient = agePatient;
	}
	/**
	 * @return the sexePatient
	 */
	public String getSexePatient() {
		return sexePatient;
	}
	/**
	 * @param sexePatient the sexePatient to set
	 */
	public void setSexePatient(String sexePatient) {
		this.sexePatient = sexePatient;
	}
	/**
	 * @return the adressePatient
	 */
	public String getAddressePatient() {
		return addressePatient;
	}
	/**
	 * @param adressePatient the adressePatient to set
	 */
	public void setAddressePatient(String addressePatient) {
		this.addressePatient = addressePatient;
	}
	/**
	 * @return the codePostPatient
	 */
	public Integer getCodePostPatient() {
		return codePostPatient;
	}
	/**
	 * @param codePostPatient the codePostPatient to set
	 */
	public void setCodePostPatient(Integer codePostPatient) {
		this.codePostPatient = codePostPatient;
	}
	/**
	 * @return the domicilePatient
	 */
	public String getDomicilePatient() {
		return domicilePatient;
	}
	/**
	 * @param domicilePatient the domicilePatient to set
	 */
	public void setDomicilePatient(String domicilePatient) {
		this.domicilePatient = domicilePatient;
	}
	/**
	 * @return the infoSupplPatient
	 */
	public String getInfoSupplPatient() {
		return infoSupplPatient;
	}
	/**
	 * @param infoSupplPatient the infoSupplPatient to set
	 */
	public void setInfoSupplPatient(String infoSupplPatient) {
		this.infoSupplPatient = infoSupplPatient;
	}
	/**
	 * @return the emailPatient
	 */
	public String getEmailPatient() {
		return emailPatient;
	}
	/**
	 * @param emailPatient the emailPatient to set
	 */
	public void setEmailPatient(String emailPatient) {
		this.emailPatient = emailPatient;
	}
	/**
	 * @return the numTelPatient
	 */
	public Integer getNumTelPatient() {
		return numTelPatient;
	}
	/**
	 * @param numTelPatient the numTelPatient to set
	 */
	public void setNumTelPatient(Integer numTelPatient) {
		this.numTelPatient = numTelPatient;
	}
	/**
	 * @return the numFixe_Patient
	 */
	public Integer getNumFixePatient() {
		return numFixePatient;
	}
	/**
	 * @param numFixe_Patient the numFixe_Patient to set
	 */
	public void setNumFixePatient(Integer numFixePatient) {
		this.numFixePatient = numFixePatient;
	}
}
