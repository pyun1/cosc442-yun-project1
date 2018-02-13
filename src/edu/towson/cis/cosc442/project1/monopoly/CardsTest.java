package edu.towson.cis.cosc442.project1.monopoly;

import junit.framework.TestCase;

public class CardsTest extends TestCase {
    Card ccCard, chanceCard;
    
    GameMaster gameMaster;

    protected void setUp() {
        gameMaster();
		gameMaster.setNumberOfPlayers(1);
        ccCard = new MoneyCard("Get 50 dollars", 50, Card.TYPE_CC);
        chanceCard = new MoneyCard("Lose 50 dollars", -50, Card.TYPE_CHANCE);
        gameMaster.getGameBoard().addCard(ccCard);
    }

	private void gameMaster() {
		gameMaster = GameMaster.instance();
		gameMaster.setGameBoard(new GameBoardCCGainMoney());
		gameMaster.reset();
		gameMaster.setGUI(new MockGUI());
	}
    
    public void testCardType() {
        gameMaster.drawCCCard();
        assertEquals(Card.TYPE_CC, ccCard.getCardType());
        gameMaster.drawChanceCard();
        assertEquals(Card.TYPE_CHANCE, chanceCard.getCardType());
    }
}
