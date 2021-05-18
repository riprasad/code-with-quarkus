package dev.rishab.cdi.scopes;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ApplicationScope {

	public String getHashCode() {
		return this.hashCode() + " ";
	}
}
