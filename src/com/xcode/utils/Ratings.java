package com.xcode.utils;

import com.xcode.interfaces.ExamObjective;

public class Ratings {

	public static int getRating(ExamObjective... examObjective) {
	/**
	 * Retorna a nota total de todos os t�picos.
	 */
		
		int rating = 0;
		
		for(ExamObjective objective : examObjective) {
			
			rating += objective.getReadiness();
			
		}
		
		return rating;
		
	}

	public static int upMaxHate(int... rate) {
	/**
	 * Verifica todos o valor de todos os subt�picos e caso o valor for 3 soma + 1, retornando o rating total do t�pico.
	 */
		
		int rating = 0;
		
		for (int r : rate) {
			if(r == 3) {
				rating += r + 1;
			} else {
				rating += r;
			}
		}
		
		return rating;
		
	}
	
}
