package com.xcode.dao;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.xcode.modelo.User;
import com.xcode.utils.JPAUtil;

public class UserDAO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7668768470579027371L;

	public void save(User user) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		manager.getTransaction().begin();
		manager.persist(user);
		manager.getTransaction().commit();
		manager.close();
		
	}
	
	public ArrayList<User> getUsers() {
		
		EntityManager manager = JPAUtil.getEntityManager();	
		TypedQuery<User> q = manager.createQuery("from User", User.class);
		ArrayList<User> users = (ArrayList<User>) q.getResultList();		
		manager.close();
		return users;
		
	}
	
	public User getUserById(Long id) {
		
		EntityManager manager = JPAUtil.getEntityManager();
		User user = manager.find(User.class, id);
		return user;
		
	}

	public void update(User user) {
		
		EntityManager manager = JPAUtil.getEntityManager();		
		manager.getTransaction().begin();		
		manager.merge(user);		
		manager.getTransaction().commit();
		manager.close();
		
	}
	
}
