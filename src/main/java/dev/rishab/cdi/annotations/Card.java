package dev.rishab.cdi.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.inject.Qualifier;

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
/**
 * target specifies where can we use this annotations
 * 
 * ElementType.FIELD specifies it can be used at the field level
 * ElementType.TYPE specifies it can be used at class level
 * ElementType.METHOD specifies it can be used at method level
 *
 */
@Target({ ElementType.FIELD, ElementType.TYPE, ElementType.METHOD , ElementType.PARAMETER})
public @interface Card {
}