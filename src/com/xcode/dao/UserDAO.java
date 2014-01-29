package com.xcode.dao;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.xcode.modelo.User;
import com.xcode.modelo.UserExamReadiness;
import com.xcode.utils.JPAUtil;

public class UserDAO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7668768470579027371L;

	public void save(User user, UserExamReadiness uer) {
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
	
	public void update(User user, UserExamReadiness uer) {
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
	
	public ArrayList<User> getUsers() {		
		EntityManager em = JPAUtil.getEntityManager();
		try {
			TypedQuery<User> q = em.createQuery("from User", User.class);
			ArrayList<User> users = (ArrayList<User>) q.getResultList();
			em.close();
			return users;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public User getUserById(Long id) {	
		EntityManager em = JPAUtil.getEntityManager();
		try {			
			User user = em.find(User.class, id);
			em.close();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
