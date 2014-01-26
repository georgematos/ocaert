package com.xcode.modelo.topics;

import java.io.Serializable;
import com.xcode.interfaces.ExamObjective;
import com.xcode.utils.Ratings;

public class JavaBasics implements ExamObjective, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8072533692927752421L;

	private int jb11;
	private int jb12;
	private int jb13;
	private int jb14;

	@Override
	public int getReadiness() {
		return Ratings.upMaxHate(jb11, jb12, jb13, jb14);
	}

	public int getJb11() {
		return jb11;
	}

	public void setJb11(int jb11) {
		this.jb11 = jb11;
	}

	public int getJb12() {
		return jb12;
	}

	public void setJb12(int jb12) {
		this.jb12 = jb12;
	}

	public int getJb13() {
		return jb13;
	}

	public void setJb13(int jb13) {
		this.jb13 = jb13;
	}

	public int getJb14() {
		return jb14;
	}

	public void setJb14(int jb14) {
		this.jb14 = jb14;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + jb11;
		result = prime * result + jb12;
		result = prime * result + jb13;
		result = prime * result + jb14;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaBasics other = (JavaBasics) obj;
		if (jb11 != other.jb11)
			return false;
		if (jb12 != other.jb12)
			return false;
		if (jb13 != other.jb13)
			return false;
		if (jb14 != other.jb14)
			return false;
		return true;
	}

}
