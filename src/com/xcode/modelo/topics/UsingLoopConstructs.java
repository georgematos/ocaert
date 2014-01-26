package com.xcode.modelo.topics;

import java.io.Serializable;

import com.xcode.interfaces.ExamObjective;
import com.xcode.utils.Ratings;

public class UsingLoopConstructs implements ExamObjective, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -15790070799549890L;

	private int ulc51;
	private int ulc52;
	private int ulc53;
	private int ulc54;
	private int ulc55;

	@Override
	public int getReadiness() {
		return Ratings.upMaxHate(ulc51, ulc52, ulc53, ulc54, ulc55);
	}

	public int getUlc51() {
		return ulc51;
	}

	public void setUlc51(int ulc51) {
		this.ulc51 = ulc51;
	}

	public int getUlc52() {
		return ulc52;
	}

	public void setUlc52(int ulc52) {
		this.ulc52 = ulc52;
	}

	public int getUlc53() {
		return ulc53;
	}

	public void setUlc53(int ulc53) {
		this.ulc53 = ulc53;
	}

	public int getUlc54() {
		return ulc54;
	}

	public void setUlc54(int ulc54) {
		this.ulc54 = ulc54;
	}

	public int getUlc55() {
		return ulc55;
	}

	public void setUlc55(int ulc55) {
		this.ulc55 = ulc55;
	}

}
