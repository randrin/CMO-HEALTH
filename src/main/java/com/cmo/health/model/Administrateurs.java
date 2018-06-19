package com.cmo.health.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Administrateurs")
@NamedQueries({
	@NamedQuery(name="Administrateurs.findAll", query="SELECT a FROM Administrateurs a"),
	@NamedQuery(name="Administrateurs.login", query="SELECT a FROM Administrateurs a WHERE a.nomAdmin = :nomAdmin AND a.pwdAdmin = :pwdAdmin"),
	@NamedQuery(name="Administrateurs.findByNom", query="SELECT a FROM Administrateurs a WHERE a.nomAdmin = :nomAdmin"),
	@NamedQuery(name="Administrateurs.findByActive", query="SELECT a FROM Administrateurs a WHERE a.nomAdmin = :nomAdmin AND a.idAdmin = :idAdmin")
})
public class Administrateurs implements Serializable {

	private static final long serialVersionUID = -2399935584552956517L;

	@Id
	@Column(name="id_admin")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idAdmin;
	
	@Column(name="nom_admin")
	private String nomAdmin;
	
	@Column(name="prenom_admin")
	private String prenomAdmin;
	
	@Column(name="pwd_admin")
	private String pwdAdmin;
	
	@Column(name="date_insert_admin")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateInsertAdmin;
	
	@Column(name="date_lastUpdate_admin")
	private String dateLastUpdAdmin;
	
	@Column(name="isActive_admin")
	private boolean activeAdmin;

	@Column(name="date_nais_admin")
	private String dateNaisAdmin;
	
	@Column(name="sexe_admin")
	private String sexeAdmin;
	
	@Column(name="role_admin")
	private String roleAdmin;
	
	/**
	 * @return the idAdmin
	 */
	public long getIdAdmin() {
		return idAdmin;
	}

	/**
	 * @param idAdmin the idAdmin to set
	 */
	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}

	/**
	 * @return the nomAdmin
	 */
	public String getNomAdmin() {
		return nomAdmin;
	}

	/**
	 * @param nomAdmin the nomAdmin to set
	 */
	public void setNomAdmin(String nomAdmin) {
		this.nomAdmin = nomAdmin;
	}

	/**
	 * @return the prenomAdmin
	 */
	public String getPrenomAdmin() {
		return prenomAdmin;
	}

	/**
	 * @param prenomAdmin the prenomAdmin to set
	 */
	public void setPrenomAdmin(String prenomAdmin) {
		this.prenomAdmin = prenomAdmin;
	}

	/**
	 * @return the pwdAdmin
	 */
	public String getPwdAdmin() {
		return pwdAdmin;
	}

	/**
	 * @param pwdAdmin the pwdAdmin to set
	 */
	public void setPwdAdmin(String pwdAdmin) {
		this.pwdAdmin = pwdAdmin;
	}

	/**
	 * @return the dateInsertAdmin
	 */
	public Date getDateInsertAdmin() {
		return dateInsertAdmin;
	}

	/**
	 * @param dateInsertAdmin the dateInsertAdmin to set
	 */
	public void setDateInsertAdmin(Date dateInsertAdmin) {
		this.dateInsertAdmin = dateInsertAdmin;
	}

	/**
	 * @return the dateLastUpdAdmin
	 */
	public String getDateLastUpdAdmin() {
		return dateLastUpdAdmin;
	}

	/**
	 * @param dateLastUpdAdmin the dateLastUpdAdmin to set
	 */
	public void setDateLastUpdAdmin(String dateLastUpdAdmin) {
		this.dateLastUpdAdmin = dateLastUpdAdmin;
	}

	/**
	 * @return the activeAdmin
	 */
	public boolean isActiveAdmin() {
		return activeAdmin;
	}

	/**
	 * @param activeAdmin the activeAdmin to set
	 */
	public void setActiveAdmin(boolean activeAdmin) {
		this.activeAdmin = activeAdmin;
	}

	/**
	 * @return the sexeAdmin
	 */
	public String getSexeAdmin() {
		return sexeAdmin;
	}

	/**
	 * @param sexeAdmin the sexeAdmin to set
	 */
	public void setSexeAdmin(String sexeAdmin) {
		this.sexeAdmin = sexeAdmin;
	}

	/**
	 * @return the roleAdmin
	 */
	public String getRoleAdmin() {
		return roleAdmin;
	}

	/**
	 * @param roleAdmin the roleAdmin to set
	 */
	public void setRoleAdmin(String roleAdmin) {
		this.roleAdmin = roleAdmin;
	}

	/**
	 * @return the dateNaisAdmin
	 */
	public String getDateNaisAdmin() {
		return dateNaisAdmin;
	}

	/**
	 * @param dateNaisAdmin the dateNaisAdmin to set
	 */
	public void setDateNaisAdmin(String dateNaisAdmin) {
		this.dateNaisAdmin = dateNaisAdmin;
	}

}
