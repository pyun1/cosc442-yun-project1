package edu.towson.cis.cosc442.project1.monopoly;

import junit.framework.TestCase;

// TODO: Auto-generated Javadoc
/**
 * The Class GainMoneyCardTest.
 */
public class GainMoneyCardTest extends TestCase {
    
    /** The gain money card. */
    Card gainMoneyCard;
    
    /** The game master. */
    GameMaster gameMaster;

    /* (non-Javadoc)
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() {
		gameMaster();
		gameMaster.setNumberOfPlayers(1);
		gainMoneyCard = new MoneyCard("Get 50 dollars", 50, Card.TYPE_CC);
		gameMaster.getGameBoard().addCard(gainMoneyCard);
    }

	/**
	 * Game master.
	 */
	private void gameMaster() {
		gameMaster = GameMaster.instance();
		gameMaster.setGameBoard(new GameBoardCCGainMoney());
		gameMaster.reset();
		gameMaster.setGUI(new MockGUI());
	}
    
    /**
     * Test gain money card action.
     */
    public void testGainMoneyCardAction() {
        int origMoney = gameMaster.getCurrentPlayer().getMoney();
		Card card = gameMaster.drawCCCard();
		assertEquals(gainMoneyCard, card);
		card.applyAction();
		assertEquals(origMoney + 50, gameMaster.getCurrentPlayer().getMoney());
    }
    
    /**
     * Test gain money card UI.
     */
    public void testGainMoneyCardUI() {
        gameMaster.movePlayer(0, 1);
        assertTrue(gameMaster.getGUI().isDrawCardButtonEnabled());
        assertFalse(gameMaster.getGUI().isEndTurnButtonEnabled());
        gameMaster.btnDrawCardClicked();
        assertFalse(gameMaster.getGUI().isDrawCardButtonEnabled());
		assertTrue(gameMaster.getGUI().isEndTurnButtonEnabled());
    }
}
