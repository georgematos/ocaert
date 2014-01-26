package com.xcode.testes;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestaDatas {
	
	public static void main(String[] args) {
		
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.set(1983, 12-1, 10);
		
		Date data = dataNascimento.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(data);
		System.out.println(sdf.format(data));
		
	}

}
