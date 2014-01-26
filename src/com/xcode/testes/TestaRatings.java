package com.xcode.testes;

import com.xcode.modelo.topics.JavaBasics;
import com.xcode.modelo.topics.UsingOperatorsAndDecisionConstructs;
import com.xcode.modelo.topics.WorkingWithInheritance;
import com.xcode.utils.Ratings;

public class TestaRatings {

	public static void main(String[] args) {
		
		JavaBasics jb = new JavaBasics();
		WorkingWithInheritance wwi = new WorkingWithInheritance();
		UsingOperatorsAndDecisionConstructs uoadc = new UsingOperatorsAndDecisionConstructs();
		
		jb.setJb13(2);
		jb.setJb11(2);
		jb.setJb14(1);
		
		wwi.setWwi71(2);
		wwi.setWwi73(3);
		wwi.setWwi75(1);
		
		uoadc.setUoadc32(3);
		uoadc.setUoadc31(4);
		
		int rating = Ratings.getRating(jb, wwi, uoadc);
		
		System.out.println(rating);
		
	}
	
}
