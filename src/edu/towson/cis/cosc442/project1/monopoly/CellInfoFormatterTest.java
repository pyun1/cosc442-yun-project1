package edu.towson.cis.cosc442.project1.monopoly;

import edu.towson.cis.cosc442.project1.monopoly.gui.GoCellInfoFormatter;
import edu.towson.cis.cosc442.project1.monopoly.gui.InfoFormatter;
import junit.framework.TestCase;

// TODO: Auto-generated Javadoc
/**
 * The Class CellInfoFormatterTest.
 */
public class CellInfoFormatterTest extends TestCase {
    
    /**
     * Test go cell test.
     */
    public void testGoCellTest() {
        GoCell cell = new GoCell();
        String goLabel = GoCellInfoFormatter.GO_CELL_LABEL;
        assertEquals(goLabel, InfoFormatter.cellInfo(cell));
    }
    
    /**
     * Test property cell text.
     */
    public void testPropertyCellText() {
        PropertyCell cell = cell();
		String propertyName = "Blue 1";
        String propertyColor = "blue";
        Player p = p();
		String ownerName = "Owner1";
        int numHouses = 2;
        int propertyValue = 120;
        String propertyLabel = "<html><b><font color='" +
				propertyColor +"'>" + propertyName + "</font></b><br>" +
				"$" + propertyValue +
				"<br>Owner: " + ownerName +
				"<br>* " + numHouses +
				"</html>";
        cell.setName(propertyName);
        cell.setTheOwner(p);
        assertEquals(propertyLabel, InfoFormatter.cellInfo(cell));
    }

	/**
	 * Cell.
	 *
	 * @return the property cell
	 */
	private PropertyCell cell() {
		String propertyName = "Blue 1";
		String propertyColor = "blue";
		Player p = p();
		int numHouses = 2;
		int propertyValue = 120;
		PropertyCell cell = new PropertyCell();
		cell.setName(propertyName);
		cell.setPrice(propertyValue);
		cell.setColorGroup(propertyColor);
		cell.setTheOwner(p);
		cell.setNumHouses(numHouses);
		return cell;
	}

	/**
	 * P.
	 *
	 * @return the player
	 */
	private Player p() {
		String ownerName = "Owner1";
		Player p = new Player();
		p.setName(ownerName);
		return p;
	}
}
