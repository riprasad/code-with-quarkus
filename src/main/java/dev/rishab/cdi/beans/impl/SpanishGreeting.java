package dev.rishab.cdi.beans.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import dev.rishab.cdi.beans.Greeting;

@ApplicationScoped
@Named("Spanish")
public class SpanishGreeting implements Greeting {

	@Override
	public String greet() {
		return "Hola! Tenga un buen resto del día";
	}

}
