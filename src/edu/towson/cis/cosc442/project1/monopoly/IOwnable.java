package edu.towson.cis.cosc442.project1.monopoly;

public interface IOwnable {

	Player getTheOwner();
	Player getPetOwner();

	void setTheOwner(Player owner);
	void setPetOwner(Player petOwner);
}