
package edu.towson.cis.cosc442.project1.monopoly;

import junit.framework.TestCase;

public class PropertyCellTest extends TestCase {

	GameMaster gameMaster;
	
	protected void setUp() {
		gameMaster();
		gameMaster.setNumberOfPlayers(2);
	}

	private void gameMaster() {
		gameMaster = GameMaster.instance();
		gameMaster.setGameBoard(new SimpleGameBoard());
		gameMaster.reset();
		gameMaster.setGUI(new MockGUI());
	}
	
	public void testPlayerAction() {
		PropertyCell cell =
			(PropertyCell) gameMaster.getGameBoard().queryCell("Blue 3");
		int cellIndex = gameMaster.getGameBoard().queryCellIndex("Blue 3");
		gameMaster.movePlayer(0, cellIndex);
		gameMaster.getPlayer(0).purchase();
		gameMaster.switchTurn();
		gameMaster.movePlayer(1, cellIndex);
		cell.playAction(null);
		assertEquals(
				1500 - cell.getRent(),
				gameMaster.getPlayer(1).getMoney());
		assertEquals(
				1380 + cell.getRent(),
				gameMaster.getPlayer(0).getMoney());
	}
}
