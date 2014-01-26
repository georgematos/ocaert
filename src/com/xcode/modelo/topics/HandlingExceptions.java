package com.xcode.modelo.topics;

import java.io.Serializable;
import com.xcode.interfaces.ExamObjective;
import com.xcode.utils.Ratings;

public class HandlingExceptions implements ExamObjective, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3915921928466050121L;

	private int he81;
	private int he82;
	private int he83;
	private int he84;
	private int he85;

	@Override
	public int getReadiness() {
		return Ratings.upMaxHate(he81, he82, he83, he84, he85);
	}

	public int getHe81() {
		return he81;
	}

	public void setHe81(int he81) {
		this.he81 = he81;
	}

	public int getHe82() {
		return he82;
	}

	public void setHe82(int he82) {
		this.he82 = he82;
	}

	public int getHe83() {
		return he83;
	}

	public void setHe83(int he83) {
		this.he83 = he83;
	}

	public int getHe84() {
		return he84;
	}

	public void setHe84(int he84) {
		this.he84 = he84;
	}

	public int getHe85() {
		return he85;
	}

	public void setHe85(int he85) {
		this.he85 = he85;
	}

}
