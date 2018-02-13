package edu.towson.cis.cosc442.project1.monopoly;


import java.util.ArrayList;

public class GameBoardProduct2 {
	private GameBoardProduct gameBoardProduct = new GameBoardProduct();
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();

	public GameBoardProduct getGameBoardProduct() {
		return gameBoardProduct;
	}

	public ArrayList<Card> getCommunityChestCards() {
		return communityChestCards;
	}

	public Card drawCCCard() {
		Card card = (Card) communityChestCards.get(0);
		communityChestCards.remove(0);
		gameBoardProduct.addCard(card, this.communityChestCards);
		return card;
	}

	public void removeCards() {
		communityChestCards.clear();
	}
}