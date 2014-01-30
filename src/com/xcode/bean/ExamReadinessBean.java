package com.xcode.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.xcode.dao.UserDAO;
import com.xcode.modelo.User;
import com.xcode.modelo.UserExamReadiness;
import com.xcode.utils.Ratings;

@ManagedBean
@ViewScoped
public class ExamReadinessBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3563660237037500942L;
	
	private User user;
	private UserDAO uDao;
	private UserExamReadiness uer;

	public ExamReadinessBean() {
		user = new User();
		uDao = new UserDAO();
		user = uDao.getUserById(2l);
		uer = user.getUer();
		user.setUer(uer);
	}
	
	public void update() {
		
		uer.setRate(Ratings.getRating(uer.getJb(), uer.getWwjdt(), uer.getUoadc(), uer.getCaua(), uer.getUlc(), uer.getWwmae(), uer.getWwi(), uer.getHe()));
		uDao.update(user, uer);
		
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public UserExamReadiness getUer() {
		return uer;
	}
	
	public void setUer(UserExamReadiness uer) {
		this.uer = uer;
	}
	
}
