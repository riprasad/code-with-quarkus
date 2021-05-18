package dev.rishab.cdi.scopes;

import javax.enterprise.context.Dependent;

@Dependent
public class DependentScope {

	public String getHashCode() {
		return this.hashCode() + " ";
	}
}
