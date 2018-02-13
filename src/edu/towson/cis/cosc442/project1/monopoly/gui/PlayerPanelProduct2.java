package edu.towson.cis.cosc442.project1.monopoly.gui;


import javax.swing.JButton;
import java.io.Serializable;

public class PlayerPanelProduct2 implements Serializable {
	private JButton btnDrawCard;

	public JButton getBtnDrawCard() {
		return btnDrawCard;
	}

	public void setBtnDrawCard(JButton btnDrawCard) {
		this.btnDrawCard = btnDrawCard;
	}

	public boolean isDrawCardButtonEnabled() {
		return btnDrawCard.isEnabled();
	}

	public void setDrawCardEnabled(boolean b) {
		btnDrawCard.setEnabled(b);
	}
}