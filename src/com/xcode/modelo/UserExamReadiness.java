package com.xcode.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.xcode.modelo.topics.CreatingAndUsingArrays;
import com.xcode.modelo.topics.HandlingExceptions;
import com.xcode.modelo.topics.JavaBasics;
import com.xcode.modelo.topics.UsingLoopConstructs;
import com.xcode.modelo.topics.UsingOperatorsAndDecisionConstructs;
import com.xcode.modelo.topics.WorkingWithInheritance;
import com.xcode.modelo.topics.WorkingWithJavaDataTypes;
import com.xcode.modelo.topics.WorkingWithMethodsAndEncapsulation;

@Entity
public class UserExamReadiness implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3805334267773403384L;

	// Cria uma referência de objeto para cada tópico

	@Id
	@GeneratedValue
	private Long uerId;
	private JavaBasics jb;
	private WorkingWithJavaDataTypes wwjdt;
	private UsingOperatorsAndDecisionConstructs uoadc;
	private CreatingAndUsingArrays caua;
	private UsingLoopConstructs ulc;
	private WorkingWithMethodsAndEncapsulation wwmae;
	private WorkingWithInheritance wwi;
	private HandlingExceptions he;
	private int rate;

	// Atribui uma instância de cada tópico(classe) à uma variável de
	// referência.
	public UserExamReadiness() {
		jb = new JavaBasics();
		wwjdt = new WorkingWithJavaDataTypes();
		uoadc = new UsingOperatorsAndDecisionConstructs();
		caua = new CreatingAndUsingArrays();
		ulc = new UsingLoopConstructs();
		wwmae = new WorkingWithMethodsAndEncapsulation();
		wwi = new WorkingWithInheritance();
		he = new HandlingExceptions();
	}

	public Long getUerId() {
		return uerId;
	}

	public void setUerId(Long uerId) {
		this.uerId = uerId;
	}

	public JavaBasics getJb() {
		return jb;
	}

	public void setJb(JavaBasics jb) {
		this.jb = jb;
	}

	public WorkingWithJavaDataTypes getWwjdt() {
		return wwjdt;
	}

	public void setWwjdt(WorkingWithJavaDataTypes wwjdt) {
		this.wwjdt = wwjdt;
	}

	public UsingOperatorsAndDecisionConstructs getUoadc() {
		return uoadc;
	}

	public void setUoadc(UsingOperatorsAndDecisionConstructs uoadc) {
		this.uoadc = uoadc;
	}

	public CreatingAndUsingArrays getCaua() {
		return caua;
	}

	public void setCaua(CreatingAndUsingArrays caua) {
		this.caua = caua;
	}

	public UsingLoopConstructs getUlc() {
		return ulc;
	}

	public void setUlc(UsingLoopConstructs ulc) {
		this.ulc = ulc;
	}

	public WorkingWithMethodsAndEncapsulation getWwmae() {
		return wwmae;
	}

	public void setWwmae(WorkingWithMethodsAndEncapsulation wwmae) {
		this.wwmae = wwmae;
	}

	public WorkingWithInheritance getWwi() {
		return wwi;
	}

	public void setWwi(WorkingWithInheritance wwi) {
		this.wwi = wwi;
	}

	public HandlingExceptions getHe() {
		return he;
	}

	public void setHe(HandlingExceptions he) {
		this.he = he;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

}
