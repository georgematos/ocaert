package com.xcode.testes;

import com.xcode.dao.UserAppDAO;
import com.xcode.modelo.UserApp;

public class RecuperarUsuario {

	public static void main(String[] args) {
		
		UserAppDAO dao = new UserAppDAO();
		UserApp u = dao.getUserByEmail("\'georgemattos@gmail.com\'");
		
		System.out.println(u.getName());
		System.out.println(u.getUer().getRate());
		
	}
	
}
