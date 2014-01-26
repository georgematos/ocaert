package com.xcode.modelo.topics;

import java.io.Serializable;

import com.xcode.interfaces.ExamObjective;
import com.xcode.utils.Ratings;

public class WorkingWithMethodsAndEncapsulation implements ExamObjective,
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8783685966805964989L;

	private int wwmae61;
	private int wwmae62;
	private int wwmae63;
	private int wwmae64;
	private int wwmae65;
	private int wwmae66;
	private int wwmae67;
	private int wwmae68;

	@Override
	public int getReadiness() {
		return Ratings.upMaxHate(wwmae61, wwmae62, wwmae63, wwmae64, wwmae65,
				wwmae66, wwmae67, wwmae68);
	}

	public int getWwmae61() {
		return wwmae61;
	}

	public void setWwmae61(int wwmae61) {
		this.wwmae61 = wwmae61;
	}

	public int getWwmae62() {
		return wwmae62;
	}

	public void setWwmae62(int wwmae62) {
		this.wwmae62 = wwmae62;
	}

	public int getWwmae63() {
		return wwmae63;
	}

	public void setWwmae63(int wwmae63) {
		this.wwmae63 = wwmae63;
	}

	public int getWwmae64() {
		return wwmae64;
	}

	public void setWwmae64(int wwmae64) {
		this.wwmae64 = wwmae64;
	}

	public int getWwmae65() {
		return wwmae65;
	}

	public void setWwmae65(int wwmae65) {
		this.wwmae65 = wwmae65;
	}

	public int getWwmae66() {
		return wwmae66;
	}

	public void setWwmae66(int wwmae66) {
		this.wwmae66 = wwmae66;
	}

	public int getWwmae67() {
		return wwmae67;
	}

	public void setWwmae67(int wwmae67) {
		this.wwmae67 = wwmae67;
	}

	public int getWwmae68() {
		return wwmae68;
	}

	public void setWwmae68(int wwmae68) {
		this.wwmae68 = wwmae68;
	}

}
