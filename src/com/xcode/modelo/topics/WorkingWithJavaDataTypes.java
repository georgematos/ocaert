package com.xcode.modelo.topics;

import java.io.Serializable;

import com.xcode.interfaces.ExamObjective;
import com.xcode.utils.Ratings;

public class WorkingWithJavaDataTypes implements ExamObjective, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5456579023056888737L;

	private int wwjdt21;
	private int wwjdt22;
	private int wwjdt23;
	private int wwjdt24;
	private int wwjdt25;
	private int wwjdt26;
	private int wwjdt27;

	@Override
	public int getReadiness() {
		return Ratings.upMaxHate(wwjdt21, wwjdt22, wwjdt23, wwjdt24, wwjdt25,
				wwjdt26, wwjdt27);
	}

	public int getWwjdt21() {
		return wwjdt21;
	}

	public void setWwjdt21(int wwjdt21) {
		this.wwjdt21 = wwjdt21;
	}

	public int getWwjdt22() {
		return wwjdt22;
	}

	public void setWwjdt22(int wwjdt22) {
		this.wwjdt22 = wwjdt22;
	}

	public int getWwjdt23() {
		return wwjdt23;
	}

	public void setWwjdt23(int wwjdt23) {
		this.wwjdt23 = wwjdt23;
	}

	public int getWwjdt24() {
		return wwjdt24;
	}

	public void setWwjdt24(int wwjdt24) {
		this.wwjdt24 = wwjdt24;
	}

	public int getWwjdt25() {
		return wwjdt25;
	}

	public void setWwjdt25(int wwjdt25) {
		this.wwjdt25 = wwjdt25;
	}

	public int getWwjdt26() {
		return wwjdt26;
	}

	public void setWwjdt26(int wwjdt26) {
		this.wwjdt26 = wwjdt26;
	}

	public int getWwjdt27() {
		return wwjdt27;
	}

	public void setWwjdt27(int wwjdt27) {
		this.wwjdt27 = wwjdt27;
	}

}
