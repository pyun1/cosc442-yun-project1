package edu.towson.cis.cosc442.project1.monopoly;

public class GoCell extends Cell {
	public GoCell() {
		super.setName("Go");
		setAvailable(false);
	}

	public Boolean playAction(String msg) {
		return Boolean.valueOf(msg);
	}
	
	void setName(String name) {
	}
}
