package org.puc.rio.inf1636.hglm.war.model;

public class Card {
	CardType type;
	
	public Card(CardType type) {
		this.type = type;
	}

	public Card(int id) {
		this.type = CardType.getById(id);
	}

	public CardType getType() {
		return this.type;
	}
}
