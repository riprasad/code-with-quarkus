package dev.rishab.cdi.resource;

import java.text.MessageFormat;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.rishab.cdi.scopes.ApplicationScope;
import dev.rishab.cdi.scopes.DependentScope;
import dev.rishab.cdi.scopes.RequestScope;
import dev.rishab.cdi.scopes.SessionScope;

@Path("/scopes")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class ScopeResource {

	@Inject
	ApplicationScope applicationScope;

	@Inject
	DependentScope dependentScope;

	@Inject
	SessionScope sessionScope;

	@Inject
	RequestScope requestScope;

	@GET
	public String getHashCode() {
		return MessageFormat.format("Application Scope: {0}\nDependent Scope: {1}\nSession Scope: {2}\nRequest Scope: {3}",
				applicationScope.getHashCode(), dependentScope.getHashCode(), sessionScope.getHashCode(),
				requestScope.getHashCode());
	}

}
