package com.xcode.bean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.xcode.dao.UserDAO;
import com.xcode.dao.UserExamReadinessDAO;
import com.xcode.modelo.User;
import com.xcode.modelo.UserExamReadiness;

@ManagedBean
@ViewScoped
public class SignUpBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5875069100814114895L;

	User user;
	UserExamReadiness uer;
	UserDAO userDao;
	UserExamReadinessDAO uerDao;

	public SignUpBean() {
		
		user = new User();
		uer = new UserExamReadiness();
		userDao = new UserDAO();
		uerDao = new UserExamReadinessDAO();
	}
	
	public void signUp() {
		
		// Atribui o uer ao user
		user.setUer(uer);
		
		// Registra a data no momento de cadastro e atribui ao user
		Calendar dataCadastro = Calendar.getInstance();
		Date dateSub = dataCadastro.getTime();
		user.setSubscriptionDate(dateSub);
		
		uerDao.save(uer);
		userDao.save(user);
		
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
}
