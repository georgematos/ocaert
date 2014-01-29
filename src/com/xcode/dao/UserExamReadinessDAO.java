package com.xcode.dao;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.xcode.modelo.UserExamReadiness;
import com.xcode.utils.JPAUtil;

public class UserExamReadinessDAO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1600331699338193260L;

//	public void save(UserExamReadiness uer) {
//		
//		EntityManager manager = JPAUtil.getEntityManager();
//		manager.getTransaction().begin();	
//		manager.persist(uer);	
//		manager.getTransaction().commit();	
//		manager.close();
//		
//	}
	
	public ArrayList<UserExamReadiness> getUers() {

		EntityManager manager = JPAUtil.getEntityManager();		
		TypedQuery<UserExamReadiness> q = manager.createQuery("from userexamreadiness", UserExamReadiness.class);	
		ArrayList<UserExamReadiness> uers = (ArrayList<UserExamReadiness>) q.getResultList();		
		manager.close();
		return uers;
		
	}
	
	public UserExamReadiness getUerById(Long id) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		UserExamReadiness uer = manager.find(UserExamReadiness.class, id);
		return uer;
		
	}

//	public void update(UserExamReadiness uer) {
//		
//		EntityManager manager = JPAUtil.getEntityManager();
//		manager.getTransaction().begin();
//		manager.merge(uer);
//		manager.getTransaction().commit();
//		manager.close();
//		
//	}
	
}
