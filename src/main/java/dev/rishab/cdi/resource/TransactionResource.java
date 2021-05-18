package dev.rishab.cdi.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import dev.rishab.cdi.annotations.Card;
import dev.rishab.cdi.annotations.Cash;
import dev.rishab.cdi.annotations.Payment;
import dev.rishab.cdi.annotations.Payment.Mode;
import dev.rishab.cdi.beans.Transaction;

@Path("/transactions")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class TransactionResource {

	@Inject
	// @Cash
	@Payment(value = Mode.CASH)
	Transaction cash;

	@Inject
	@Card
	// @Payment(value = Mode.CARD)
	Transaction card;

	@GET
	@Path("/cash")
	public String payByCash() {
		return cash.pay();
	}

	@GET
	@Path("/card")
	public String payByCard() {
		return card.pay();
	}

}
