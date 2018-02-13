package edu.towson.cis.cosc442.project1.monopoly;

public class JailCell extends Cell {
	public static int BAIL = 50;
	public JailCell() {
		setName("Jail");
	}
	
	public Boolean playAction(String msg) {
		return Boolean.valueOf(msg);
	}

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
