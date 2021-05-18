package dev.rishab.cdi.resource;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Any;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.rishab.cdi.beans.Greeting;

@Path("/greetings")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class GreetingResource {

	@Inject
	@Named("English")
	Greeting english;

	@Inject
	@Named("Spanish")
	Greeting spanish;

	@Inject
	@Any
	Instance<Greeting> greetings;

	@GET
	public List<String> greet() {
		List<String> greetingList = new ArrayList<>();
		for (Greeting greeting : greetings) {
			greetingList.add(greeting.greet());
		}
		return greetingList;
	}

	@GET
	@Path("/english/")
	public String greetInEnglish() {
		return english.greet();
	}

	@GET
	@Path("/spanish")
	public String greetInSpanish() {
		return spanish.greet();
	}

}
