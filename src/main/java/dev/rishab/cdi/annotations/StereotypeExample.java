package dev.rishab.cdi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Stereotype;
import javax.inject.Named;
import javax.transaction.Transactional;

/**
 * All beans annotated with @StereotypeExample will have request scope, use
 * default EL naming, and have the interceptor bindings @Transactional
 * 
 * For more details about @Stereotype, visit
 * https://javaee.github.io/tutorial/cdi-adv008.html
 */
@Stereotype
@RequestScoped
@Transactional
@Named
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StereotypeExample {

}
