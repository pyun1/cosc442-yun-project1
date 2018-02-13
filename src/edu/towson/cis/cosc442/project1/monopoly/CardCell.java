package edu.towson.cis.cosc442.project1.monopoly;

public class CardCell extends Cell {
    private int type;
	public CardCell(int type, String name) {
        setName(name);
        this.type = type;
    }
    
    public Boolean playAction(String msg) {
    	return Boolean.valueOf(msg);
    }
    
    public int getType() {
        return type;
    }

	public void playerMoved(Player player, int playerIndex, GameMaster gameMaster) {
		gameMaster.getGUI().setDrawCardEnabled(true);
	}
}
