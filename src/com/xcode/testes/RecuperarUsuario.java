package com.xcode.testes;

import com.xcode.dao.UserDAO;
import com.xcode.modelo.User;

public class RecuperarUsuario {

	public static void main(String[] args) {
		
		UserDAO dao = new UserDAO();
		User u = dao.getUserById(2l);
		
		System.out.println(u.getName());
		System.out.println(u.getUer().getRate());
		
	}
	
}
