package jvm;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

public class Bank {
	String name;
	String addess;
	@Override
	public boolean equals(Object o){
		return EqualsBuilder.reflectionEquals(this, o);
	}
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}
}
