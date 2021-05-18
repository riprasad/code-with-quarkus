package dev.rishab.cdi.beans.impl;

import javax.enterprise.context.ApplicationScoped;

import dev.rishab.cdi.annotations.Payment;
import dev.rishab.cdi.annotations.Payment.Mode;
import dev.rishab.cdi.beans.Transaction;

@ApplicationScoped
//@dev.rishab.cdi.annotations.Cash // links the bean with the annotation
@Payment(value = Mode.CASH) // links the bean with the annotation
public class CashTransaction implements Transaction {

	@Override
	public String pay() {
		return "Cash Payment";
	}

}
