package edu.towson.cis.cosc442.project1.monopoly;


import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class GameBoardProduct2.
 */
public class GameBoardProduct2 {
	
	/** The game board product. */
	private GameBoardProduct gameBoardProduct = new GameBoardProduct();
	
	/** The community chest cards. */
	private ArrayList<Card> communityChestCards = new ArrayList<Card>();

	/**
	 * Gets the game board product.
	 *
	 * @return the game board product
	 */
	public GameBoardProduct getGameBoardProduct() {
		return gameBoardProduct;
	}

	/**
	 * Gets the community chest cards.
	 *
	 * @return the community chest cards
	 */
	public ArrayList<Card> getCommunityChestCards() {
		return communityChestCards;
	}

	/**
	 * Draw CC card.
	 *
	 * @return the card
	 */
	public Card drawCCCard() {
		Card card = (Card) communityChestCards.get(0);
		communityChestCards.remove(0);
		gameBoardProduct.addCard(card, this.communityChestCards);
		return card;
	}

	/**
	 * Removes the cards.
	 */
	public void removeCards() {
		communityChestCards.clear();
	}
}