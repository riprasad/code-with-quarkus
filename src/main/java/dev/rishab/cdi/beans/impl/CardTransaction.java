package dev.rishab.cdi.beans.impl;

import javax.enterprise.context.ApplicationScoped;

import dev.rishab.cdi.beans.Transaction;

@ApplicationScoped
@dev.rishab.cdi.annotations.Card // links the bean with the annotation
//@Payment(value = Mode.CARD) // links the bean with the annotation
public class CardTransaction implements Transaction {

	@Override
	public String pay() {
		return "Card Payment";
	}

}
