package dev.rishab.cdi.beans.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import dev.rishab.cdi.beans.Greeting;

@ApplicationScoped
@Named("English") 
public class EnglishGreeting implements Greeting {

	@Override
	public String greet() {
		return "Hello! Have a good day ahead";
	}

}
