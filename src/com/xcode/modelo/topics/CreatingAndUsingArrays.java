package com.xcode.modelo.topics;

import java.io.Serializable;

import com.xcode.interfaces.ExamObjective;
import com.xcode.utils.Ratings;

public class CreatingAndUsingArrays implements ExamObjective, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5078761464995941120L;

	private int caua41;
	private int caua42;
	private int caua43;

	@Override
	public int getReadiness() {
		return Ratings.upMaxHate(caua41, caua42, caua43);
	}

	public int getCaua41() {
		return caua41;
	}

	public void setCaua41(int caua41) {
		this.caua41 = caua41;
	}

	public int getCaua42() {
		return caua42;
	}

	public void setCaua42(int caua42) {
		this.caua42 = caua42;
	}

	public int getCaua43() {
		return caua43;
	}

	public void setCaua43(int caua43) {
		this.caua43 = caua43;
	}

}
