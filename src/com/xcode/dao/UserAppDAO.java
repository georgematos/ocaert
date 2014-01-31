package com.xcode.dao;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.xcode.modelo.UserApp;
import com.xcode.modelo.UserExamReadiness;
import com.xcode.utils.JPAUtil;

public class UserAppDAO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7668768470579027371L;

	public void save(UserApp user, UserExamReadiness uer) {
		EntityManager em = JPAUtil.getEntityManager();
		user.setUer(uer);
		try {
			em.getTransaction().begin();
			em.persist(uer);
			em.persist(user);
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();
		}
	}
	
	public void update(UserApp user, UserExamReadiness uer) {
		EntityManager em = JPAUtil.getEntityManager();
		user.setUer(uer);
		try {
			em.getTransaction().begin();
			em.merge(uer);
			em.merge(user);		
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
	}
	
	public ArrayList<UserApp> getUsers() {		
		EntityManager em = JPAUtil.getEntityManager();
		try {
			TypedQuery<UserApp> q = em.createQuery("from User", UserApp.class);
			ArrayList<UserApp> users = (ArrayList<UserApp>) q.getResultList();
			em.close();
			return users;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public UserApp getUserById(Long id) {
		EntityManager em = JPAUtil.getEntityManager();
		try {			
			UserApp user = em.find(UserApp.class, id);
			em.close();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public UserApp getUserByEmail(String email) {
		
		EntityManager em = JPAUtil.getEntityManager();
		try {
			TypedQuery<UserApp> query = em.createQuery("from UserApp where email='" + email + "'", UserApp.class);
			UserApp user = query.getSingleResult();
			em.close();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
