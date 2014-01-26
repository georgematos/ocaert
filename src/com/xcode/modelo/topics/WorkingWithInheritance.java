package com.xcode.modelo.topics;

import java.io.Serializable;

import com.xcode.interfaces.ExamObjective;
import com.xcode.utils.Ratings;

public class WorkingWithInheritance implements ExamObjective, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7987814314963029488L;

	private int wwi71;
	private int wwi72;
	private int wwi73;
	private int wwi74;
	private int wwi75;
	private int wwi76;

	@Override
	public int getReadiness() {
		return Ratings.upMaxHate(wwi71, wwi72, wwi73, wwi74, wwi75, wwi76);
	}

	public int getWwi71() {
		return wwi71;
	}

	public void setWwi71(int wwi71) {
		this.wwi71 = wwi71;
	}

	public int getWwi72() {
		return wwi72;
	}

	public void setWwi72(int wwi72) {
		this.wwi72 = wwi72;
	}

	public int getWwi73() {
		return wwi73;
	}

	public void setWwi73(int wwi73) {
		this.wwi73 = wwi73;
	}

	public int getWwi74() {
		return wwi74;
	}

	public void setWwi74(int wwi74) {
		this.wwi74 = wwi74;
	}

	public int getWwi75() {
		return wwi75;
	}

	public void setWwi75(int wwi75) {
		this.wwi75 = wwi75;
	}

	public int getWwi76() {
		return wwi76;
	}

	public void setWwi76(int wwi76) {
		this.wwi76 = wwi76;
	}

}
