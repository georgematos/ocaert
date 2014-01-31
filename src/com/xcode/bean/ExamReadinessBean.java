package com.xcode.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

import com.xcode.dao.UserAppDAO;
import com.xcode.modelo.UserApp;
import com.xcode.modelo.UserExamReadiness;
import com.xcode.utils.Ratings;

@ManagedBean
@ViewScoped
public class ExamReadinessBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3563660237037500942L;
	
	private UserApp user;
	private UserAppDAO uDao;
	private UserExamReadiness uer;
	private String email;
	
	public ExamReadinessBean() {
		
		// Recuperando o email (username) do usuário logado do contexto do Spring Security
		SecurityContext context = SecurityContextHolder.getContext();
		Authentication auth = context.getAuthentication();		
		email = auth.getName();
		
		// Instanciando Usuario e seu DAO
		user = new UserApp();
		uDao = new UserAppDAO();
		
		// Recuperando usuario do BD pelo email
		user = uDao.getUserByEmail(email);
		
		// Recuperando tabela UER ao usuário
		uer = user.getUer();
//		user.setUer(uer);
		
	}
	
	public void update() {
		
		uer.setRate(Ratings.getRating(uer.getJb(), uer.getWwjdt(), uer.getUoadc(), uer.getCaua(), uer.getUlc(), uer.getWwmae(), uer.getWwi(), uer.getHe()));
		uDao.update(user, uer);
		
	}

	public UserApp getUser() {
		return user;
	}

	public void setUser(UserApp user) {
		this.user = user;
	}
	
	public UserExamReadiness getUer() {
		return uer;
	}
	
	public void setUer(UserExamReadiness uer) {
		this.uer = uer;
	}
	
}
