package edu.towson.cis.cosc442.project1.monopoly;

public class FreeParkingCell extends Cell {

	public FreeParkingCell() {
		setName("Free Parking");
	}

	public Boolean playAction(String msg) {
		return Boolean.valueOf(msg);
	}
}
