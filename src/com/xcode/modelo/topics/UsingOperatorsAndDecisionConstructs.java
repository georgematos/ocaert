package com.xcode.modelo.topics;

import java.io.Serializable;

import com.xcode.interfaces.ExamObjective;
import com.xcode.utils.Ratings;

public class UsingOperatorsAndDecisionConstructs implements ExamObjective,
		Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2684397010566419214L;

	private int uoadc31;
	private int uoadc32;
	private int uoadc33;
	private int uoadc34;
	private int uoadc35;

	@Override
	public int getReadiness() {
		return Ratings.upMaxHate(uoadc31, uoadc32, uoadc33, uoadc34, uoadc35);
	}

	public int getUoadc31() {
		return uoadc31;
	}

	public void setUoadc31(int uoadc31) {
		this.uoadc31 = uoadc31;
	}

	public int getUoadc32() {
		return uoadc32;
	}

	public void setUoadc32(int uoadc32) {
		this.uoadc32 = uoadc32;
	}

	public int getUoadc33() {
		return uoadc33;
	}

	public void setUoadc33(int uoadc33) {
		this.uoadc33 = uoadc33;
	}

	public int getUoadc34() {
		return uoadc34;
	}

	public void setUoadc34(int uoadc34) {
		this.uoadc34 = uoadc34;
	}

	public int getUoadc35() {
		return uoadc35;
	}

	public void setUoadc35(int uoadc35) {
		this.uoadc35 = uoadc35;
	}

}
