package com.cmo.health.service;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

import com.cmo.health.constantes.CmoConstantes;
import com.cmo.health.model.Administrateurs;

@Component
public class LoginService {

	final static Logger logger = Logger.getLogger(LoginService.class);
	
	@PersistenceUnit
	private EntityManagerFactory emf;
	
	@PersistenceContext
	private EntityManager em;

	public boolean verifyLogin (String nom, String pwd) {

		boolean logged = false;
		
		emf = Persistence.createEntityManagerFactory(CmoConstantes.PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
		em.getTransaction().begin();
				
		try {
			TypedQuery<Administrateurs> admin = em.createNamedQuery("Administrateurs.login", Administrateurs.class);
			
			admin.setParameter("nomAdmin", nom);
			admin.setParameter("pwdAdmin", pwd);
			
			Administrateurs adminLogged = (Administrateurs)admin.getSingleResult();
			
			if (adminLogged.isActiveAdmin() && adminLogged.getPwdAdmin().equals(pwd)) {
				logged = true;
			} else {
				FacesContext.getCurrentInstance().addMessage(null, 
						new FacesMessage(FacesMessage.SEVERITY_ERROR , "Votre compte n'est pas Active. Veuillez contactez le service CMO-Health", ""));
			}
			
		} catch (Exception e) {
			logger.error("Error-verifyLogin() : " +e.getMessage()+ " cause: " +e.getCause());
		}
		return logged;
	}
	
	public void loadDataAdmin(Administrateurs admin, String nomAdmin, String pwdAdmin) {

		String formatDateUpdate = "";
		
		emf = Persistence.createEntityManagerFactory(CmoConstantes.PERSISTENCE_UNIT_NAME);
		em = emf.createEntityManager();
		em.getTransaction().begin();
		
		try {
			TypedQuery<Administrateurs> user = em.createNamedQuery("Administrateurs.login", Administrateurs.class);

			user.setParameter("nomAdmin", nomAdmin);
			user.setParameter("pwdAdmin", pwdAdmin);
			
			Administrateurs result = (Administrateurs) user.getSingleResult();
			
			admin.setNomAdmin(result.getNomAdmin().toUpperCase());
			admin.setPrenomAdmin(result.getPrenomAdmin().toUpperCase());
			admin.setSexeAdmin(result.getSexeAdmin());
			formatDateUpdate = result.getDateLastUpdAdmin().substring(0, (result.getDateLastUpdAdmin().length() - 2));
			admin.setDateLastUpdAdmin(formatDateUpdate);
			admin.setDateNaisAdmin(result.getDateNaisAdmin());
			admin.setRoleAdmin(result.getRoleAdmin());
			
		} catch (Exception e) {
			logger.error("Error-loadDataAdmin() : " +e.getMessage()+ " cause: " +e.getCause());
		}
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


	/**
	 * @return the emf
	 */
	public EntityManagerFactory getEmf() {
		return emf;
	}


	/**
	 * @param emf the emf to set
	 */
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

}
