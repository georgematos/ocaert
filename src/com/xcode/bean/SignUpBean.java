package com.xcode.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.xcode.dao.UserAppDAO;
import com.xcode.dao.UserExamReadinessDAO;
import com.xcode.modelo.UserApp;
import com.xcode.modelo.UserExamReadiness;
import com.xcode.utils.Criptografia;

@ManagedBean
@ViewScoped
public class SignUpBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5875069100814114895L;

	UserApp user;
	UserExamReadiness uer;
	UserAppDAO userDao;
	UserExamReadinessDAO uerDao;

	public SignUpBean() {
		
		user = new UserApp();
		uer = new UserExamReadiness();
		userDao = new UserAppDAO();
		uerDao = new UserExamReadinessDAO();
	}
	
	public void signUp() {
		
		// Registra a data no momento de cadastro e atribui ao user
		Calendar dataCadastro = Calendar.getInstance();
		Date dateSub = dataCadastro.getTime();
		user.setSubscriptionDate(dateSub);
		user.setPassword(Criptografia.md5(user.getPassword()));
		user.setAuthority("ROLE_USER");

		userDao.save(user, uer);
		
		uer = new UserExamReadiness();
		user = new UserApp();
	}
	
	public UserApp getUser() {
		return user;
	}
	
	public void setUser(UserApp user) {
		this.user = user;
	}
	
}
