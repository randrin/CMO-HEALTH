package com.cmo.health.beans;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.cmo.health.constantes.CmoConstantes;
import com.cmo.health.model.Administrateurs;
import com.cmo.health.service.LoginService;
import com.cmo.health.utils.CmoHealth;

@ManagedBean
@SessionScoped
public class LoginBeans {

	@ManagedProperty("#{loginService}")
	private LoginService loginService;

	private Administrateurs admin = new Administrateurs();
	
	private String nomAdmin;
	private String pwdAdmin;
	private String idAdmin;
	
	
	public String loginConnection() {
		
		if (loginService.verifyLogin(nomAdmin, pwdAdmin)) {
			loginService.loadDataAdmin(admin, nomAdmin, pwdAdmin);
			setIdAdmin(CmoHealth.calculIdentifiantAdmin(admin));
			return CmoConstantes.HOME_REDIRECT;
		}
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR , "Nom ou/et Mot de Passe incorrect(s)", ""));
		return "";
	}
	
	/**
	 * @return the loginService
	 */
	public LoginService getLoginService() {
		return loginService;
	}

	/**
	 * @param loginService the loginService to set
	 */
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
	/**
	 * @return the admin
	 */
	public Administrateurs getAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Administrateurs admin) {
		this.admin = admin;
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
	 * @return the idAdmin
	 */
	public String getIdAdmin() {
		return idAdmin;
	}

	/**
	 * @param idAdmin the idAdmin to set
	 */
	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}

	
}
