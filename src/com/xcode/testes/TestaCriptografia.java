package com.xcode.testes;

import com.xcode.utils.Criptografia;

public class TestaCriptografia {
	
	public static void main(String[] args) {

		String senha = "g1012senhag";
		
		String password = Criptografia.md5(senha);
		
		System.out.println(password);
		
	}

}
