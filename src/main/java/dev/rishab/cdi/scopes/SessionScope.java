package dev.rishab.cdi.scopes;

import javax.enterprise.context.SessionScoped;

@SessionScoped	
public class SessionScope {

	public String getHashCode() {

		return this.hashCode() + " ";
	}

}
