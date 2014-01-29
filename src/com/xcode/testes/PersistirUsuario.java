package com.xcode.testes;

import java.util.Calendar;
import java.util.Date;

import com.xcode.dao.UserDAO;
import com.xcode.modelo.User;
import com.xcode.modelo.UserExamReadiness;
import com.xcode.modelo.topics.JavaBasics;

public class PersistirUsuario {

	public static void main(String[] args) {
		
		User u1 = new User();
		UserExamReadiness uer = new UserExamReadiness();
		JavaBasics jb = new JavaBasics();
		UserDAO dao = new UserDAO();
		
		jb = uer.getJb();
		jb.setJb11(1);
		jb.setJb12(2);
		jb.setJb13(3);
		jb.setJb14(2);
		uer.setJb(jb);

		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1983, 12-1, 10);
		
		Date data = dataNascimento.getTime();
		
		Calendar dataCadastro = Calendar.getInstance();
		Date datac = dataCadastro.getTime();
			
		u1.setName("George Matos");
		u1.setEmail("georgemattos@gmail.com");
		u1.setPassword("gm123");
		u1.setPhone("8530143599");
		u1.setBirthday(data);
		u1.setSubscriptionDate(datac);
		u1.setUer(uer);
		
		dao.save(u1, uer);
		
	}
	
}
