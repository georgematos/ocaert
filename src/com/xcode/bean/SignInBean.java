package com.xcode.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SignInBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5395203876658502703L;

	public String redirectUer() {
		return "uer/examreadiness.xhtml";
	}
	
	public String redirectAdmin() {
		return "admin.xhtml";
	}
	
}