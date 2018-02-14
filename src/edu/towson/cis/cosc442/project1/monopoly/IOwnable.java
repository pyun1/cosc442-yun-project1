package edu.towson.cis.cosc442.project1.monopoly;

// TODO: Auto-generated Javadoc
/**
 * The Interface IOwnable.
 */
public interface IOwnable {

	/**
	 * Gets the the owner.
	 *
	 * @return the the owner
	 */
	Player getTheOwner();
	
	/**
	 * Gets the pet owner.
	 *
	 * @return the pet owner
	 */
	Player getPetOwner();

	/**
	 * Sets the the owner.
	 *
	 * @param owner the new the owner
	 */
	void setTheOwner(Player owner);
	
	/**
	 * Sets the pet owner.
	 *
	 * @param petOwner the new pet owner
	 */
	void setPetOwner(Player petOwner);
}