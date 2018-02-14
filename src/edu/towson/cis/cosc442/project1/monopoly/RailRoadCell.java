package edu.towson.cis.cosc442.project1.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Class RailRoadCell.
 */
public class RailRoadCell extends Cell {
	
	/** The base rent. */
	static private int baseRent;
	
	/** The color group. */
	static public String COLOR_GROUP = "RAILROAD";
	
	/** The price. */
	static private int price;

	/**
	 * Sets the base rent.
	 *
	 * @param baseRent the new base rent
	 */
	public static void setBaseRent(int baseRent) {
		RailRoadCell.baseRent = baseRent;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public static void setPrice(int price) {
		RailRoadCell.price = price;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#getPrice()
	 */
	public int getPrice() {
		return RailRoadCell.price;
	}

	/**
	 * Gets the rent.
	 *
	 * @return the rent
	 */
	public int getRent() {
		return RailRoadCell.baseRent * (int)Math.pow(2, theOwner.numberOfRR() - 1);
	}
	
	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playAction(java.lang.String)
	 */
	public Boolean playAction(String msg) {
		Player currentPlayer = currentPlayer();
		if(!isAvailable()) {
			if(theOwner != currentPlayer) {
				currentPlayer.payRentTo(theOwner, getRent());
			}
		}
		return Boolean.valueOf(msg);
	}

	/**
	 * Current player.
	 *
	 * @return the player
	 */
	private Player currentPlayer() {
		Player currentPlayer = null;
		if (!isAvailable()) {
			currentPlayer = GameMaster.instance().getCurrentPlayer();
		}
		return currentPlayer;
	}

	/* (non-Javadoc)
	 * @see edu.towson.cis.cosc442.project1.monopoly.Cell#playerMoved(edu.towson.cis.cosc442.project1.monopoly.Player, int, edu.towson.cis.cosc442.project1.monopoly.GameMaster)
	 */
	public void playerMoved(Player player, int playerIndex, GameMaster gameMaster) {
		if (this.isAvailable()) {
			int price = this.getPrice();
			if (price <= player.getMoney() && price > 0) {
				gameMaster.getGUI().enablePurchaseBtn(playerIndex);
			}
		}
		gameMaster.getGUI().enableEndTurnBtn(playerIndex);
	}
}
